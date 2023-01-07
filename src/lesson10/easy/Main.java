//    1. Создать массив, содержащий целые числа, размера 10.
//        2. Заполнить массив случайными числами (класс Random).
//        3. Создать и запустить побочный поток, вычисляющий максимальное значение массива.
//        4. Создать и запустить побочный поток, вычисляющий минимальное значение массива.
//        5. Гланый поток ожидает завершения побочных потоков (можно воспользоваться для этого методом join) и выводит максимум и минимум на консоль.


        package lesson10.easy;

public class Main {
        public static void main(String[] args) throws InterruptedException {
                int[] newArray;
                newArray = new int[10];

                for (int i = 0; i < 10; i++) {
                        int a = (int) (Math.random() * 99);
                        newArray[i] = a;
                        System.out.print(i + " ");
                        System.out.println(a);
                }

                TreadMax max = new TreadMax();
                Thread threadMax = new Thread(max);
                threadMax.start();
                max.max(newArray);

                TreadMin min = new TreadMin();
                Thread threadMin = new Thread(min);
                threadMin.join();
                min.min(newArray);

        }
}
