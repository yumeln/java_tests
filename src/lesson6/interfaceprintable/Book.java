package lesson6.interfaceprintable;

public class Book implements Printable{
    @Override
    public void print() {
        System.out.println("книга");
    }
}
