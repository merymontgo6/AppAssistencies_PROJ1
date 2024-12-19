package com.example.prjassistencies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.prjassistencies.R;
import com.example.prjassistencies.Alumne;
import java.util.List;

public class AlumneAdapter extends RecyclerView.Adapter<AlumneAdapter.AlumneViewHolder> {
    private List<Alumne> alumnes;

    public AlumneAdapter(List<Alumne> alumnes) {
        this.alumnes = alumnes;
    }

    @NonNull
    @Override
    public AlumneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_alumne, parent, false);
        return new AlumneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlumneViewHolder holder, int position) {
        Alumne alumne = alumnes.get(position);
        holder.bind(alumne);
    }

    @Override
    public int getItemCount() {
        return alumnes.size();
    }

    static class AlumneViewHolder extends RecyclerView.ViewHolder {
        private TextView nomText;
        private TextView grupText;
        private CheckBox[] checkboxes;

        public AlumneViewHolder(@NonNull View itemView) {
            super(itemView);
            nomText = itemView.findViewById(R.id.alumneNom);
            grupText = itemView.findViewById(R.id.alumneGrup);

            checkboxes = new CheckBox[]{
                    itemView.findViewById(R.id.assistencia1),
                    itemView.findViewById(R.id.assistencia2),
                    itemView.findViewById(R.id.assistencia3),
                    itemView.findViewById(R.id.assistencia4)
            };
        }

        public void bind(Alumne alumne) {
            nomText.setText(alumne.getNomComplet());
            grupText.setText(alumne.getGrup());

            for (int i = 0; i < checkboxes.length; i++) {
                final int index = i;
                checkboxes[i].setChecked(alumne.getAssistencies()[i]);
                checkboxes[i].setOnCheckedChangeListener((buttonView, isChecked) ->
                        alumne.setAssistencia(index, isChecked));
            }
        }
    }
}