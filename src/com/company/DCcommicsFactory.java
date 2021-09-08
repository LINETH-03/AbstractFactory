package com.company;

public class DCcommicsFactory implements AbstractFactory {
    @Override
    public Villano getVillano() {
        return new VillanoDC("WASON");
    }

    @Override
    public Heroe getHeroe() {
        return new HeroeDC("BATMAN");
    }
}
