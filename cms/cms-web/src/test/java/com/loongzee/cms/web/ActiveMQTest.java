package com.loongzee.cms.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * @program: upms-demo
 * @description:
 * @author: Loongzee
 * @create: 2019-04-19 15:56
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-activemq.xml", "classpath:applicationContext-threadpool.xml"})
public class ActiveMQTest {

    @Resource(name = "jmsQueueTemplate")
    public JmsTemplate jmsTemplate;

    @Resource(name = "defaultQueueDestination")
    public Destination destination;

    public void sendMessage(Destination destination, final String msg) {
        System.out.println("向队列" + destination.toString() + "发送了消息------------" + msg);
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
    public TextMessage receive(Destination destination) {
        TextMessage tm = (TextMessage) jmsTemplate.receive(destination);
        try {
            System.out.println("从队列" + destination.toString() + "收到了消息：\t"
                    + tm.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

        return tm;
    }


    @Test
    public void testSend() {
        sendMessage(destination,"lalalalala");
    }

    @Test
    public void testReceive() {
        receive(destination);
    }
}
