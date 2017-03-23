package org.beginningee6.book.chapter07.ex12;

import org.beginningee6.book.chapter07.ex09.Book09;
import org.beginningee6.book.chapter07.ex09.CD09;

import javax.ejb.Remote;
import java.util.List;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public interface ItemRemote12 {

    // ======================================
    // =           Public Methods           =
    // ======================================
    List<Book12> findBooks();

    List<CD12> findCDs();

    Book12 findBookById(Long id);

    CD12 findCDById(Long id);

    Book12 createBook(Book12 book);

    CD12 createCD(CD12 cd);

    void deleteBook(Book12 book);

    void deleteCD(CD12 cd);

    Book12 updateBook(Book12 book);

    CD12 updateCD(CD12 cd);
}