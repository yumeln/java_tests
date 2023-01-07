package lesson10.easy;

public class TreadMin implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from thread Min");
    }

    public void min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if ( min < array[i]) {
                min = array[i];
            }
        }
        System.out.println("минимальное число массива: " + min);
    }
}
