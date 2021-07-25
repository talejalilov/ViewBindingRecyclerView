package com.example.withviewbindingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.withviewbindingrecyclerview.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Singleton singleton  = Singleton.getInstance();
        FoodBook foodBook = singleton.getFoodBook();

        binding.imageView.setImageResource(foodBook.getSource());
        binding.textView2.setText(foodBook.getFoodName());
    }
}