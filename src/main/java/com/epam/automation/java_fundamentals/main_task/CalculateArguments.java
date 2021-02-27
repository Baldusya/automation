package com.epam.automation.java_fundamentals.main_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateArguments {
    void calculateArguments() {
        Scanner scanner = new Scanner(System.in);
        Scanner choiceScanner = new Scanner(System.in);
        Scanner integerScanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        int sum = 0;
        int op = 1;
        int counter = 1;
        System.out.println("How many integers from 2 to 10 do you want to enter (type the number): ");
        int count = scanner.nextInt();
        if (count > 1 && count <= 10) {
            System.out.println("Enter " + count + " whole numbers. After each entered integer, press \"Enter\"");
            for (int i = 0; i < count; i++) {
                int integer = integerScanner.nextInt();
                integerList.add(integer);
                System.out.println(counter++ + " integer - " + integer);
            }
            System.out.println("Enter what you want to do with the integers you just entered:" +
                    " sum or multiply numbers (type \"sum\" or \"op\")");
            String choice = choiceScanner.nextLine();
            if (choice.equals("sum")) {
                for (Integer i : integerList) {
                    sum += i;
                }
                System.out.println("The sum of the integers you entered is " + sum);
            } else if (choice.equals("op")) {
                for (Integer i : integerList) {
                    op *= i;
                }
                System.out.println(op);
            } else {
                System.out.println("You must enter either sum or op");
            }
        } else {
            System.out.println("The number you entered is out of scope");
        }
    }
}
