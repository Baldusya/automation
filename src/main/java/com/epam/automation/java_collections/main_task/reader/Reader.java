package com.epam.automation.java_collections.main_task.reader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    public static String FILE_NAME = "C:\\automation\\src\\main\\resources\\gift_data.txt";

    public void readFile() {
        List<String> giftData;
        try {
            giftData = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
            for (String all : giftData) {
                System.out.println(all);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
