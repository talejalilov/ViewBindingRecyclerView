package com.example.withviewbindingrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.withviewbindingrecyclerview.databinding.FoodLayoutBinding;

import java.util.ArrayList;

public class FoodBookAdapter extends RecyclerView.Adapter<FoodBookAdapter.FoodBookHolder> {

    ArrayList<FoodBook> foodBookList;
    Context mContext;

    public FoodBookAdapter(ArrayList<FoodBook> foodBookList,Context context) {
        this.foodBookList = foodBookList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public FoodBookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        FoodLayoutBinding foodLayoutBinding = FoodLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new FoodBookHolder(foodLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodBookHolder holder, int position) {

        holder.binding.textView.setText(foodBookList.get(position).getFoodName());
        holder.binding.imagePost.setImageResource(foodBookList.get(position).getSource());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,DetailActivity.class);
                Singleton singleton = Singleton.getInstance();
                singleton.setFoodBook(foodBookList.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return foodBookList.size();
    }

    public static class FoodBookHolder extends RecyclerView.ViewHolder{

        FoodLayoutBinding binding;

        public FoodBookHolder(FoodLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
