package org.beginningee6.book.chapter08.ex03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

/**
 * @author: Antonio
 */
public class CustomerEJB03Test {

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

    @Test
    public void shouldCreateACustomer() throws Exception {

        // Looks up the EJB
        CustomerEJB03 customerEJB = (CustomerEJB03) ctx.lookup("java:global/classes/CustomerEJB03!org.beginningee6.book.chapter08.ex03.CustomerEJB03");

        Customer03 customer = new Customer03("John", "Smith", "jsmith@gmail.com", "1234565");
        customer = customerEJB.createCustomer(customer);
        assertNotNull("ID should not be null", customer.getId());
    }
}