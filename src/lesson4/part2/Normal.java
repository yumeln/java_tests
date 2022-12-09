/*Создать класс Car, Engine и Driver.
        Класс Driver содержит поля - ФИО, стаж вождения.
        Класс Engine содержит поля - мощность, производитель.
        Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
        Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
        "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
        А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.*/
package lesson4.part2;

public class Normal {
    public static void main(String[] args) {
        class Driver {
            String name;
            int ageDriving;
        }
        class Engine {
            int power;
            String producer;
        }
        class Car {
            String model;
            String klass;
            double weight;
            Driver driver = new Driver();
            Engine engine = new Engine();

            void start() {
                System.out.println("Поехали");
            }

            void stop() {
                System.out.println("Останавливаемся");
            }

            void turnRight() {
                System.out.println("Поворот направо");
            }

            void turnLeft() {
                System.out.println("Поворот налево");
            }
        }
    }
}
