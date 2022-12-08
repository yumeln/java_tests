//Вывести на экран последовательность чисел от 0 до n в обратном порядке

package lesson3;

import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        System.out.println("Введите n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
