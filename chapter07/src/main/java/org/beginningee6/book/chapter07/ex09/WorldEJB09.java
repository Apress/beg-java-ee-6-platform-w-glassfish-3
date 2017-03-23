package org.beginningee6.book.chapter07.ex09;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @author: Antonio
 */
@Stateless
public class WorldEJB09 {

    @EJB
    private ItemEJB09 itemEJB;

    public String sayWorld() {
        itemEJB.findBooks();
        return "World !!!!!!!!!!!!!!!";
    }
}
