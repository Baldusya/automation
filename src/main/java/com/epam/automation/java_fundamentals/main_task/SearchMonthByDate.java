package com.epam.automation.java_fundamentals.main_task;

import java.time.Month;
import java.util.Scanner;

public class SearchMonthByDate {
     void searchMonthByDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12 to find the month by day: ");
        int number = scanner.nextInt();
        if (number > 0 && number < 13){
            System.out.println(number + " month is " + Month.of(number));
        } else {
            System.out.println("The number you entered is out of scope");
        }
        scanner.close();
    }
}
