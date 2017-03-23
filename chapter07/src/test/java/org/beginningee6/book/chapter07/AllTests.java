package org.beginningee6.book.chapter07;

import org.beginningee6.book.chapter07.ex01.ItemEJB01Test;
import org.beginningee6.book.chapter07.ex03.ShoppingCartEJB03Test;
import org.beginningee6.book.chapter07.ex04.Cache04Test;
import org.beginningee6.book.chapter07.ex04.CacheEJB04Test;
import org.beginningee6.book.chapter07.ex09.ItemEJB09Test;
import org.beginningee6.book.chapter07.ex12.ItemEJB12Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ItemEJB01Test.class,
        ShoppingCartEJB03Test.class,
        CacheEJB04Test.class,
        Cache04Test.class,
        ItemEJB09Test.class,
        ItemEJB12Test.class
})

public class AllTests {
}