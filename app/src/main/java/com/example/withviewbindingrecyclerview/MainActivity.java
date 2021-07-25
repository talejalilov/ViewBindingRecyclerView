package com.example.withviewbindingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import com.example.withviewbindingrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<FoodBook> foodList;
    FoodBookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        foodList = new ArrayList<>();

        foodList.add(new FoodBook("BURGER",R.drawable.burger));
        foodList.add(new FoodBook("PIZZA",R.drawable.pizza_cat));
        foodList.add(new FoodBook("HotDog",R.drawable.cat_3));
        foodList.add(new FoodBook("COCA-COLA",R.drawable.cat_4));


        binding.recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        adapter = new FoodBookAdapter(foodList,this);
        binding.recyclerView.setAdapter(adapter);
    }
}