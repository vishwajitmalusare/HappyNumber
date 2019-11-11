package com.thoughtworks.happynumbertest;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class HappyNumberTest {
    @Nested
    public class HappyEdgeCases {
        @Test
        void givenOneWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber one = new HappyNumber(1);

            assertEquals(true, one.isHappyNumberOrNot());
        }

        @Test
        void givenTenWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber ten = new HappyNumber(10);

            assertEquals(true, ten.isHappyNumberOrNot());
        }

        @Test
        void givenTwentyWhenCheckIsHappyNumberThenShouldNotBeHappyNumber() {
            HappyNumber twenty = new HappyNumber(20);
            assertEquals(false, twenty.isHappyNumberOrNot());
        }

        @Test
        void givenHundredWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber hundred = new HappyNumber(100);
            assertEquals(true,hundred.isHappyNumberOrNot());
        }

        @Test
        void givenTwelveWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber twelve = new HappyNumber(12);
            assertFalse(twelve.isHappyNumberOrNot());
        }

        @Test
        void givenTwentyFiveWhenCheckIsHappyNumberOrNotThenShouldBeHappyNumber() {
            HappyNumber terntyFive = new HappyNumber(25);
            assertFalse(terntyFive.isHappyNumberOrNot());
        }
    }
}
