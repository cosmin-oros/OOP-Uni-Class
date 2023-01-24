package Extra.Subjects;

/*
    How many items in the format "Age: <number>" will be displayed and why?
 */

import java.util.HashSet;

class Student {
    private int age;

    public Student(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        return ((o instanceof Student) && (age == ((Student)o).age));
    }

    public String toString() {
        return "Age: " + age;
    }
}

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student(22);
        Student s2 = new Student(23);
        Student s3 = new Student(22);
        Student s4 = new Student(22);

        HashSet<Student> set = new HashSet<Student>(3);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
