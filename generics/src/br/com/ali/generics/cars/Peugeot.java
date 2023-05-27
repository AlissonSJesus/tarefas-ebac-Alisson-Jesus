package br.com.ali.generics.cars;

import br.com.ali.generics.Car;

public class Peugeot extends Car {    

    public Peugeot(String tires, String soundSystem, String engine) {
        super(tires, soundSystem, engine);
    }

    @Override
    public void transports() {
        System.out.println("The Peugeot 3008 transports 5 people with a maximum speed of 200 km/h");
    }

    @Override
    public String toString() {
        return "Peugeot 3008: { tires: " + getTires()  + ",\nsoundSystem: " + getSoundSystem() + ",\nengine: " + getEngine() + "\n}";
    }
    
}
