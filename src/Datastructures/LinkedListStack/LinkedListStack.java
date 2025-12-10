package Datastructures.LinkedListStack;

import java.util.EmptyStackException;

public class LinkedListStack {
    Node root;

    public LinkedListStack() {
        this.root = null;
    }

    public void push(int value) {
        if(this.root == null) {
            this.root = new Node(value, null);
            return;
        }
        root = new Node(value, this.root);
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public Node pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Node temp = root;
        this.root = root.prev;
        return temp;
    }

    public Node top() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return this.root;
    }

    public void printStackTopDown() {
        while(root!=null) {
            System.out.println(pop().value);
        }
    }

}
