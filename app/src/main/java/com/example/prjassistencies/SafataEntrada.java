package com.example.prjassistencies;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class SafataEntrada extends AppCompatActivity {
    private NotisAdapter adapter;
    private RecyclerView recyclerView;
    private SearchView searchView;
    private TextView welcomeText;
    private TextView tornarButton, nextButton;

    private int currentPage = 1; // Pàgina inicial
    private static final int ITEMS_PER_PAGE = 10; // Nombre de notificacions per pàgina

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safata_entrada);

        initializeViews();
        setupRecyclerView();
        setupSearchView();
        setupPagination();
        loadNotifications(currentPage);
    }

    private void initializeViews() {
        recyclerView = findViewById(R.id.notificationsRecyclerView);
        searchView = findViewById(R.id.trobarView);
        welcomeText = findViewById(R.id.welcomeText);
        tornarButton = findViewById(R.id.tornarBoto);
        nextButton = findViewById(R.id.nextButton);

        setSupportActionBar(findViewById(R.id.toolbar));
    }

    private void setupRecyclerView() {
        adapter = new NotisAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void setupSearchView() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.filter(query); // Filtra notificacions pel text introduït
                return true;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.filter(newText); // Actualitza el filtre mentre escrius
                return true;
            }
        });
    }

    private void setupPagination() {
        tornarButton.setOnClickListener(v -> {
            if (currentPage > 1) {
                currentPage--;
                loadNotifications(currentPage);
            } else {
                Toast.makeText(this, "Ja ets a la primera pàgina", Toast.LENGTH_SHORT).show();
            }
        });
        nextButton.setOnClickListener(v -> {
            currentPage++;
            loadNotifications(currentPage);
        });
    }

    private void loadNotifications(int page) {
        List<NotisModel> allNotifications = NotisData.getSampleNotifications();
        if (allNotifications != null && !allNotifications.isEmpty()) {
            int startIndex = (page - 1) * ITEMS_PER_PAGE;
            int endIndex = Math.min(startIndex + ITEMS_PER_PAGE, allNotifications.size());

            if (startIndex < allNotifications.size()) {
                List<NotisModel> paginatedNotifications = allNotifications.subList(startIndex, endIndex);
                adapter.setNotifications(paginatedNotifications);
            } else {
                Toast.makeText(this, "No hi ha més notificacions", Toast.LENGTH_SHORT).show();
                currentPage--; // Torna a la pàgina anterior si no hi ha notificacions noves
            }
        } else {
            Log.d("SafataEntrada", "No notifications found.");
        }
    }
}
