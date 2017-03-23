package org.beginningee6.book.chapter14;

import org.beginningee6.book.chapter14.ex01.CardValidator01Test;
import org.beginningee6.book.chapter14.ex16.CardValidator16Test;
import org.beginningee6.book.chapter14.ex23.CardValidator23Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        CardValidator01Test.class,
        CardValidator16Test.class,
        CardValidator23Test.class
})
public class AllTests {
}