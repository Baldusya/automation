package com.epam.automation.java_collections.main_task;


import com.epam.automation.java_collections.main_task.sweet.Sweet;

import java.util.Arrays;
import java.util.List;

public class Gift {
    private List<Sweet> sweetList;

    public Gift(List<Sweet> sweetList) {
        this.sweetList = sweetList;
    }

    public Gift(Sweet... sweets) {
        this.sweetList = Arrays.asList(sweets);
    }

    public Gift(String name, int calories, int weight, int sugarContent) {
    }

    public List<Sweet> getSweetList() {
        return sweetList;
    }

    public void setSweetList(List<Sweet> sweetList) {
        this.sweetList = sweetList;
    }

    public void addSweets(Sweet sweet) {
        sweetList.add(sweet);
    }

    public void sortSweets() {
        sweetList.sort(Sweet::compareTo);
    }

    @Override
    public String toString() {
        int n = 0;
        StringBuilder str = new StringBuilder();
        while (n < sweetList.size()) {
            str.append((n < sweetList.size() - 1) ? sweetList.get(n).toString() + ", " : sweetList.get(n).toString());
            n++;
        }
        return "Gift{" +
                "sweetList=" + str +
                '}';
    }
}
