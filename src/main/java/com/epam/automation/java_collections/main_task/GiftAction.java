package com.epam.automation.java_collections.main_task;


import com.epam.automation.java_collections.main_task.sweet.Sweet;

public class GiftAction {

    public int countGiftWeight(Gift gift) {
        int giftWeight = 0;
        if (gift.getSweetList() != null) {
            for (int i = 0; i < gift.getSweetList().size(); i++) {
                giftWeight += gift.getSweetList().get(i).getWeight();
            }
        }
        return giftWeight;
    }

    public Sweet findSweetInInterval(Gift gift, int min, int max) {
        Sweet findSweet = new Sweet();
        if (gift.getSweetList() != null) {
            for (int i = 0; i < gift.getSweetList().size(); i++) {
                if (gift.getSweetList().get(i).getSugarContent() >= min && gift.getSweetList().get(i).getSugarContent() <= max) {
                    findSweet = gift.getSweetList().get(i);
                    break;
                }
            }
        }
        return findSweet;
    }
}
