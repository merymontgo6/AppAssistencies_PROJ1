package com.example.prjassistencies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.List;

public class asisPA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_asis_pa);

        // Setup toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Setup adapter
        //adapter = new AssignaturesAdapter(assignatures);
        //recyclerView.setAdapter(adapter);

        // Setup pagination
        setupPagination();
    }

    private void setupPagination() {
        findViewById(R.id.tornarBoto).setOnClickListener(v -> {
            // Handle previous page
        });

        findViewById(R.id.nextButton).setOnClickListener(v -> {
            // Handle next page
        });
    }
}