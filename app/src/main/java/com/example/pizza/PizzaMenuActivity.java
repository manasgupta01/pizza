package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pizza.adapter.Pizza;
import com.example.pizza.adapter.PizzaAdapter;

import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
public class PizzaMenuActivity extends AppCompatActivity {


        private RecyclerView pizzaRecyclerView;
        private PizzaAdapter pizzaAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pizza_menu);

            pizzaRecyclerView = findViewById(R.id.pizzaRecyclerView);
            pizzaRecyclerView.setLayoutManager(new LinearLayoutManager(this));

            // Create a sample list of pizzas
            ArrayList<Pizza> pizzas = getPizzaList();

            pizzaAdapter = new PizzaAdapter(pizzas);
            pizzaRecyclerView.setAdapter(pizzaAdapter);
        }

        // Create a sample list of pizzas
        private ArrayList<Pizza> getPizzaList() {
            ArrayList<Pizza> pizzas = new ArrayList<>();

            // Add pizzas to the list
            pizzas.add(new Pizza("Margherita Pizza", "Classic Italian pizza with tomato sauce and mozzarella cheese."));
            pizzas.add(new Pizza("Pepperoni Pizza", "Delicious pizza topped with pepperoni slices and mozzarella cheese."));
            pizzas.add(new Pizza("BBQ Chicken Pizza", "Tangy barbecue sauce, grilled chicken, red onions, and cheddar cheese."));
            pizzas.add(new Pizza("Veggie Supreme Pizza", "A vegetarian delight with a variety of fresh vegetables."));
            pizzas.add(new Pizza("Hawaiian Pizza", "A tropical twist with ham, pineapple chunks, and mozzarella cheese."));
            pizzas.add(new Pizza("Meat Lovers Pizza", "Loaded with a combination of savory meats like pepperoni, sausage, and bacon."));

            return pizzas;
        }
    }
