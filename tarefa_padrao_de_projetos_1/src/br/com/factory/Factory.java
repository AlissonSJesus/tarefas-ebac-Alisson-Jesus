package br.com.factory;

public abstract class Factory {
    public Car create(String requestedGrade) {
        Car car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.startEngine();
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }
    public abstract Car retrieveCar(String requestedGrade);
}
