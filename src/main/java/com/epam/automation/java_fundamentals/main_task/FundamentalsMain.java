package com.epam.automation.java_fundamentals.main_task;

import com.epam.automation.java_fundamentals.main_task.exception.NameException;


public class FundamentalsMain {
    public static void main(String[] args) {
        //First task: "Greet user when entering their name through the command line"
        UserGreeting userGreeting = new UserGreeting();
        try {
            userGreeting.userGreeting();
        } catch (NameException e) {
            e.printStackTrace();
        }

        //Second task: "Display command line arguments in reverse order in the console window"
        args = new String[]{"one", "two", "three"};
        for (String s: args) {
           System.out.println("Normal: " + s);
        }
        DisplayArgumentsInReverseOrder argumentsInReverseOrder = new DisplayArgumentsInReverseOrder();
       argumentsInReverseOrder.displayArgumentsInReverseOrder(args);

        //Third task: "Print a given number of random numbers with and without a new line"
        PrintRandomNumbers randomNumbers = new PrintRandomNumbers();
        randomNumbers.printRandomNumbers();

        //Fourth task: "Enter integers as command line arguments, calculate their sum (product)
        // and print the result to the console"
        CalculateArguments calculateArguments = new CalculateArguments();
        calculateArguments.calculateArguments();

        //Fifth task: "Enter a number from 1 to 12. Output to the console the name of the month
        // corresponding to the given date. Check the correctness of entering numbers"
        SearchMonthByDate searchMonthByDate = new SearchMonthByDate();
        searchMonthByDate.searchMonthByDate();
    }
}
