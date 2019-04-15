package com.loongzee.cms.rpc.service;

import com.loongzee.cms.dao.model.CmsArticle;
import com.loongzee.cms.rpc.api.CmsArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: upms-demo
 * @description:
 * @author: Loongzee
 * @create: 2019-04-15 17:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-test.xml",
        "classpath:META-INF/spring/applicationContext-jdbc.xml",
        "classpath:META-INF/spring/applicationContext-listener.xml"})
@Rollback(value=false)
@Transactional(transactionManager = "transactionManager")
public class CmsServiceTest {

    @Autowired
    private CmsArticleService cmsArticleService;

    @Test
    public void testArtcileSetvice(){
        List<CmsArticle> res= cmsArticleService.selectCmsArticlesByCategoryId(1,0,4);
        System.out.println(res.toString());
    }

}
