package src.main.Java2;

/**
 * Created by byang on 2018-09-18.
 */
import java.util.function.Supplier;

class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setDesignation(String address) {
        this.address = address;
    }
}

public class Java8Supplier {
    public static void main(String[] args) {
        Supplier < Person > supplier = () -> {return new Person("Varun", 30, "Programmer"); };
        Person p = supplier.get();
        System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge() + ", " + p.getAddress());
    }
}