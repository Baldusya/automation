package com.epam.automation.java_collections;

import com.epam.automation.java_collections.sweet.Candy;
import com.epam.automation.java_collections.sweet.Sweet;
import com.epam.automation.java_collections.type.CandyType;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;


public class GiftActionTest {
    private static GiftAction action;
    private static Sweet[] sweets;

    @BeforeClass
    public void setElements() {
        action = new GiftAction ();
        sweets = new Sweet[]{new Candy("Morozko", 31, 45, 10, CandyType.CARAMEL),
                new Candy ("Kaplya", 22, 32, 11, CandyType.TOFFEE)};
    }

    @NotNull
    @Contract(" -> new")
    @DataProvider(name = "dataForTestMakeGift")
    public static Object[][] dataForTestMakeGift() {
        return new Object[][]{{new Gift (new Candy[]{new Candy ("Kaplya", 22, 32, 11, CandyType.TOFFEE), new Candy ("Morozko", 31, 45, 10, CandyType.CARAMEL)}), 77},
                {new Gift (new Candy[]{new Candy ("Chups", 12, 10, 9, CandyType.LOLLIPOP)}), 10}};
    }

    @NotNull
    @Contract(" -> new")
    @DataProvider(name = "dataForFindSweetInInterval")
    public static Object[][] dataForFindSweetInInterval() {
        return new Object[][]{{new Gift (sweets[0], sweets[1]), 5, 10, sweets[0]},
                {new Gift (sweets[0], sweets[1]), 5, 10, sweets[0]}};
    }

    @NotNull
    @Contract(" -> new")
    @DataProvider
    public static Object[][] dataForSetSweet() {
        return new Object[][]{{new Gift (sweets[0], sweets[1]).getSweetList (), 2},
                {new Gift (sweets[0]).getSweetList (), 1}};
    }

    @NotNull
    @Contract(" -> new")
    @DataProvider
    public static Object[][] dataForGetSweet() {
        return new Object[][]{{new Gift (sweets[0], sweets[1]), 2},
                {new Gift (sweets[0]), 1}};
    }


    @Test(dataProvider = "dataForTestMakeGift")
    public void testMakeGift(Gift gift, int expected) {
        Assert.assertEquals (action.countGiftWeight (gift), expected);
    }

    @Test(dataProvider = "dataForFindSweetInInterval")
    public void testFindSweetInInterval(Gift gift, int min, int max, Sweet expected) {
            Sweet actual = action.findSweetInInterval (gift, min, max);
            Assert.assertEquals (expected, actual);
    }

    @Test(dataProvider = "dataForSetSweet")
    public void testForSetSweet(List<Sweet> sweetList, int expected) {
        Gift gift = new Gift ();
        gift.setSweetList (sweetList);
        Assert.assertEquals (gift.getSweetList ().size (), expected);
    }

    @Test(dataProvider = "dataForGetSweet")
    public void testForGetSweet(@NotNull Gift gift, int expected) {
        Assert.assertEquals (gift.getSweetList ().size (), expected);
    }
}
