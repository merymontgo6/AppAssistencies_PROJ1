/*package com.example.prjassistencies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.prjassistencies.R;
import com.example.prjassistencies.Assignment;
import java.util.List;

public class AssignmentAdapter extends RecyclerView.Adapter<AssignmentAdapter.AssignmentViewHolder> {
    private List<Assignment> assignments;

    public AssignmentAdapter(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    @NonNull
    @Override
    public AssignmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_assignatures, parent, false);
        return new AssignmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssignmentViewHolder holder, int position) {
        Assignment assignment = assignments.get(position);
        holder.bind(assignment);
    }

    @Override
    public int getItemCount() {
        return assignments.size();
    }

    static class AssignmentViewHolder extends RecyclerView.ViewHolder {
        private TextView titleText;
        private TextView descriptionText;
        private TextView timeText;
        private CheckBox[] checkboxes;

        public AssignmentViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.assignmentTitle);
            descriptionText = itemView.findViewById(R.id.assignmentDescription);
            timeText = itemView.findViewById(R.id.timeText);

            checkboxes = new CheckBox[]{
                    itemView.findViewById(R.id.checkbox1),
                    itemView.findViewById(R.id.checkbox2),
                    itemView.findViewById(R.id.checkbox3),
                    itemView.findViewById(R.id.checkbox4)
            };
        }

        public void bind(Assignment assignment) {
            titleText.setText(assignment.getCode());
            descriptionText.setText(assignment.getDescription());
            timeText.setText(assignment.getTimeSlot());

            for (int i = 0; i < checkboxes.length; i++) {
                final int index = i;
                checkboxes[i].setChecked(assignment.getCheckboxStates()[i]);
                checkboxes[i].setOnCheckedChangeListener((buttonView, isChecked) ->
                        assignment.setCheckboxState(index, isChecked));
            }
        }
    }
}*/