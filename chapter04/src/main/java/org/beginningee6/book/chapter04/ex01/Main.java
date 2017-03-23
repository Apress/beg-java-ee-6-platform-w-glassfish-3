package org.beginningee6.book.chapter04.ex01;

import org.beginningee6.book.chapter04.Constants;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class Main {

    public static void main(String[] args) {

        // 1-Create an instance of the Book entity
        Book01 book = new Book01();
        book.setId(1234L);
        book.setTitle("The Hitchhiker's Guide to the Galaxy");
        book.setPrice(12.5F);
        book.setDescription("Science fiction comedy series created by Douglas Adams.");
        book.setIsbn("1-84023-742-2");
        book.setNbOfPage(354);
        book.setIllustrations(false);

        // 2-Get an entity manager and a transaction
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(Constants.PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        // 3-Persist the book to the database
        tx.begin();
        em.persist(book);
        tx.commit();

        // 4-Retrieve the book by its identifier
        book = em.find(Book01.class, 1234L);

        System.out.println(book);

        em.close();
        emf.close();
    }
}
