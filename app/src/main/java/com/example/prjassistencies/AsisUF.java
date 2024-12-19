package com.example.prjassistencies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AsisUF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_asis_uf);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnMO7Details = findViewById(R.id.btnMO7Details);
        ImageButton btnMO8Details = findViewById(R.id.btnMO8Details);
        ImageButton btnUF4Details = findViewById(R.id.btnUF4Details);
        ImageButton btnUF3Details = findViewById(R.id.btnUF3Details);

        btnMO7Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AsisUF.this, asisPA.class);
                startActivity(intent);
            }
        });
        btnMO8Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AsisUF.this, asisPA.class);
                startActivity(intent);
            }
        });
        btnUF4Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AsisUF.this, asisPA.class);
                startActivity(intent);
            }
        });
        btnUF3Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AsisUF.this, asisPA.class);
                startActivity(intent);
            }
        });
    }
}