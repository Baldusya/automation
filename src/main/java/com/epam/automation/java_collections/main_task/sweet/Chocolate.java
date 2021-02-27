package com.epam.automation.java_collections.main_task.sweet;

import com.epam.automation.java_collections.main_task.type.ChocolateType;

public class Chocolate extends Sweet {
  private ChocolateType type;

  public Chocolate(String name, int calories, int weight, int sugarContent, ChocolateType type) {
    super(name, calories, weight, sugarContent);
    this.type = type;
  }

  public Chocolate(ChocolateType type) {
    this.type = type;
  }

  public ChocolateType getType() {
    return type;
  }

  public void setType(ChocolateType type) {
    this.type = type;
  }


}
