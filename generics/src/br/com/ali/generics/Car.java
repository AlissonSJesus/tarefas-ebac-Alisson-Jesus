package br.com.ali.generics;

public abstract class Car {
    private String tires;
    private String soundSystem;
    private String engine;

    public Car(String tires, String soundSystem, String engine) {
        this.tires = tires;
        this.soundSystem = soundSystem;
        this.engine = engine;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(String soundSystem) {
        this.soundSystem = soundSystem;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public abstract void transports();
}