package com.example.prjassistencies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotisUtil {
    public static List<NotisModel> filterNotifications(List<NotisModel> notifications, String query) {
        List<NotisModel> filteredList = new ArrayList<>();
        if (query == null || query.isEmpty()) {
            return notifications;  // Return all notifications if the query is empty
        }
        for (NotisModel notification : notifications) {
            if (notification.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    notification.getDescription().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(notification);
            }
        }
        return filteredList;
    }
}
