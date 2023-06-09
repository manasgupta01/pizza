package com.example.pizza.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizza.R;
import com.example.pizza.adapter.Pizza;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder> {

    private ArrayList<Pizza> pizzas;

    public PizzaAdapter(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pizza, parent, false);
        return new PizzaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder holder, int position) {
        Pizza pizza = pizzas.get(position);
        holder.pizzaNameTextView.setText(pizza.getName());
        holder.pizzaDescriptionTextView.setText(pizza.getDescription());
    }

    @Override
    public int getItemCount() {
        return pizzas.size();
    }

    public static class PizzaViewHolder extends RecyclerView.ViewHolder {

        TextView pizzaNameTextView;
        TextView pizzaDescriptionTextView;

        public PizzaViewHolder(@NonNull View itemView) {
            super(itemView);
            pizzaNameTextView = itemView.findViewById(R.id.pizzaNameTextView);
            pizzaDescriptionTextView = itemView.findViewById(R.id.pizzaDescriptionTextView);
        }
    }
}
