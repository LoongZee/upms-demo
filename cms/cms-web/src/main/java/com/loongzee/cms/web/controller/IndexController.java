package com.loongzee.cms.web.controller;

import com.loongzee.cms.dao.model.*;
import com.loongzee.cms.rpc.api.CmsCategoryService;
import com.loongzee.cms.rpc.api.CmsMenuService;
import com.loongzee.cms.rpc.api.CmsSystemService;
import com.loongzee.cms.rpc.api.CmsTagService;
import com.loongzee.common.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @program: upms-demo
 * @description: 首页控制器
 * @author: Loongzee
 * @create: 2019-04-18 17:15
 */
@Controller
public class IndexController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private CmsMenuService cmsMenuService;

    @Autowired
    private CmsCategoryService cmsCategoryService;

    @Autowired
    private CmsTagService cmsTagService;

    @Autowired
    private CmsSystemService cmsSystemService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        // 所有系统
        CmsSystemExample cmsSystemExample = new CmsSystemExample();
        cmsSystemExample.setOrderByClause("orders asc");
        List<CmsSystem> systems = cmsSystemService.selectByExample(cmsSystemExample);
        model.addAttribute("systems", systems);
        // 所有类目
        CmsCategoryExample cmsCategoryExample = new CmsCategoryExample();
        cmsCategoryExample.setOrderByClause("orders asc");
        List<CmsCategory> categories = cmsCategoryService.selectByExample(cmsCategoryExample);
        model.addAttribute("categories", categories);
        // 所有标签
        CmsTagExample cmsTagExample = new CmsTagExample();
        cmsTagExample.setOrderByClause("orders asc");
        List<CmsTag> tags = cmsTagService.selectByExample(cmsTagExample);
        model.addAttribute("tags", tags);
        return thymeleaf("/index");
    }

}
