package lesson10.easy;

public class TreadMax implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from thread Max");
    }

    public void max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if ( max > array[i]) {
                max = array[i];
            }
        }
        System.out.println("минимальное число массива: " + max);
    }
}
