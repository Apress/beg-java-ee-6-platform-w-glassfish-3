package org.beginningee6.book.chapter09.ex04;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class InventoryLevelTooLowException04 extends Exception {

    public InventoryLevelTooLowException04() {
    }

    public InventoryLevelTooLowException04(String message) {
        super(message);
    }
}