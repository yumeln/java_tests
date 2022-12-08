/*Создать класс Person, который содержит:
        - переменные fullName, age;
        - методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person ходит/говорит".*/

package lesson4.part2;

public class Easy {
    public static void main(String[] args) {
        class Person {
            String fullName;
            int Age;
            void move() {
                System.out.println(fullName + " ходит.");
            }
            void talk() {
                System.out.println(fullName + " говорит.");
            }
        }
    }
}
