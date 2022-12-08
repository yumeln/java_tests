//Вывести последовательность Фибоначчи до n.
//        Загуглить, что из себя представляет ряд Фибоначчи.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
package lesson3;

public class Hard {
    public static void main(String[] args) {
        int[] arrFibonachi = new int[10];
        int a = 0;
        arrFibonachi[0] = 0;
        arrFibonachi[1] = 1;
        System.out.print(arrFibonachi[0] + " ");
        System.out.print(arrFibonachi[1] + " ");
        for (int i = 2; i < 10; i++) {
            arrFibonachi[i] = arrFibonachi[i - 1] + arrFibonachi[i - 2];
            System.out.print(arrFibonachi[i] + " ");
        }

    }
}
