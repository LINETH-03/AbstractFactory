package com.company;

public class Main {

    public static void main(String[] args) {
	// BY: LINETH HERNANDEZ

        System.out.println("Franciquicia MARVEL");
        AbstractFactory FranquiciaMarvel= new MarvelFactory();
        System.out.println("El Heroe Marvel es: "+FranquiciaMarvel.getHeroe().getNombreHeroe());
        System.out.println("El Villano Marvel es: "+FranquiciaMarvel.getVillano().getNombreVillano());
        System.out.println("Franciquicia DC commics");
        AbstractFactory FranquiciaDC= new DCcommicsFactory();
        System.out.println("El Heroe DC es: "+FranquiciaDC.getHeroe().getNombreHeroe());
        System.out.println("El Villano DC es: "+FranquiciaDC.getVillano().getNombreVillano());

    }
}
