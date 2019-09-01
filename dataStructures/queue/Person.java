package dataStructures.queue;

/**
 * Person
 */
public class Person {

    private String name;
    private String age;

    Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + " age: " + this.age;
    }
}