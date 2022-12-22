package lesson8.easy.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        // добавление элемента
        arrayList.add(5,9);
        arrayList.add(8);
        arrayList.add(5);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList);
    }
}