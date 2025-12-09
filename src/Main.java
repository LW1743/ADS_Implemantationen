import BinarySearchTree.BinarySearchTree;
import Stack.Stack;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printStackTopDown();

    }

    static void binarySearchTree() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(12);
        bst.insert(6);
        bst.insert(3);
        bst.insert(2);
        bst.insert(5);
        bst.insert(9);
        bst.insert(8);
        bst.insert(11);
        bst.insert(19);
        bst.insert(14);
        bst.insert(13);
        bst.insert(17);
        bst.insert(24);
        bst.insert(21);
        bst.insert(27);


        bst.inOrder();
    }


}
