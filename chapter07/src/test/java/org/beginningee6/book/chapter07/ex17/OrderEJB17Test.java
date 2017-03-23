package org.beginningee6.book.chapter07.ex17;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class OrderEJB17Test {

    // ======================================
    // =             Attributes             =
    // ======================================
    private static EJBContainer ec;
    private static Context ctx;

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

    @BeforeClass
    public static void initContainer() throws Exception {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put(EJBContainer.MODULES, new File("target/classes"));
        ec = EJBContainer.createEJBContainer(properties);
        ctx = ec.getContext();
    }

    @AfterClass
    public static void closeContainer() throws Exception {
        if (ec != null)
            ec.close();
    }

    // ======================================
    // =              Unit tests            =
    // ======================================

    @Test(timeout = 500)
    /**
     * Without the @Asynchronous annotation on the EJB, this tes would timeout and fail
     */
    public void shouldConvertThePriceOfAnItem() throws Exception {

        // Looks up the EJB with the no-interface view
        OrderEJB17 orderEJB = (OrderEJB17) ctx.lookup("java:global/classes/OrderEJB17");

        orderEJB.sendEmailOrderComplete(new Order17(), new Customer17());
    }
}