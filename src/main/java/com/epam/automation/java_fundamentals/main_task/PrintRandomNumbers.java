package com.epam.automation.java_fundamentals.main_task;

import java.util.Random;
import java.util.Scanner;

public class PrintRandomNumbers {

     void printRandomNumbers(){
            Scanner numberScanner = new Scanner(System.in);
            Scanner choiceScanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Print number of random numbers from 1 to 20: ");
            int count = numberScanner.nextInt();
            if (count > 0 && count <= 20){
                System.out.println("Do you want to output a given number " +
                        "of random numbers with a new line or not? (yes/no)");
                String choice = choiceScanner.nextLine();
            if (choice.equals("yes")){
                for (int i = 0; i < count; i++) {
                    System.out.println(random.nextInt());
                }
            }
            else if (choice.equals("no")){
                for (int i = 0; i < count; i++) {
                    System.out.print(random.nextInt() + " ");
                }
            }
            else {
                System.out.println("You must enter either yes or no");
            }
        } else {
            System.out.println("You must enter a number between 1 and 20");
        }
    }
}
