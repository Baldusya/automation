package com.epam.automation.java_fundamentals.main_task;

public class DisplayArgumentsInReverseOrder {
    void displayArgumentsInReverseOrder(String[] args) {
        if (args.length > 0) {
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.println("Reverse: " + args[i]);
            }
        }
    }
}
