package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        // FIFO - First In First Out
        // PriorityQueue se parece com um MinHeap
        Queue<String> queue = new PriorityQueue<>();
        queue.add("D");
        queue.add("B");
        queue.add("A");
        queue.add("C");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
