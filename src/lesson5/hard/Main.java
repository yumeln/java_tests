/*Создайте пример наследования, реализуйте класс Student и класс Aspirant.
        Аспирант отличается от студента наличием некой научной работы (имеет свойство scientificWork).
        Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.

        Создать переменную типа Student, которая ссылается на объект типа Aspirant.
        Создать метод getScholarship() для класса Student, который возвращает сумму стипендии:
        - если средняя оценка студента равна 5, то сумма 1750 руб.;
        - если средняя оценка студена больше или равно 4, но меньше 5, то сумма 1710 руб.;
        - иначе студенту не выплачивается стипендия.
        Переопределить этот метод в классе Aspirant:
        - если средняя оценка студента равна 5, то сумма 1950 руб.;
        - если средняя оценка студена больше или равно 4, но меньше 5, то сумма 1910 руб.;
        - иначе аспиранту не выплачивается стипендия.
        Создать массив типа Student, содержащий объекты класса Student и Aspirant.
        Вызвать метод getScholarship() для каждого элемента массива.*/


package lesson5.hard;

import lesson6.interfaceprintable.Printable;

public class Main {
    public static void main(String[] args) {
        Aspirant aspirant = new Aspirant("jjj", "jn", "nkk", 3);
        aspirant.getScholarship();
        Student student = new Student("ksjfn", "askhb", "skljf", 4);
        student.getScholarship();
        Student[] mass = new Student[]{student,aspirant};

        for (Student masss: mass) {
            masss.print();
        }

    }

}
