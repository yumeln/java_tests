package lesson6.fruits;

public abstract class Fruit {
    static String fruit;
    double weight;
    static int numberOfFruits;
    String country;


    public static String getFruit() {
        return fruit;
    }

    public static void setFruit(String fruit) {
        Fruit.fruit = fruit;
    }

    public Fruit() {
        numberOfFruits++;
    }

    void printManufacturerInfo() {
    }

    abstract void price(double weight, double pricePerKilo);


}
