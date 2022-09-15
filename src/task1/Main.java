package task1;

import java.util.LinkedList;

public class Main {
    public static void main(final String[] args) {
        final DoubleEndedQueue<Integer> dequeue = new DoubleEndedQueue<>();
        dequeue.addLast(3);
        dequeue.addLast(6);
        dequeue.addLast(-5);
        dequeue.addLast(-555);
        dequeue.addFirst(2424);
        dequeue.addFirst(40000);
        dequeue.addFirst(-5322);
        System.out.println(dequeue);
    }
}
