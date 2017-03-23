package org.beginningee6.book.chapter14.ex01;

import javax.jws.WebService;


/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@WebService
public class CardValidator01 {

    // ======================================
    // =           Public Methods           =
    // ======================================

    public boolean validate(CreditCard01 creditCard) {

        Character lastDigit = creditCard.getNumber().charAt(creditCard.getNumber().length() - 1);

        if (Integer.parseInt(lastDigit.toString()) % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}