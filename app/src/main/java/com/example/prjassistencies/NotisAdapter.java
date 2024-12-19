package com.example.prjassistencies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class NotisAdapter extends RecyclerView.Adapter<NotisAdapter.NotisViewHolder> {
    private List<NotisModel> notifications;
    private List<NotisModel> filteredNotifications;

    public NotisAdapter() {
        this.notifications = new ArrayList<>();
        this.filteredNotifications = new ArrayList<>();
    }

    @NonNull
    @Override
    public NotisViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notis, parent, false);
        return new NotisViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotisViewHolder holder, int position) {
        NotisModel notification = filteredNotifications.get(position);
        holder.bind(notification);
    }

    @Override
    public int getItemCount() {
        return filteredNotifications.size();
    }

    public void setNotifications(List<NotisModel> notifications) {
        this.notifications = notifications;
        this.filteredNotifications = new ArrayList<>(notifications);
        notifyDataSetChanged();
    }

    public void filter(String query) {
        filteredNotifications = NotisUtil.filterNotifications(notifications, query);
        notifyDataSetChanged();
    }

    static class NotisViewHolder extends RecyclerView.ViewHolder {
        private TextView titleText;
        private TextView descriptionText;
        private TextView timeText;

        public NotisViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.notificationTitle);
            descriptionText = itemView.findViewById(R.id.notificationDescription);
            timeText = itemView.findViewById(R.id.notificationTime);
        }

        public void bind(NotisModel notification) {
            titleText.setText(notification.getTitle() != null ? notification.getTitle() : "No Title");
            descriptionText.setText(notification.getDescription() != null ? notification.getDescription() : "No Description");
            timeText.setText(notification.getTime() != null ? notification.getTime() : "No Time");
        }
    }
}