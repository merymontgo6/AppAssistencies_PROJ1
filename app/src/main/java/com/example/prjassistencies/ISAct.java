package com.example.prjassistencies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ISAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_isact);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Configura el botó "iniciSesioBoto" per redirigir a una altra activitat
        Button iniciSesioBoto = findViewById(R.id.loginButton);
        iniciSesioBoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigeix a la nova activitat "ISAct"
                Intent intent = new Intent(ISAct.this, PerfilUsuari.class);
                startActivity(intent);
            }
        });

        TextView forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView);
        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigeix a la nova activitat "CC"
                Intent intent = new Intent(ISAct.this, RecuperarContrasenya.class);
                startActivity(intent);
            }
        });
    }
}