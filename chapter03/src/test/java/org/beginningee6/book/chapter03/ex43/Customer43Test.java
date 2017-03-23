package org.beginningee6.book.chapter03.ex43;

import org.beginningee6.book.chapter03.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 *         Test class that creates a Customer18
 */
public class Customer43Test extends AbstractPersistentTest {

    // ======================================
    // =              Unit tests            =
    // ======================================
    @Test
    public void shouldCreateACustomerWithOneAddress() throws Exception {

        Customer43 customer = new Customer43("John", "Smith", "jsmith@gmail.com", "1234565");
        Address43 address = new Address43("65B Ritherdon Rd", "At James place", "London", "LDN", "7QE554", "UK");
        customer.setAddress(address);
        tx.begin();
        em.persist(customer);
        em.persist(address);
        tx.commit();
        assertNotNull("ID should not be null", customer.getId());

        customer = em.find(Customer43.class, customer.getId());
        assertNotNull("Address should not be null", customer.getAddress());
    }
}