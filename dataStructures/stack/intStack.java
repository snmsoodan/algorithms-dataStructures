package dataStructures.stack;

/**
 * intStack
 * contains integers
 */
public class intStack {
    
    private int[] stack;
    private int top;
    private int size;

    public  intStack() {
        top=-1;
        size=50;
        stack = new int[size];
    }

    public intStack(int size) {
        top=-1;
        this.size=size;
        stack = new int[size]; 
    }

    public boolean isFull() {
        if(top == stack.length -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean push(int item) {
        if(!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() {
        return stack[top--];
    }

}