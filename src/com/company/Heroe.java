package com.company;

public abstract class Heroe {
    private String NombreHeroe;

    public Heroe(String nombreHeroe) {
        NombreHeroe = nombreHeroe;
    }

    public String getNombreHeroe() {
        return NombreHeroe;
    }

    public void setNombreHeroe(String nombreHeroe) {
        NombreHeroe = nombreHeroe;
    }
}
