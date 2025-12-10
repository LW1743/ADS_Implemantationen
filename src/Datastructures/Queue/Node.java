package Datastructures.Queue;

public class Node {
    int value;
    Node prev, next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node prev) {
        this.value = value;
        this.prev = prev;
    }

    public Node(int value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
