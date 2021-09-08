package com.company;

public abstract class Villano {
    private String NombreVillano;

    public Villano(String nombreVillano) {
        NombreVillano = nombreVillano;
    }

    public String getNombreVillano() {
        return NombreVillano;
    }

    public void setNombreVillano(String nombreVillano) {
        NombreVillano = nombreVillano;
    }
}
