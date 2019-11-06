package com.thoughtworks.happynumbertest;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {
    @Nested
    public class HappyEdgeCases {
        @Test
        void givenOneWhenCheckIsHappyNumberThenShouldBeHappyNumber() {
            HappyNumber one = new HappyNumber(1);

            assertEquals(true, one.isHappy(one));
        }

        @Test
        void givenTenCheckIsHappyNumberThenShouldBeHappyNumber(){
            HappyNumber ten = new HappyNumber(10);

            assertEquals(true,ten.isHappy(ten));
        }

    }
}
