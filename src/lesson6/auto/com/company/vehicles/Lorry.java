package lesson6.auto.com.company.vehicles;

import lesson6.auto.com.company.details.Engine;
import lesson6.auto.com.company.professions.Driver;

public class Lorry extends Car{
    double loadCapacity;

    public Lorry(String brand, int klass, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(brand, klass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }
}
