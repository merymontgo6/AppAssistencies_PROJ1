package com.example.prjassistencies;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Alumnes extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AlumneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnes);

        // Inicialitzar RecyclerView
        recyclerView = findViewById(R.id.alumnesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Configurar adaptador amb dades d'exemple
        List<Alumne> alumnes = getAlumnesExemple();
        adapter = new AlumneAdapter(alumnes);
        recyclerView.setAdapter(adapter);
    }

    private List<Alumne> getAlumnesExemple() {
        List<Alumne> alumnes = new ArrayList<>();
        alumnes.add(new Alumne("Joan", "García", "DAM2"));
        alumnes.add(new Alumne("Maria", "Martínez", "DAM2"));
        alumnes.add(new Alumne("Pere", "López", "DAM2"));
        alumnes.add(new Alumne("Anna", "Ferrer", "DAM2"));
        alumnes.add(new Alumne("Jordi", "Puig", "DAM2"));
        alumnes.add(new Alumne("Laura", "Vila", "DAM2"));
        return alumnes;
    }
}