package lesson6.fruits;

public class Pear extends Fruit{
    double pricePerKilo;




    @Override
    void printManufacturerInfo() {
        super.printManufacturerInfo();
        System.out.print("груша Made in country " + country + "\n");
    }


    @Override
    double price(double weight, double pricePerKilo) {
        this.weight = weight;
        this.pricePerKilo = pricePerKilo;
        double price = weight * pricePerKilo;
        System.out.println("цена груши равна " + price);
        return price;
    }
}
