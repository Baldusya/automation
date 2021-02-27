package com.epam.automation.java_collections.main_task.writer;


import com.epam.automation.java_collections.main_task.Gift;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static String FILE_NAME = "C:\\automation\\src\\main\\resources\\gift_data.txt";

    public void writeToFile(Gift gift) {
        FileWriter fileWriter;
        if (new File(FILE_NAME).isFile()) {
            try {
                fileWriter = new FileWriter(FILE_NAME);
                fileWriter.write(gift.toString());
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
