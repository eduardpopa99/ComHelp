package com.example.comhelp;

public class Supermercat {

    private String nom;
    private String descripcio;
    private String carrer;

    Producte[] productes;

    public Supermercat(){}

    public Supermercat(String nom, String descripcio, String carrer, Producte[] productes) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.carrer = carrer;
        this.productes = productes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public void setProductes(Producte[] productes) {
        this.productes = productes;
    }

    public String getNom() {
        return nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public String getCarrer() {
        return carrer;
    }

    public Producte[] getProductes() {
        return productes;
    }
}
