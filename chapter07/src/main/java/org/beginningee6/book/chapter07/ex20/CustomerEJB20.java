package org.beginningee6.book.chapter07.ex20;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@Stateless
public class CustomerEJB20 {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Resource
    TimerService timerService;

    @PersistenceContext(unitName = "chapter07PU")
    private EntityManager em;


    // ======================================
    // =           Public Methods           =
    // ======================================

    public void createCustomer(Customer20 customer) {
        em.persist(customer);
        ScheduleExpression birthDay = new ScheduleExpression().dayOfMonth(customer.getBirthDay()).month(customer.getBirthMonth());
        timerService.createCalendarTimer(birthDay, new TimerConfig(customer, true));
    }

    @Timeout
    public void sendBirthdayEmail(Timer timer) {
        Customer20 customer = (Customer20) timer.getInfo();
        // ...
    }
}