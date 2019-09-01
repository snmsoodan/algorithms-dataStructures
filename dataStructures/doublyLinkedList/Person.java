
/**
 * Person
 */
public class Person {

    private String name;
    private Integer age;

    Person(String name, Integer age) {
        this.name= name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "Name: " + this.name + " age: " + this.age;
    }
}