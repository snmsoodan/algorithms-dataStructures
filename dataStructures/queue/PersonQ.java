package dataStructures.queue;

/**
 * PersonQ
 */
public class PersonQ {

    private Person[] q;
    private int size;
    private int total;
    private int front;
    private int rear;

    public PersonQ() {
        size = 50;
        front = 0;
        rear = 0;
        total = 0;
        q = new Person[size];
    }

    public PersonQ(int size) {
        size = this.size;
        front = 0;
        rear = 0;
        total = 0;
        q = new Person[this.size];
    }

    public boolean isFull() {
        return size == total;
    }

    public boolean enQueue(Person item) {
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
    
    public Person deQueue() {
        Person item = q[front];
        total--;
        // front++;
        front = (front+1) % size;
        return item;
    }   
}