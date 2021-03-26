package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class stackQueue {

    public static void main(String[] args) {

        Deque<Integer> deq = new ArrayDeque<>();

        add(deq);
        stackPop(deq);
        queuePop(deq);
        stackPop(deq);
        stackPop(deq);
        queuePop(deq);
    }

    static void add(Deque<Integer> deq) {
        int i = 1;
        while (i <= 20) {
            deq.push(i);
            i++;
        }
        System.out.println("Adding 20 numbers to list ");
        System.out.println(deq);
    }

    static void stackPop(Deque<Integer> deq) {
        deq.pop();
        System.out.println(" \n Removes first number in the list");
        System.out.println(deq);
    }

    static void queuePop(Deque<Integer> deq) {
        deq.removeLast();
        System.out.println(" \n Removes last number in the list" );
        System.out.println(deq);
    }
}
