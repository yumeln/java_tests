/*Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете com.company.professions.
        Класс Driver содержит поля - ФИО, стаж вождения.
        Класс Engine содержит поля - мощность, производитель.
        Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
        Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо"
        или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
        Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
        Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
        Пусть класс Driver расширяет класс Person.*/


package lesson6.auto;

import lesson6.auto.com.company.details.Engine;
import lesson6.auto.com.company.professions.Driver;
import lesson6.auto.com.company.vehicles.Car;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Driver dddd = new Driver("slndf", 4);
        Car car1 = new Car("skjdncf", 2, 90, dddd, new Engine());

        Engine engine = new Engine();

        System.out.println(car1.getDriver());
        System.out.println(engine.toString());
        System.out.println(car1.toString());
        System.out.println(dddd.toString());

        car1.start();
        car1.turnLeft();




    }
}
