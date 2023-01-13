package Extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    This program demonstrates how to use the Comparator interface to sort a list of objects.
    The AgeComparator class implements the compare method, which compares the age of two Person objects and returns a positive,
    negative, or zero value depending on which object is older. The Collections.sort method is then used to sort the people
    list using the AgeComparator.
 */

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Jane", 25));
        people.add(new Person("Bob", 35));

        System.out.println("Unsorted: " + people);

        Collections.sort(people, new AgeComparator());

        System.out.println("Sorted by age: " + people);
    }
}
