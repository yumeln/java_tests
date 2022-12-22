/*Реализовать класс, содержащий методы для получения и добавления элемента и реализующий следующую структуру данных:
        Easy: массив (динамический)*/

package lesson8.easy;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 29, 50, 2};
        addElement(array,2);

    }
    private static int getElement(int[] array, int i) {
        System.out.println("Элемент массива с индексом " + i + ": " + array[i]);
        return array[i];
    }

    private static int[] addElement(int[] array, int a) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = a;
        System.out.println("Элемент для добавления " + a + " Новый массив " + Arrays.toString(newArray));
        return newArray;
    }


}
