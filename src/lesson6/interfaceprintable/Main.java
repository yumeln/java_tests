/*Определить интерфейс Printable, содержащий метод void print().
        Определить класс Book, реализующий интерфейс Printable.
        Определить класс Magazine, реализующий интерфейс Printable.
        Создать массив типа Printable, который будет содержать книги и журналы.
        В цикле пройти по массиву и вызвать метод print() для каждого объекта.
        Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
        Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.*/


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
