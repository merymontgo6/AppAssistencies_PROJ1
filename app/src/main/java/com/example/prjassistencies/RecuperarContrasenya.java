package com.example.prjassistencies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RecuperarContrasenya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recuperar_contrasenya);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button cancelarButton = findViewById(R.id.cancelarButton);
        cancelarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tanca l'activitat actual i torna a la pàgina anterior
                finish();
            }
        });

        Button canviarButton = findViewById(R.id.canviarButton);
        canviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecuperarContrasenya.this, RecuperarContrasenya2.class);
                startActivity(intent);
            }
        });
    }
}