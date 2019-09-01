/**
 * DPersonList
 */
public class DPersonList {

    private Node head;

    public DPersonList() {
        head = new Node();
        head.next = null;
        head.prev = null;
        head.person = null;
    }

    public boolean insertItem(Person item) {
        Node n = new Node();
        n.prev = null;
        n.next = head.next;
        n.person = item;
        if(head.next != null) {
            head.next.prev = n;
        }
        head.next = n;
        return true;
    }

    public insertItemAtEnd(Person item) {
        Node n = new Node();
        Node lastNode;
        lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        n.person = item;
        n.prev = lastNode;
        n.next = null;
        lastNode.next = n;
        return true;  
    }

    public void printList() {
        Node z = head.next;
        while(z != null) {
            System.out.println(z.person.toString());
            z = z.next; 
        }
    }

    public boolean deleteItem(String name) {
        Node firstNode = head.next;
        if(head.next == null) {
            return false;
        }
        if(firstNode.person.getName() == name) {
            head.next = firstNode.next;
            return true;
        } else {
            Node x = firstNode;
            Node y = firstNode.next;
            while(true) {
                if(y == null || y.person.getName() == name) {
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
                if(b.person.getAge() < b.next.person.getAge()) {
                    c = b.person;
                    b.value = b.next.value;
                    b.next.person = c;
                }
                b = b.next;
            }
            a = a.next;
        }
    }

    class Node {
        private Person person;
        private Node next;
        private Node prev;
    }
}