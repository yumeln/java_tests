package lesson6.auto.com.company.vehicles;

import lesson6.auto.com.company.details.Engine;
import lesson6.auto.com.company.professions.Driver;

public class SportCar  extends Car{
    double velocity;

    public SportCar(String brand, int klass, double weight, Driver driver, Engine engine, double velocity) {
        super(brand, klass, weight, driver, engine);
        this.velocity = velocity;
    }
}
