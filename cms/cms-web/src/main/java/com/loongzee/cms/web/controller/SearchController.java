package com.loongzee.cms.web.controller;

import com.loongzee.cms.dao.model.CmsArticle;
import com.loongzee.cms.dao.model.CmsArticleExample;
import com.loongzee.cms.rpc.api.CmsArticleService;
import com.loongzee.common.base.BaseController;
import com.loongzee.common.util.Paginator;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: upms-demo
 * @description: 搜索控制器
 * @author: Loongzee
 * @create: 2019-04-18 17:20
 */
@Controller
@RequestMapping(value = "/search")
public class SearchController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);

    @Autowired
    private CmsArticleService cmsArticleService;

    @RequestMapping(value = "/{keyword}", method = RequestMethod.GET)
    public String index(@PathVariable("keyword") String keyword,
                        @RequestParam(required = false, defaultValue = "1", value = "page") int page,
                        @RequestParam(required = false, defaultValue = "orders", value = "sort") String sort,
                        @RequestParam(required = false, defaultValue = "desc", value = "order") String order,
                        HttpServletRequest request,
                        Model model) {
        // 该关键字文章列表
        int rows = 10;
        CmsArticleExample cmsArticleExample = new CmsArticleExample();
        cmsArticleExample.createCriteria()
                .andStatusEqualTo((byte) 1)
                .andTitleLike(keyword);
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            cmsArticleExample.setOrderByClause(sort + " " + order);
        }
        List<CmsArticle> articles = cmsArticleService.selectByExampleForOffsetPage(cmsArticleExample, (page - 1) * rows, rows);
        model.addAttribute("articles", articles);
        // 文章总数
        long total = cmsArticleService.countByExample(cmsArticleExample);
        // 分页
        Paginator paginator = new Paginator(total, page, rows, request);
        model.addAttribute("paginator", paginator);
        return thymeleaf("/search/index");
    }

}