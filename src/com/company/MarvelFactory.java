package com.company;



public class MarvelFactory implements AbstractFactory {
    @Override
    public Villano getVillano() {
        return new VillanoMarvel("THANOS");
    }

    @Override
    public Heroe getHeroe() {
        return new HeroeMarvel("IRONMAN");
    }
}
