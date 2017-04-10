package com.marquisblount.collector.models;

/**
 * Created by mlblount on 4/9/17.
 */
public class Dish{
  public enum Type {
    DIET, NORMAL, FAT
  }

  private Type type;
  private int calories;
  private String name;

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dish{" +
        "type=" + type +
        ", calories=" + calories +
        ", name='" + name + '\'' +
        '}';
  }
}
