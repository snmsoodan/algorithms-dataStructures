package dataStructures.queue;

/**
 * IntQ
 */
public class IntQ {

    private int[] q;
    private int size;
    private int total;
    private int front;
    private int rear;

    public IntQ() {
        size = 50;
        front = 0;
        rear = 0;
        total = 0;
        q = new int[size];
    }

    public IntQ(int size) {
        size = this.size;
        front = 0;
        rear = 0;
        total = 0;
        q = new int[this.size];
    }

    public boolean isFull() {
        return size == total;
    }

    public boolean enQueue(int item) {
        if(isFull()) {
            return false;
        } else {
            q[rear] = item;
            total++;
            // rear++;
            rear = (rear+1) % size;
            return true;
        }
    }
    
    public int deQueue() {
        int item = q[front];
        total--;
        // front++;
        front = (front+1) % size;
        return item;
    }   
}