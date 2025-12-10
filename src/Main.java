import Algorithms.Sort.InsertionSort.InsertionSort;
import Algorithms.Sort.QuickSort.QuickSort;
import Algorithms.Sort.SortingAlgorithm;
import Datastructures.BinarySearchTree.BinarySearchTree;
import Datastructures.LinkedListStack.LinkedListStack;
import Datastructures.List.List;
import Datastructures.MinHeap.MinHeap;
import Datastructures.Queue.Queue;
import Datastructures.Stack.Stack;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

    }
    static void testSortingAlgorithm(SortingAlgorithm sortingAlgorithm, int[] Array) {
        int[] ArrayOriginal = Arrays.copyOf(Array, Array.length);
        int[] ArrayCopy = Arrays.copyOf(Array, Array.length);
        sortingAlgorithm.sort(Array);
        Arrays.sort(ArrayCopy);

        for(int i = 0; i<Array.length; i++) {
            if(Array[i] != ArrayCopy[i]) {
                System.out.println("Index: " + i + " " + Array[i] + " != " + ArrayCopy[i]);
            }
        }
        System.out.println("Original: " + Arrays.toString(ArrayOriginal));
        System.out.println("Custom:   " + Arrays.toString(Array));
        System.out.println("Correct:  " + Arrays.toString(ArrayCopy));
    }
    //Creates Array with rand values between 0 and 1000
    static int[] createRandomArray(int length) {
        int[] A = new int[length];
        Random random = new Random();

        for(int i = 0; i<A.length; i++) {
            A[i] = random.nextInt(0,1001);
        }
        return A;
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

    static void linkedListStack() {
        LinkedListStack linkedListStack = new LinkedListStack();

        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);

        linkedListStack.printStackTopDown();
    }

    static void stack() {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printStackTopDown();
    }

    static void queue() {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.printQueue();
    }

    static void list() {
        List list = new List();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);


        list.printList();
        System.out.println();
        list.DeleteMulti(3);
        list.printList();
    }


    static void insertionSort() {
        int[] test = createRandomArray(100);
        InsertionSort insertionSort = new InsertionSort();

        testSortingAlgorithm(insertionSort, test);
    }

}
