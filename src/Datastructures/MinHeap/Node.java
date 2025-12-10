package Datastructures.MinHeap;

public class Node {
    public int key;
    public Node parent, left, right;

    public Node(int key, Node parent) {
        this.key = key;
        this.parent = parent;
    }
}
