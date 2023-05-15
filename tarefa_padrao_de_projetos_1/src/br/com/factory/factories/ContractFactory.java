package br.com.factory.factories;

import br.com.factory.Car;
import br.com.factory.Factory;
import br.com.factory.cars.Peugeot;
import br.com.factory.cars.Tesla;

public class ContractFactory extends Factory{

    @Override
    public Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new Peugeot(200, "Gas", "White");
        }else {
            return new Tesla(300, "Eletric", "Red");
        }
    }
}
