package lesson6.fruits;

public class Pear extends Fruit{
    double pricePerKilo;
    String fruit;


//     fruit = "pear";


    @Override
    void printManufacturerInfo() {
        super.printManufacturerInfo();
    }

    @Override
    void price(double weight, double pricePerKilo) {
        this.weight = weight;
        this.pricePerKilo = pricePerKilo;
        double price = weight * pricePerKilo;
        System.out.println("цена груши равна " + price);
    }
}
