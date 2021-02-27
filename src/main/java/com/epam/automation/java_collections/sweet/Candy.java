package com.epam.automation.java_collections.sweet;

import com.epam.automation.java_collections.type.CandyType;

public class Candy extends Sweet {
    private CandyType type;

    public Candy(String name, int calories, int weight, int sugarContent, CandyType type) {
        super(name, calories, weight, sugarContent);
        this.type = type;
    }

    public Candy(CandyType type) {
        this.type = type;
    }

    public CandyType getType() {
        return type;
    }

    public void setType(CandyType type) {
        this.type = type;
    }

}
