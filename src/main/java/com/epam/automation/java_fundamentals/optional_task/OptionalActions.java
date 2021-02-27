package com.epam.automation.java_fundamentals.optional_task;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalActions {

     void actionsWithNumbers(){
        int[] numberArray;
        int counter = 1;
        Scanner amountScanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?\n" +
                "Enter a number from 2 to 20 and press Enter:");
        int amount = amountScanner.nextInt();
        if (amount > 1 && amount <= 20){
            numberArray = new int[amount];
            System.out.println("Press Enter after each entered number");
            for (int i = 0; i < amount; i++) {
                System.out.println("Enter " + counter++ + " number: ");
                numberArray[i] = amountScanner.nextInt();
            }

            // Find the shortest and longest number. Print the found numbers and their length
            Arrays.sort(numberArray);
            System.out.println("The smallest number is " + numberArray[0]);
            System.out.println("The length of the smallest number is " + String.valueOf(numberArray[0]).length());
            System.out.println("The length of the largest number is " + String.valueOf(numberArray[numberArray.length - 1]).length());
            System.out.println("The largest number is " + numberArray[numberArray.length - 1]);

            // Print numbers in ascending order of their length values
            System.out.println("Numbers in ascending order - " + Arrays.toString(numberArray));

            // Print to the console those numbers whose length is less than the average length
            // for all numbers and also display the length

                }  else {
                System.out.println("The number you entered is out of scope");
            }
    }
}