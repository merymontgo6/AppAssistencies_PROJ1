package com.example.prjassistencies;

public class NotisModel {
    private String title;
    private String descricio;
    private String temps;

    public NotisModel(String title, String description, String time) {
        this.title = title;
        this.descricio = description;
        this.temps = time;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return descricio;
    }

    public String getTime() {
        return temps;
    }
}