package com.example.prjassistencies;
import java.util.Arrays;
import java.util.List;

public class NotisData {
    public static List<NotisModel> getSampleNotifications() {
        return Arrays.asList(
                new NotisModel(
                        "Actualització restricció",
                        "Description",
                        "9:41 AM"
                ),
                new NotisModel(
                        "Canvi de horaris",
                        "Description",
                        "9:41 AM"
                ),
                new NotisModel(
                        "Exemple de notificació",
                        "Description",
                        "9:41 AM"
                ),
                new NotisModel(
                        "Actualització restricció",
                        "Description",
                        "9:41 AM"
                ),
                new NotisModel(
                        "Canvi de horaris",
                        "Description",
                        "9:41 AM"
                )
        );
    }
}
