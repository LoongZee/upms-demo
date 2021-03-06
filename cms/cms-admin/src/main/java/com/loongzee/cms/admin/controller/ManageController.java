package com.loongzee.cms.admin.controller;

import com.loongzee.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: upms-demo
 * @description: 后台controller
 * @author: Loongzee
 * @create: 2019-04-16 17:17
 */
@Controller
@RequestMapping("/manage")
@Api(value = "后台控制器", description = "后台管理")
public class ManageController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManageController.class);

    /**
     * 后台首页
     * @return
     */
    @ApiOperation(value = "后台首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/index.jsp";
    }

}
