package com.example.prjassistencies;

public class Alumne {
    private String nom;
    private String cognom;
    private String grup;
    private boolean[] assistencies;

    public Alumne(String nom, String cognom, String grup) {
        this.nom = nom;
        this.cognom = cognom;
        this.grup = grup;
        this.assistencies = new boolean[4];
    }

    // Getters i setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getCognom() { return cognom; }
    public void setCognom(String cognom) { this.cognom = cognom; }

    public String getGrup() { return grup; }
    public void setGrup(String grup) { this.grup = grup; }

    public boolean[] getAssistencies() { return assistencies; }
    public void setAssistencia(int index, boolean estat) {
        if (index >= 0 && index < 4) {
            assistencies[index] = estat;
        }
    }

    public String getNomComplet() {
        return nom + " " + cognom;
    }
}