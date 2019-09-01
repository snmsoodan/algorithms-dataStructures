/**
 * DIntList
 */
public class DIntList {

    private Node head;

    public DIntList() {
        head = new Node();
        head.next = null;
        head.prev = null;
        head.value = 0;
    }

    public boolean insertItem(int item) {
        Node n = new Node();
        n.prev = null;
        n.next = head.next;
        n.value = item;
        if(head.next != null) {
            head.next.prev = n;
        }
        head.next = n;
        return true;
    }

    public boolean insertItemAtEnd(int item) {
        Node n = new Node();
        Node lastNode;
        lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        n.value = item;
        n.prev = lastNode;
        n.next = null;
        lastNode.next = n;
        return true;
    }

    public void printList() {
        Node z = head.next;
        while(z != null) {
            System.out.println(z.value);
            z = z.next; 
        }
    }

    public boolean deleteItem(int item) {
        Node firstNode = head.next;
        if(head.next == null) {
            return false;
        }
        if(firstNode.value == item) {
            head.next = firstNode.next;
            return true;
        } else {
            Node x = firstNode;
            Node y = firstNode.next;
            while(true) {
                if(y == null || y.value == item) {
                    break;
                } else {
                    x = y;
                    y = y.next;
                }
            }
            if(y != null) {
                x.next = y.next;
                return true;
            } else {
                return false;
            }
        }
    }

    public void sortList() {
        int c;
        Node a = head.next;
        while(a.next != null) {
            Node b = head.next;
            while(b.next != null) {
                if(b.value < b.next.value) {
                    c = b.value;
                    b.value = b.next.value;
                    b.next.value = c;
                }
                b = b.next;
            }
            a = a.next;
        }
    }

    class Node {
        private int value;
        private Node next;
        private Node prev;
    }
}