package com.thoughtworks.happynumbertest;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    private int number;

    public HappyNumber(int number) {
        this.number = number;
    }

    public boolean isHappyNumberOrNot() {

        int additionOfSquareOfDigits = 0;

        List<Integer> additionOfSquaredDigit = addArrayElements(squareOfEachDigit(getDigitOfNumber(number)));
        for (Integer integer : additionOfSquaredDigit) {
            additionOfSquareOfDigits = integer + additionOfSquareOfDigits;
        }
        if(additionOfSquareOfDigits == 1){
            return true;
        }
        for(Integer integer : additionOfSquaredDigit) additionOfSquareOfDigits = integer = additionOfSquareOfDigits;
        return false;
    }


    private List<Integer> getDigitOfNumber(int number) {
        List<Integer> digits = new ArrayList<>();
        while(number > 0) {
            int unitDigit = number % 10;
            number = number / 10;
            digits.add(unitDigit);
        }
        return digits;
    }

    private List<Integer> addArrayElements(List squareDigit) {

        List<Integer> allDigitInNumber = getDigitOfNumber(number);
        List<Integer> squareOfDigits = squareOfEachDigit(allDigitInNumber);
        List<Integer> addedSquareNumbers = new ArrayList<>();
        int numberDigit = allDigitInNumber.size();
        int additionOfSquareOfDigits = 0;

        int i=0;
        while (i<numberDigit) {
        int numberOne = squareOfDigits.get(i);
         additionOfSquareOfDigits = numberOne + additionOfSquareOfDigits;
        addedSquareNumbers.add(additionOfSquareOfDigits);
            i++;
        }
        return addedSquareNumbers;
    }

        private List<Integer> squareOfEachDigit(List Digits) {
        List<Integer> allDigitInNumber = getDigitOfNumber(number);
        List<Integer> listOfNumbersSquare = new ArrayList<>();
        int numberDigit = getDigitOfNumber(number).size();
            int i = 0;
            while (i < numberDigit) {
                int squareOfNumber = (int) Math.pow(allDigitInNumber.get(i),2);
                listOfNumbersSquare.add(squareOfNumber);
                i++;
            }
            return listOfNumbersSquare;
    }
}