package com.epam.automation.java_collections.optional_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Action {
    public static String FILE_NAME = "C:\\automation\\src\\main\\resources\\string_data.txt";

    public void actionsWithFile() {
        List<String> stringData = new ArrayList<>();
        try {
            //stringData = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
            new BufferedReader(new FileReader(FILE_NAME)).lines().forEach(stringData::add);
            System.out.println("Print string_data: ");
            for (String all : stringData) {
                System.out.println(all);
            }
            System.out.println("Input lines from file, write to ArrayList. " +
                    "Sort the strings using the sort () method from the Collections class: ");
            Collections.sort(stringData);
            for (String all : stringData) {
                System.out.println(all);
            }
            System.out.println("Print string_data in reverse order: ");
            Collections.reverse(stringData);
            for (String all : stringData) {
                System.out.println(all);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}