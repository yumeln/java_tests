/*Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
        Создать классы расширяющие класс Flower (для примера,
        пусть это будут розы, гвоздики, тюльпаны и еще что-то на свой вкус).

        Класс Flower должен содержать переменную-счетчик (количество цветов).

        Собрать 3 букета (то есть 3 массива типа Flower).
        В букет может входить несколько цветов разного типа.
        Вывести на консоль количество созданных объектов типа Flower
        используя переменную-счетчик из класса Flower.*/

package lesson5.easy;

public class Main {
    public static void main(String[] args) {
        Flower rose1 = new Flower("Rusia", "Flower", 5, 100 );
        Flower rose2 = new Flower("Rusia", "Flower", 5, 100 );
        Flower rose3 = new Flower("Rusia", "Flower", 5, 100 );
        Flower tulip1 = new Flower("Holland", "FlowerS", 7, 200 );
        Flower tulip2 = new Tulip("Holland", "FlowerS", 7, 200 );
        Flower tulip3 = new Carnation("Holland", "FlowerS", 7, 200 );
        Flower carnation1 = new Flower("Russia", "Color", 15, 160 );
        Flower carnation2 = new Flower("Russia", "Color", 15, 160 );
        Flower carnation3 = new Flower("Russia", "Color", 15, 160 );
        Flower hyacinth = new Flower("Holland", "jjjj", 5, 1056 );

        Flower[] bouquet1 = new Flower[]{rose1,rose2,rose3};
        Flower[] bouquet2 = new Flower[]{rose1,carnation1,tulip1};
        Flower[] bouquet3 = new Flower[]{tulip2,tulip3,hyacinth};
        System.out.println("Number of flowers: " + Flower.numberOfFlowers);

    }
}
