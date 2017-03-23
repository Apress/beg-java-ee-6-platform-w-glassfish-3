package org.beginningee6.book.chapter15.ex10;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@Stateless
public class CustomerEJB10 {

    // ======================================
    // =             Attributes             =
    // ======================================

    @PersistenceContext(unitName = "chapter15PU")
    private EntityManager em;


    // ======================================
    // =           Public Methods           =
    // ======================================

    public List<Customer10> findAll() {
        return null;
    }
}