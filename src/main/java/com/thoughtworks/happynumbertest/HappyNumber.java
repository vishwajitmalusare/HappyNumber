package com.thoughtworks.happynumbertest;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    private int number;

    public HappyNumber(int number) {
        this.number = number;
    }

    public boolean isHappyNumberOrNot() {

        List SadNumbers = new ArrayList<>();
        double AdditionOfSquare;
        for (int i = 0; i <= number; i++) {
            int unitDigit;
            int tenthDigit;
            unitDigit = number % 10;
            tenthDigit = number / 10;

            double unitDigitSquare = Math.pow(unitDigit, 2);
            double tenthDigitSquare = Math.pow(tenthDigit, 2);

             AdditionOfSquare = unitDigitSquare +tenthDigitSquare;
            if (AdditionOfSquare == 1) {
                return true;
            }
            SadNumbers.add(AdditionOfSquare);
        }
            return false;
        }
}
