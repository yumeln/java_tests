//стек

package lesson8.normal.stack.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // добавление элемента в верх стека

        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(0);

        //получение элемента
        System.out.println(stack.search(1));
        System.out.println(stack);
    }
}
