package dataStructures.queue;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // ----integer 
        // IntQ intQ = new IntQ();
        // System.out.println(intQ.enQueue(3));
        // System.out.println(intQ.enQueue(2));
        // System.out.println(intQ.enQueue(1));

        // System.out.println(intQ.deQueue());
        // System.out.println(intQ.deQueue());

        Person person1 = new Person("sanam", "20");
        Person person2 = new Person("gurleen", "20");

        PersonQ personQ = new PersonQ();
        personQ.enQueue(person1);
        personQ.enQueue(person2);

        System.out.println(personQ.deQueue().toString());
        System.out.println(personQ.deQueue().toString());

    }
}