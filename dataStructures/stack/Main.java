package dataStructures.stack;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        //----intStack
        // intStack intStack = new intStack();
        // System.out.println(intStack.push(2));
        // System.out.println(intStack.push(3));
        // System.out.println(intStack.push(4));
        // System.out.println(intStack.push(5));
        // System.out.println(intStack.push(6));

        // System.out.println(intStack.pop());
        // System.out.println(intStack.pop());
        // System.out.println(intStack.pop());

        Person person1 = new Person("sanam", "20");
        Person person2 = new Person("gurleen", "20");

        PersonStack personStack = new PersonStack();

        System.out.println(personStack.push(person1));
        System.out.println(personStack.push(person2));

        System.out.println(personStack.pop().toString());
        System.out.println(personStack.pop().toString());


    }       
}