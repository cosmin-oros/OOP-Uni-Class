package Extra.Subjects;

import java.lang.reflect.*;

class Student2 {
    private int age;

    public Student2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age: " + age;
    }
}

public class Client2 {
    public static void main(String[] args) {
        Class c = Student2.class;
        Object newStudent = null;
        Field ageField = null;

        for (Field f: c.getDeclaredFields()) {
            ageField = f;
        }

        for (Constructor cons: c.getConstructors()) {
            if (cons.getParameterTypes().length != 0) {
                try {
                    newStudent = cons.newInstance(new Integer(22));
                    ageField.set(newStudent, new Integer(20));
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                } finally {
                    if (newStudent != null) {
                        System.out.println(newStudent);
                    }
                }
            }
        }
    }
}
