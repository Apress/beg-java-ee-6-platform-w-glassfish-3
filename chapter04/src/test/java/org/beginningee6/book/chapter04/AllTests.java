package org.beginningee6.book.chapter04;

import org.beginningee6.book.chapter04.ex01.Book01Test;
import org.beginningee6.book.chapter04.ex07.Customer07Test;
import org.beginningee6.book.chapter04.ex22.Caching22Test;
import org.beginningee6.book.chapter04.ex25.Queries25Test;
import org.beginningee6.book.chapter04.ex30.CriteriaAPI30Test;
import org.beginningee6.book.chapter04.ex35.Book35Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Book01Test.class,
        Customer07Test.class,
        Caching22Test.class,
        Queries25Test.class,
        CriteriaAPI30Test.class,
        Book35Test.class
})
public class AllTests {
}