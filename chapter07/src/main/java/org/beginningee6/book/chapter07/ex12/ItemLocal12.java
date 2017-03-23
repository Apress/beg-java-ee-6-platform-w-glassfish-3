package org.beginningee6.book.chapter07.ex12;

import org.beginningee6.book.chapter07.ex09.Book09;
import org.beginningee6.book.chapter07.ex09.CD09;

import javax.ejb.Local;
import java.util.List;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public interface ItemLocal12 {

    // ======================================
    // =           Public Methods           =
    // ======================================
    List<Book12> findBooks();

    List<CD12> findCDs();

    Book12 findBookById(Long id);

    CD12 findCDById(Long id);
}