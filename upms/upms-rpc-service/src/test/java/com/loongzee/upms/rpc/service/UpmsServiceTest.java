package com.loongzee.upms.rpc.service;

import com.loongzee.upms.dao.mapper.UpmsUserMapper;
import com.loongzee.upms.dao.model.UpmsPermission;
import com.loongzee.upms.dao.model.UpmsPermissionExample;
import com.loongzee.upms.dao.model.UpmsUser;
import com.loongzee.upms.rpc.api.UpmsApiService;
import com.loongzee.upms.rpc.api.UpmsPermissionService;
import com.loongzee.upms.rpc.api.UpmsSystemService;
import com.loongzee.upms.rpc.api.UpmsUserService;
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
 * @description: TestService(使用前请将META-INF/spring/applicationContext.xml中的component-scan解注释)
 * @author: Loongzee
 * @create: 2019-04-08 14:58
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/applicationContext.xml",
        "classpath:META-INF/spring/applicationContext-jdbc.xml",
        "classpath:META-INF/spring/applicationContext-listener.xml"})
@Rollback(value=false)
@Transactional(transactionManager = "transactionManager")
public class UpmsServiceTest {

    @Autowired
    private UpmsSystemService upmsSystemService;

    @Autowired
    private UpmsUserService upmsUserService;

    @Autowired
    private UpmsPermissionService upmsPermissionService;

    @Autowired
    private UpmsApiService upmsApiService;

    @Test
    public void Textapi(){
        List<UpmsPermission> res = upmsApiService.selectUpmsPermissionByUpmsUserId(1);
        System.out.println(res.size());
    }


    @Test
    public void index() {
        UpmsUser upmsUser = new UpmsUser();
        upmsUser.setAvatar("");
        upmsUser.setCtime(System.currentTimeMillis());
        upmsUser.setEmail("");
        upmsUser.setLocked((byte) 0);
        upmsUser.setPassword("xxx");
        upmsUser.setPhone("");
        upmsUser.setRealname("zsz");
        upmsUser.setSex((byte) 1);
        upmsUser.setSalt("");
        upmsUser.setUsername("zsz");
        upmsUserService.insertSelective(upmsUser);
        System.out.println(upmsUser.getUserId());
    }

    @Test
    public void selectForPage() {
        // 根据条件，按页码+每页条数分页
        UpmsPermissionExample upmsPermissionExample = new UpmsPermissionExample();
        upmsPermissionExample.createCriteria()
                .andSystemIdEqualTo(1);
        List<UpmsPermission> upmsPermissions = upmsPermissionService.selectByExampleForStartPage(upmsPermissionExample, 2, 20);
        System.out.println(upmsPermissions.size());
        // 根据条件，按offset+limit分页
        upmsPermissionExample = new UpmsPermissionExample();
        upmsPermissionExample.createCriteria()
                .andSystemIdEqualTo(2);
        upmsPermissions = upmsPermissionService.selectByExampleForOffsetPage(upmsPermissionExample, 3, 5);
        System.out.println(upmsPermissions.size());
    }
}