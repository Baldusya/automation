package com.epam.automation.java_collections.reader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static String FILE_NAME = "data.txt";

    public void readFile() {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
            for (String all : list) {
                System.out.println(all);
            }
        } catch (IOException e) {
            System.out.println((e.toString()));
        }

    }
}
