package Datastructures.BinarySearchTree;

public class Node {
    public Node parent, left, right;
    public int key;

    public Node(int key) {
        this.key = key;
        this.parent = null;
    }

    public Node(int key, Node parent) {
        this.key = key;
        this.parent = parent;
    }
}
