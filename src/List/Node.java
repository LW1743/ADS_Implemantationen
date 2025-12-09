package List;

public class Node {
    int key;
    Node prev, next;

    public Node(int key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }

    public Node(int key, Node prev) {
        this.key = key;
        this.next = prev;
        this.prev = null;
    }

    public Node(int key, Node prev, Node next) {
        this.key = key;
        this.prev = prev;
        this.next = next;
    }
}
