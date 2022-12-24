package lesson8.normal.stack.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayStack = new int[]{1,3,4,5,6,7,8,7};
        addElement(arrayStack,3);  // добавление элемента
        getIndex(arrayStack,5);   // получение индекса
        searchElement(arrayStack,7);   // поиск по значению
    }

        static int[] addElement(int[] arrayStack, int a) {
            int[] newArrayStack = new int[arrayStack.length];
            newArrayStack[0] = a;
            for (int i = 0; i < arrayStack.length - 1; i++) {

                newArrayStack[i + 1] = arrayStack[i];
            }
            System.out.println("Массив до добавления элемента: " + Arrays.toString(arrayStack)+ " \nНовый массив с элементом " + a + ": " + Arrays.toString(newArrayStack));
            return newArrayStack;
        }

    static int getIndex(int[] arrayStack, int i) {

        System.out.println("Элемент массива с индексом " + i + ": " + arrayStack[i]);
//        System.out.println(Arrays.toString(arrayStack));
        return arrayStack[i];
    }

    static int searchElement(int[] arrayStack, int a) {
        for (int i = 0; i < arrayStack.length - 1; i++) {
            if (arrayStack[i] == a) {
                System.out.println("Элемент массива " + a + " - индекс: " +  i);
            }
        }
        return arrayStack[a];
    }
}



