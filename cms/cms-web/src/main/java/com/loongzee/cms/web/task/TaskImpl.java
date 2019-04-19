package com.loongzee.cms.web.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: upms-demo
 * @description:
 * @author: Loongzee
 * @create: 2019-04-19 16:16
 */
@Component
public class TaskImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskImpl.class);

    @Scheduled(cron = "0/5 * * * * ?")
    public void test() {
        LOGGER.info("task_test");
    }
}
