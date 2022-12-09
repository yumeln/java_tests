/*Создайте массив из 10 случайных целых чисел из отрезка [0;100).
        Отсортируйте данный массив и выведите результат в консоль.

        Например, имеется следующий массив: 45, 37, 79, 45.
        Отсортированный массив: 37, 45, 45, 79.*/
package lesson4.part1;

import java.util.Arrays;

public class Hard {
    public static void main(String[] args) {
    int[] randomArray;
    randomArray = new int[4];
        for (int i = 0; i < randomArray.length; i++) {
            int a = (int) (Math.random() * 100);
            randomArray[i] = a;
            System.out.print(i + " ");
            System.out.println(a);
        }

//        for (int i = 0; i < randomArray.length - 1; i++) {
//            int min = 0;
//            if ( randomArray[i] > randomArray[i+1]) {
//                    min = randomArray[i];
//                    randomArray[i] = randomArray[i+1];
//                    randomArray[i+1]= min;
//            }
//        }
        Arrays.sort(randomArray);
        System.out.println("Отсортированнный массив: ");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
    }
}