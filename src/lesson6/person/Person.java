package lesson6.person;

public class Person {
    String fullName;
    int age;

    void move(){
        System.out.println("Такой-то  " + fullName + " идет");
    }
    void talk() {
        System.out.println("Такой-то  " + fullName + " говорит");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
