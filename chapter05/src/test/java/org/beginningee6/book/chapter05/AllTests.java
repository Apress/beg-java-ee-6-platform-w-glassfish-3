package org.beginningee6.book.chapter05;

import org.beginningee6.book.chapter05.ex00.Customer00Test;
import org.beginningee6.book.chapter05.ex01.Customer01Test;
import org.beginningee6.book.chapter05.ex02.Customer02Test;
import org.beginningee6.book.chapter05.ex05.Customer05Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Customer00Test.class,
        Customer01Test.class,
        Customer02Test.class,
        Customer05Test.class
})

public class AllTests {
}