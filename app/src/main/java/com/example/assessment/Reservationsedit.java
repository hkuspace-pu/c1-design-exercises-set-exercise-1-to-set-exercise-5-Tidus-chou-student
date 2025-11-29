package com.example.assessment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Reservationsedit extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BookAdapter adapter;
    private List<BookItem> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservationsedit);
        initBookData();
        setupRecyclerView();
    }

    private void initBookData() {
        bookList = new ArrayList<>();

        bookList.add(new BookItem("Aberdeen", "3/12, 12:00", "member 3"));
        bookList.add(new BookItem("Mongkok", "12/12, 15:00", "member 6"));
        bookList.add(new BookItem("Central", "25/12, 20:00", "member 2"));

    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BookAdapter(bookList);
        recyclerView.setAdapter(adapter);
    }
}