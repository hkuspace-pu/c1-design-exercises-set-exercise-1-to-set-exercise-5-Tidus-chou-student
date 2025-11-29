package com.example.assessment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private List<FoodItem> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initFoodData();
        setupRecyclerView();
    }

    private void initFoodData() {
        foodList = new ArrayList<>();

        foodList.add(new FoodItem("Borscht", R.drawable.bor, 40.0));
        foodList.add(new FoodItem("Cream soup", R.drawable.creamsoup, 40.0));
        foodList.add(new FoodItem("onion soup", R.drawable.onionsoup, 40.0));
        foodList.add(new FoodItem("steak", R.drawable.steak, 98.0));
        foodList.add(new FoodItem("Lamb chops", R.drawable.lambchops, 80.0));
        foodList.add(new FoodItem("Pork Chop", R.drawable.porkchop, 80.0));
        foodList.add(new FoodItem("Roast chicken", R.drawable.roastchicken, 77.0));
        foodList.add(new FoodItem("lobster", R.drawable.lobster, 99.0));
        foodList.add(new FoodItem("Pudding", R.drawable.pudding, 50.0));
        foodList.add(new FoodItem("Pancake", R.drawable.pancake, 50.0));
        foodList.add(new FoodItem("Ice cream", R.drawable.icecream, 50.0));

    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);
    }
}