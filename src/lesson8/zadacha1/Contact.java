package lesson8.zadacha1;

public class Contact {
    String name;
    String number;

//    public Contact(String name, String number) {
//        this.name = name;
//        this.number = number;
//    }


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
