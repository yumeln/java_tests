package lesson6.interfaceprintable;

public class Magazine implements Printable{
    @Override
    public void print() {
        System.out.println("журнал");
    }
}
