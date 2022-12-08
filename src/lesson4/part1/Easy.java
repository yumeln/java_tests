//Создайте массив из 12 случайных целых чисел из отрезка [0;30].
//Определите какой элемент является в этом массиве максимальным и
// выведите в консоль его индекс.


package lesson4.part1;
public class Easy {
    public static void main(String[] args) {
        int[] newArray;
        newArray = new int[12];

        for (int i = 0; i < 12; i++) {
            int a = (int) (Math.random() * 30);

            newArray[i] = a;
            System.out.print(i + " ");
            System.out.println(a);
        }

        int min = newArray[0];
        for (int i = 1; i < 12; i++) {
            if ( min > newArray[i]) {
                min = newArray[i];
            }
        }
        System.out.println("минимальное число массива: " + min);
    }
}