package com.toghether.toghether;

/**
 * Created by acer on 26/10/2018.
 */

public class BadHabit {
    private String nom;
    private Float argent;
    private Float temps;
    private int Defite;

    public BadHabit(String nom, Float argent, Float temps, int defite) {
        this.nom = nom;
        this.argent = argent;
        this.temps = temps;
        Defite = defite;
    }

    public BadHabit() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getArgent() {
        return argent;
    }

    public void setArgent(Float argent) {
        this.argent = argent;
    }

    public Float getTemps() {
        return temps;
    }

    public void setTemps(Float temps) {
        this.temps = temps;
    }

    public int getDefite() {
        return Defite;
    }

    public void setDefite(int defite) {
        Defite = defite;
    }
}
