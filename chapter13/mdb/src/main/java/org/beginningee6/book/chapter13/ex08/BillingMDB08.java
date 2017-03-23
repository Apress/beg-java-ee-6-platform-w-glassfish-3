package org.beginningee6.book.chapter13.ex08;

import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@MessageDriven(mappedName = "jms/javaee6/Topic")
public class BillingMDB08 implements MessageListener {

    // ======================================
    // =           Public Methods           =
    // ======================================

    public void onMessage(Message message) {
        TextMessage msg = (TextMessage) message;
        try {
            System.out.println("Message received: " + msg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}