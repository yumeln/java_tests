/*Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
        Класс Фрукт содержит:
        а) переменную вес,
        б) завершенный метод printManufacturerInfo(){System.out.print("Made in ");}
        в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
         Метод должен учитывать вес фрукта.
        Создать несколько объектов разных классов.
        Подсчитать общую стоимость проданных фруктов.
        А также общую стоимость отдельно проданных яблок, груш и абрикос.*/


package lesson6.fruits;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Pear pear = new Pear();
        apple.price(34,45);
        pear.price(1.2,4.4);
        Fruit apple2 = new Apple(2.4, "Такой-то");
        Apple apple3 = new Apple(3,"jkhgjhg");
        System.out.println(Fruit.numberOfFruits);
        apple3.printManufacturerInfo();
        apple2.printManufacturerInfo();
    }
}
