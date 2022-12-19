package lesson6.fruits;

public class Apple extends Fruit{
    double pricePerKilo;

    public Apple(String fruit) {
        this.fruit = fruit;
    }

    String fruit = "Яблоко ";
    public Apple() {
//        super();
    }

    public Apple(double weight, String country) {
        this.weight = weight;
        this.country = country;
    }

    @Override
    void printManufacturerInfo() {
        super.printManufacturerInfo();
        System.out.print(fruit + "Made in country " + country + "\n");

    }

    @Override
    void price(double weight, double pricePerKilo) {
        this.weight = weight;
        this.pricePerKilo = pricePerKilo;
        double price = weight * pricePerKilo;
        System.out.println("цена яблока равна " + price);
    }

}
