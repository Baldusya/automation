package com.epam.automation.java_collections.sweet;

import com.epam.automation.java_collections.type.CandyType;

public class Sweet implements Comparable<Sweet> {
    private String name;
    private int calories;
    private int weight;
    private int sugarContent;

    public Sweet(String name, int calories, int weight, int sugarContent) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public Sweet(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", weight=" + weight +
                ", sugarContent=" + sugarContent +
                '}';
    }

    public int compareTo(Sweet o) {
        return getCalories() - o.getCalories();
    }

}
