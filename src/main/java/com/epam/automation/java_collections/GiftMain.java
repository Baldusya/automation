package com.epam.automation.java_collections;

import com.epam.automation.java_collections.reader.Reader;
import com.epam.automation.java_collections.sweet.Candy;
import com.epam.automation.java_collections.sweet.Sweet;
import com.epam.automation.java_collections.type.CandyType;
import com.epam.automation.java_collections.writer.Writer;

import java.util.ArrayList;
import java.util.List;

public class GiftMain {
    public static void main(String[] args) {
        Gift gift = new Gift();
        Writer writer = new Writer();
        Reader reader = new Reader();
        List<Sweet> sweetList = new ArrayList<>();
        sweetList.add(new Candy("Morozko", 31, 45, 10,
                CandyType.CARAMEL));
        sweetList.add(new Candy ("Kaplya", 22, 32, 11,
                CandyType.TOFFEE));
        gift.setSweetList(sweetList);
        writer.writeToFile(gift);
        reader.readFile();
    }
}
