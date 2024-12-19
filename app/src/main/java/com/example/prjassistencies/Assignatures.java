package com.example.prjassistencies;

public class Assignatures {
    private String titulo;
    private String desc;
    private String temps;
    private boolean checkbox1Checked;
    private boolean checkbox2Checked;
    private boolean checkbox3Checked;
    private boolean checkbox4Checked;

    public Assignatures(String titulo, String desc, String temps) {
        this.titulo = titulo;
        this.desc = desc;
        this.temps = temps;
    }

    // Getters and setters
    public String getTitulo() { return titulo; }
    public String getDesc() { return desc; }
    public String getTemps() { return temps; }

    public boolean isCheckbox1Checked() { return checkbox1Checked; }
    public void setCheckbox1Checked(boolean checked) { this.checkbox1Checked = checked; }

    public boolean isCheckbox2Checked() { return checkbox2Checked; }
    public void setCheckbox2Checked(boolean checked) { this.checkbox2Checked = checked; }

    public boolean isCheckbox3Checked() { return checkbox3Checked; }
    public void setCheckbox3Checked(boolean checked) { this.checkbox3Checked = checked; }

    public boolean isCheckbox4Checked() { return checkbox4Checked; }
    public void setCheckbox4Checked(boolean checked) { this.checkbox4Checked = checked; }
}
