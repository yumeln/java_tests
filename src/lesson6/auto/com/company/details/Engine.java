package lesson6.auto.com.company.details;

public class Engine {
    double power;
    String manufacturer;

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
