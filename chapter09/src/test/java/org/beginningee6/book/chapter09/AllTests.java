package org.beginningee6.book.chapter09;

import org.beginningee6.book.chapter09.ex01.ItemEJB01Test;
import org.beginningee6.book.chapter09.ex03.ItemEJB03Test;
import org.beginningee6.book.chapter09.ex04.ItemEJB04Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ItemEJB01Test.class,
        ItemEJB03Test.class,
        ItemEJB04Test.class
})

public class AllTests {
}