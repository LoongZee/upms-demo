package com.loongzee.cms.web.mq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class Consumer {

    public static void main(String[] args) {
        DefaultMQPushConsumer consumer =
                new DefaultMQPushConsumer("PushConsumer");
        consumer.setNamesrvAddr("127.0.0.1:9876");
        try {
            //订阅PushTopic下Tag为push的消息
            consumer.subscribe("PushTopic", "push");
            //程序第一次启动从消息队列头取数据
            consumer.setConsumeFromWhere(
                    ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
            consumer.registerMessageListener(
                    new MessageListenerConcurrently() {
                        @Override
                        public ConsumeConcurrentlyStatus consumeMessage(
                                List<MessageExt> list,
                                ConsumeConcurrentlyContext context) {
                            Message msg = list.get(0);
                            System.out.println(msg.toString());
                            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                        }
                    }
            );
            consumer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
