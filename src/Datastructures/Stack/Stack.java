package Datastructures.Stack;

import java.util.EmptyStackException;

public class Stack {

    public int[] stack;
    private int top=-1;

    public Stack(int length) {
        stack = new int[length];
    }

    public boolean isEmpty() {
        return top==0;
    }

    public void push(int value) {
        top++;
        stack[top] = value;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        int temp = stack[top];

        /*
        //Hier könnte man stack[top] = 0 setzen um die Daten "zu vernichten"
        //aber das ist unnötig, da sie beim nächsten push einfach überschrieben werden
        stack[top] = 0;
         */

        top--;
        return temp;
    }

    public int top() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public void printStackTopDown() {
        for(int i = top; i>-1; i--){
            System.out.println(stack[i]);
        }
    }
}
