/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String firstString = input.nextLine();
        double firstNumber = Double.parseDouble(firstString);

        System.out.print("What is the second number? ");
        String secondString = input.nextLine();
        double secondNumber = Double.parseDouble(secondString);

        double sum = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiply = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        String outputString = (firstNumber + " + " + secondNumber + " = " + sum + "\n" +
                               firstNumber + " - " + secondNumber + " = " + subtraction + "\n" +
                               firstNumber + " * " + secondNumber + " = " + multiply + "\n" +
                               firstNumber + " / " + secondNumber + " = " + division + "\n");

        System.out.println(outputString);
    }
}
