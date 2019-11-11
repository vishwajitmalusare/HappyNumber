package com.thoughtworks.happynumbertest;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    private int number;

    public HappyNumber(int number) {
        this.number = number;
    }

    public boolean isHappyNumberOrNot() {
        List listOfAddedNumber = new ArrayList<>();
        List listOfNumbersSquare = new ArrayList();

        int additionOfSquareOfDigits = 0;

        List<Integer> additionOfSquaredDigit = addArrayElements(squareOfEachDigit(getDigitOfNumber(number)));
        for (int i=0;i<additionOfSquaredDigit.size();i++) {
            additionOfSquareOfDigits = additionOfSquaredDigit.get(i)+additionOfSquareOfDigits;
        }
        if(additionOfSquareOfDigits == 1){
            return true;
        }
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
        int additionOfSquareOfDigits=0;

        for (int i=0;i<numberDigit;i++) {
        int numberOne = squareOfDigits.get(i);
         additionOfSquareOfDigits = numberOne + additionOfSquareOfDigits;
        addedSquareNumbers.add(additionOfSquareOfDigits);
        }
        return addedSquareNumbers;
    }

        private List<Integer> squareOfEachDigit(List Digits) {
        List<Integer> allDigitInNumber = getDigitOfNumber(number);
        List<Integer> listOfNumbersSquare = new ArrayList<>();
        int numberDigit = getDigitOfNumber(number).size();
        for (int i = 0; i < numberDigit; i++) {
            int squareOfNumber = (int) Math.pow(allDigitInNumber.get(i),2);
            listOfNumbersSquare.add(squareOfNumber);
        }
        return listOfNumbersSquare;
    }
}
/*
*     public boolean check() {
        if (number == 1 || number == 10)
            return true;
        List<Integer> digit = getdigitsList(number);
        int sumOfSquare = getSumOfSquare(digit);
        if (sumOfSquare == 1) {
            return true;
        }
        this.number = sumOfSquare;
        digit = getdigitsList(number);
        sumOfSquare = getSumOfSquare(digit);
        if (sumOfSquare == 1) {
            return true;
        }
        this.number = sumOfSquare;
        digit = getdigitsList(number);
        sumOfSquare = getSumOfSquare(digit);
        if (sumOfSquare == 1) {
            return true;
        }
        this.number = sumOfSquare;
        digit = getdigitsList(number);
        sumOfSquare = getSumOfSquare(digit);
        if (sumOfSquare == 1 || sumOfSquare == 10 || sumOfSquare == 100) {
            return true;
        }
        return false;
    }



    private int getSumOfSquare(List<Integer> digit) {
        int sumOfSquare = 0;
        for (int i = 0; i < digit.size(); i++) {
            sumOfSquare = sumOfSquare + digit.get(i) * digit.get(i);
        }
        return sumOfSquare;
    }

    public static void main(String[] args) {
    }
}

* */