package com.thoughtworks.happynumbertest;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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



    }
}
