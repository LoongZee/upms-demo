package mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * @program: upms-demo
 * @description:
 * @author: Loongzee
 * @create: 2019-04-19 15:42
 */
public class ActiveProducer {

    @Resource(name = "jmsQueueTemplate")
    public JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, final String msg) {
        System.out.println("向队列" + destination.toString() + "发送了消息------------" + msg);
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }

    public static void main(String[] args) {

    }
}
