package org.beginningee6.book.chapter08;

import org.beginningee6.book.chapter08.ex01.CacheEJB01Test;
import org.beginningee6.book.chapter08.ex02.ShoppingCartEJB02Test;
import org.beginningee6.book.chapter08.ex03.CustomerEJB03Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CacheEJB01Test.class,
        ShoppingCartEJB02Test.class,
        CustomerEJB03Test.class
})
public class AllTests {
}