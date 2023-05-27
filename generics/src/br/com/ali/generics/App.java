package br.com.ali.generics;

import java.util.ArrayList;
import java.util.List;

import br.com.ali.generics.cars.Fiat;
import br.com.ali.generics.cars.Peugeot;

public class App {
    public static void main(String[] args) throws Exception {
        List<Car> carList = new ArrayList<Car>();

        Car peugeot = new Peugeot("Pirelli", "Panasonic", "THP 1.6");
        Car fiat = new Fiat("Godyear", "LG", "Evo Flex 1.0");

        carList.add(peugeot);
        carList.add(fiat);

        System.out.println(carList);
        peugeot.transports();
        fiat.transports();
    }
}
