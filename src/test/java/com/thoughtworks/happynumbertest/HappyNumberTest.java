package com.thoughtworks.happynumbertest;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class HappyNumberTest {
        @Test
        void givenOneWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber one = new HappyNumber();

            assertEquals(true, one.isHappyNumberOrNot(1));
        }

        @Test
        void givenTenWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber ten = new HappyNumber();

            assertEquals(true, ten.isHappyNumberOrNot(10));
        }

        @Test
        void givenTwentyWhenCheckIsHappyNumberThenShouldNotBeHappyNumber() {
            HappyNumber twenty = new HappyNumber();
            assertEquals(false, twenty.isHappyNumberOrNot(20));
        }

        @Test
        void givenHundredWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber hundred = new HappyNumber();
            assertEquals(true,hundred.isHappyNumberOrNot(100));
        }

        @Test
        void givenTwelveWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber twelve = new HappyNumber();
            assertFalse(twelve.isHappyNumberOrNot(12));
        }

        @Test
        void givenTwentyFiveWhenCheckIsHappyNumberOrNotThenShouldBeHappyNumber() {
            HappyNumber twentyFive = new HappyNumber();
            assertFalse(twentyFive.isHappyNumberOrNot(25));
        }
    }
