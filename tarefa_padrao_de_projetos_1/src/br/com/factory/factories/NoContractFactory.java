package br.com.factory.factories;

import br.com.factory.Car;
import br.com.factory.Factory;
import br.com.factory.cars.Porsh;

public class NoContractFactory extends Factory {

    @Override
    public Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)) {
            return new Porsh(200, "Gas", "White");
        }else {
            return null;
        }
    }
    
}
