

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // intLinkedList list =  new intLinkedList(); // 2 wont be added 

        // list.insertItem(5);
        // list.insertItem(8);
        // list.printList();
        // System.out.println(list.deleteItem(5));
        // list.printList();
        
        // list.insertItemAtEnd(2);
        // list.insertItemAtEnd(5);
        // list.insertItemAtEnd(8);
        // list.printList();
        // System.out.println(list.deleteItem(5));
        // list.printList();

        // list.insertItemAtEnd(2);
        // list.insertItemAtEnd(5);
        // list.insertItemAtEnd(8);
        // list.printList();
        // list.sortList();
        // list.printList();

        Person person1 = new Person("sanam", 21);
        Person person2 = new Person("gurleen", 20);

        PersonLinkedList personLinkedList = new PersonLinkedList();
        personLinkedList.insertItemAtEnd(person2);
        personLinkedList.insertItemAtEnd(person1);
        personLinkedList.printList();
        personLinkedList.sortList();
        System.out.println("after sort");
        personLinkedList.printList();


    }
}