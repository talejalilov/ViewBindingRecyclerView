package com.example.withviewbindingrecyclerview;

import java.util.ArrayList;

public class Singleton {

    private FoodBook foodBook;
    private static Singleton singleton;

    public Singleton() {

    }

    public FoodBook getFoodBook() {
        return foodBook;
    }

    public void setFoodBook(FoodBook foodBook) {
        this.foodBook = foodBook;
    }

    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
