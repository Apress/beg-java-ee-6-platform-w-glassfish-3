package org.beginningee6.book.chapter07.ex09;

import javax.ejb.Local;
import java.util.List;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
//@Local
public interface ItemLocal09 {

    // ======================================
    // =           Public Methods           =
    // ======================================
    List<Book09> findBooks();

    List<CD09> findCDs();

    Book09 findBookById(Long id);

    CD09 findCDById(Long id);
}