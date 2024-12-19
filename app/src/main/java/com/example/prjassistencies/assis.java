package com.example.prjassistencies;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class assis extends AppCompatActivity {
    ImageButton btnMO7Details, btnMO8Details, btnMO12Details, btnTutoriaDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assis);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnMO7Details = findViewById(R.id.btnMO7Details);
        btnMO8Details = findViewById(R.id.btnMO8Details);
        btnMO12Details = findViewById(R.id.btnMO12Details);
        btnTutoriaDetails = findViewById(R.id.btnTutoriaDetails);

        btnMO7Details.setOnClickListener(v -> openAsisUFActivity());
        btnMO8Details.setOnClickListener(v -> openAsisUFActivity());
        btnMO12Details.setOnClickListener(v -> openAsisUFActivity());
        btnTutoriaDetails.setOnClickListener(v -> openAsisUFActivity());
    }
    private void openAsisUFActivity() {
        Intent intent = new Intent(assis.this, AsisUF.class);
        startActivity(intent);
    }
}