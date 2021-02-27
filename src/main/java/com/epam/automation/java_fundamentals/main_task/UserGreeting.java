package com.epam.automation.java_fundamentals.main_task;

import com.epam.automation.java_fundamentals.main_task.exception.NameException;

import java.util.Scanner;

public class UserGreeting {
     void userGreeting() throws NameException {
        System.out.println("Print your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.matches("[a-zA-Z]{2,8}")){
            System.out.println("Hello " + name);
        }
        else {
            throw new NameException("It's not a name");
        }
    }
}
