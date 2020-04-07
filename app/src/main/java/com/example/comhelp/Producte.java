package com.example.comhelp;

public class Producte {

    private String nom;
    private Double preu;

    public Producte(){}

    public Producte(String nom, Double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public Double getPreu() {
        return preu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }
}
