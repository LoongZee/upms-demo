package com.loongzee.cms.web.mq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;


public class Producer {
    /**
     * nohup sh bin/mqnamesrv &
     * nohup sh bin/mqbroker -n localhost:9876 &
     *
     * sh bin/mqshutdown broker
     * sh bin/mqshutdown namesrv
     *
     * @param args
     */
    public static void main(String[] args) {
        DefaultMQProducer producer = new DefaultMQProducer("Producer");
        producer.setNamesrvAddr("127.0.0.1:9876");
        try {
            producer.start();
            long time = System.currentTimeMillis();
            System.out.println("开始：" + time);

            int a = 100000;

            for (int i = 1; i <= a; i++) {
                Message msg = new Message("PushTopic", "push", i + "", "Just for test.".getBytes());
                SendResult result = producer.send(msg);
                System.out.println("id:" + result.getMsgId() + " result:" + result.getSendStatus());
            }
            System.out.println("结束，消耗：" + (System.currentTimeMillis() - time));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.shutdown();
        }
    }

}
