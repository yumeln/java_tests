package lesson6.interfaceprintable;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Magazine magazine1 = new Magazine();


        Printable[] prints = new Printable[]{book1,book2,magazine1,book1};

        for (Printable print: prints) {
            print.print();
        }


    }
}
