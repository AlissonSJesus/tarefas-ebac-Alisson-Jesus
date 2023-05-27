package br.com.ali.generics.cars;

import br.com.ali.generics.Car;

public class Fiat extends Car{

    public Fiat(String tires, String soundSystem, String engine) {
        super(tires, soundSystem, engine);
    }

    @Override
    public void transports() {
        System.out.println("The Fiat Mobi transports 5 people with a maximum speed of 160 km/h");
    }

    @Override
    public String toString() {
        return "Fiat Mobi: { tires: " + getTires()  + ",\nsoundSystem: " + getSoundSystem() + ",\nengine: " + getEngine() + "\n}";
    }
    
}
