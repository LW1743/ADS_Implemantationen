package Queue;

import java.util.EmptyStackException;

public class Queue {

    int[] queue;
    int tail, head;

    public Queue(int length) {
        queue = new int[length+1];
    }

    public void enqueue(int value) {
        queue[tail] = value;
        if(tail == queue.length-1) {
            tail = 0;
        }
        else {
            tail++;
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new QueueUnderflowException();
        }
        int temp = queue[head];
        if(head == queue.length-1) {
            head = 0;
        }
        else {
            head++;
        }
        return temp;
    }

    public boolean isEmpty() {
        return tail == head;
    }

    public void printQueue() {
        for(int i = head; i < tail; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.print("\n");
    }
}
