package com.thoughtworks.happynumbertest;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    private List<Integer> sadNumberes = new ArrayList<>();

    public boolean isHappyNumberOrNot(int number) {
        if (isSadNumber(number)) {
            return false;
        }
        int sum = sumOfDigitSquares(number);
        if (sum ==1) {
            return true;
        }
        sadNumberes.add(number);
        return isHappyNumberOrNot(sum);
    }

    private int sumOfDigitSquares(int number) {
        int sum = 0;
        while(number > 0) {
            int unitDigit = number % 10;
            sum = sum + (unitDigit * unitDigit);
            number = number /10;
        }
        return sum;
    }

    private boolean isSadNumber(int number) {
        return sadNumberes.contains(number);
    }
}
