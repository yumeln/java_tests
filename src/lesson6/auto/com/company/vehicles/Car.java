package lesson6.auto.com.company.vehicles;

import lesson6.auto.com.company.details.Engine;
import lesson6.auto.com.company.professions.Driver;

public class Car {
    String brand;
    int klass;
    double weight;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    Driver driver = new Driver();
    Engine engine = new Engine();

    public Car(String brand, int klass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.klass = klass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }


    @Override
    public String toString() {
        return "Car{" + "\n" +
                "brand = '" + brand + '\'' + "\n" +
                "klass = " + klass +"\n" +
                "weight = " + weight +"\n" +
                "driver = " + driver +"\n" +
                "engine = " + engine +"\n" +
                '}';
    }
}
