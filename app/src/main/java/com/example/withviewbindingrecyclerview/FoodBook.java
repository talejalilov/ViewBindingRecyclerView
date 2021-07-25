package com.example.withviewbindingrecyclerview;

public class FoodBook {

    String foodName;
    int source;

    public FoodBook(String foodName, int source) {
        this.foodName = foodName;
        this.source = source;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getSource() {
        return source;
    }
}
