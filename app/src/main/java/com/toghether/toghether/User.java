package com.toghether.toghether;

public class User
{
    public String email ;
    public String password;
    public String nom ;
    public String prenom;
    public String poid;
    public String taille;
    public String sexe;
    public String pays;

    public User(String email, String password, String nom, String prenom, String poid, String taille, String sexe, String pays) {
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.poid = poid;
        this.taille = taille;
        this.sexe = sexe;
        this.pays = pays;
    }

    public User() {
    }
}
