package com.example.prjassistencies;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import com.example.prjassistencies.AssignmentAdapter;
//import com.example.prjassistencies.Assignment;
import java.util.ArrayList;
import java.util.List;

public class allAssistencies extends AppCompatActivity {
    private RecyclerView recyclerView;
    //private AssignmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_assistencies);

        // Initialize RecyclerView
        recyclerView = new RecyclerView(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Add RecyclerView to the main layout
        androidx.constraintlayout.widget.ConstraintLayout mainLayout = findViewById(R.id.main);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout =
                (androidx.constraintlayout.widget.ConstraintLayout) mainLayout.getChildAt(0);

        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams params =
                new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.MATCH_PARENT,
                        0
                );

        params.topToBottom = R.id.welcomeText;
        params.bottomToTop = R.id.paginationLayout;
        params.startToStart = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.PARENT_ID;
        params.endToEnd = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.PARENT_ID;

        recyclerView.setLayoutParams(params);
        constraintLayout.addView(recyclerView);

        // Set up adapter with sample data
        /*List<Assignment> assignments = getSampleAssignments();
        adapter = new AssignmentAdapter(assignments);
        recyclerView.setAdapter(adapter);*/
    }

    /*private List<Assignment> getSampleAssignments() {
        List<Assignment> assignments = new ArrayList<>();
        assignments.add(new Assignment("MO6 · UF1", "Menu description.", "14.30\n16.30"));
        assignments.add(new Assignment("MO7 · UF1", "Menu description.", "14.30\n16.30"));
        assignments.add(new Assignment("MO8 · UF1", "Menu description.", "14.30\n16.30"));
        assignments.add(new Assignment("M12 · UF1", "Menu description.", "14.30\n16.30"));
        assignments.add(new Assignment("Tutoria", "Menu description.", "14.30\n16.30"));
        assignments.add(new Assignment("Projecte", "Menu description.", "14.30\n16.30"));
        return assignments;
    }*/
}