
/**
 * PersonLinkedList
 */
public class PersonLinkedList {

    private Node head;

    public PersonLinkedList() {
        head = new Node();
        // head.value = item;  //by default a head is the first node //not what we want //head should only have link
        head.person = null;
        head.link = null;
    }

    public boolean insertItem(Person item) {
        Node n = new Node();
        n.person = item;
        n.link = head.link;
        head.link = n;
        return true;
    }

    public boolean insertItemAtEnd(Person item) {
        Node n = new Node();
        Node lastNode;
        lastNode = head;
        while(lastNode.link !=null) {
            lastNode = lastNode.link;
        }
        n.person= item;
        n.link = null;
        lastNode.link = n;
        return true;
    }

    public void printList() {
        // Node z = head;
        //after making head only have the link
        Node z = head.link;
        while(z!=null) {
            System.out.println(z.person);
            z = z.link;
        }
    }

    public boolean deleteItem(String name) {
        Node firstNode = head.link; 
        if(firstNode.person.getName().equals(name)) {
            head.link = firstNode.link;
            return true;
        } else {
            Node x = firstNode;
            Node y = firstNode.link;
            while(true) {
                if(y == null || (y.person.getName().equals(name))) {
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
        Person c;
        Node a = head.link;
        while(a.link!=null) {
            Node b =  head.link;
            while(b.link !=null) {
                if(b.person.getAge() < b.link.person.getAge()) { //descending order
                    c = b.person;
                    b.person = b.link.person;
                    b.link.person = c;
                }
                b = b.link;
            }
            a = a.link;
        }
    }

    class Node {
        private Person person;
        private Node link;
    }
}