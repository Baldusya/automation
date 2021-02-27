package com.epam.automation.java_collections.sweet;

import com.epam.automation.java_collections.type.MarshmallowType;

public class Marshmallow extends Sweet {
    private MarshmallowType type;

    public Marshmallow(String name, int calories, int weight, int sugarContent, MarshmallowType type) {
        super(name, calories, weight, sugarContent);
        this.type = type;
    }

    public Marshmallow(MarshmallowType type) {
        this.type = type;
    }

    public MarshmallowType getType() {
        return type;
    }

    public void setType(MarshmallowType type) {
        this.type = type;
    }
}
