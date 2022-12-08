/*Создайте массив из 10 случайных целых чисел из отрезка [20;100).
        Выведите в консоль содержимое массива, чтобы пользовател ввел с
        клавиатуры число из этого массива.
        Выведите в консоль индекс элемента, который ввел пользователь, в массиве.
        Если пользователь ввел число, которого нету в массиве, то выведите ошибку.*/


package lesson4;

import java.util.Scanner;

public class Normal {
    public static void main(String[] args) {
        int[] randomNumbersArray;
        randomNumbersArray = new int[10];

        for (int i = 0; i < randomNumbersArray.length; i++) {
            int a = (int) (Math.random() * 80 + 20);
            randomNumbersArray[i] = a;
            System.out.print(i + " ");
            System.out.println(a);
        }

        System.out.println("Введите число из массива: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i < randomNumbersArray.length; i++) {
            if (randomNumbersArray[i] == number) {

                System.out.println(i);

            }
            System.out.println("Ошибка! Неправильное число.");

        }
    }
}