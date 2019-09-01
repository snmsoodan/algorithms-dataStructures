
/**
 * intLinkedList
 */
public class intLinkedList {

    private Node head;

    public intLinkedList() {
        head = new Node();
        // head.value = item;  //by default a head is the first node //not what we want //head should only have link
        head.value = 0;
        head.link = null;
    }

    public boolean insertItem(int item) {
        Node n = new Node();
        n.value = item;
        n.link = head.link;
        head.link = n;
        return true;
    }

    public boolean insertItemAtEnd(int item) {
        Node n = new Node();
        Node lastNode;
        lastNode = head;
        while(lastNode.link !=null) {
            lastNode = lastNode.link;
        }
        n.value= item;
        n.link = null;
        lastNode.link = n;
        return true;
    }

    public void printList() {
        // Node z = head;
        //after making head only have the link
        Node z = head.link;
        while(z!=null) {
            System.out.println(z.value);
            z = z.link;
        }
    }

    public boolean deleteItem(int item) {
        // if(head.value == item) {
        Node firstNode = head.link; 
        if(firstNode.value == item) {
            head = firstNode.link;
            return true;
        } else {
            Node x = firstNode;
            Node y = firstNode.link;
            while(true) {
                if(y == null || y.value == item) {
                    break;
                } else {
                    x = y;
                    y = y.link;
                }
            }
            if(y != null) {
                x.link = y.link;
                return true;
            } else {
                return false;
            }
        }
    }

    public void sortList() {
        int c;
        Node a = head.link;
        while(a.link!=null) {
            Node b =  head.link;
            while(b.link !=null) {
                if(b.value < b.link.value) { //descending order
                    c = b.value;
                    b.value = b.link.value;
                    b.link.value = c;
                }
                b = b.link;
            }
            a = a.link;
        }
    }

    class Node {
        private int value;
        private Node link;
    }
}