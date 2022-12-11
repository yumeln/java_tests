package lesson5.easy;

public class Flower {
    static int numberOfFlowers;

    String country;
    String manufacturer;
    int shelfLife;
    double price;

    public Flower(String country, String manufacturer, int shelfLife, double price) {
        this.country = country;
        this.manufacturer = manufacturer;
        this.shelfLife = shelfLife;
        this.price = price;

        numberOfFlowers++;
    }
}
