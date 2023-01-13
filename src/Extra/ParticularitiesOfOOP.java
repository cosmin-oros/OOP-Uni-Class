package Extra;

/*
    Encapsulation: The Animal class encapsulates the name and age of an animal into private fields,
    and provides public getter and setter methods to access them.

    Inheritance: The Dog and Cat classes inherit from the Animal class, inheriting its properties and methods.

    Overriding: The makeNoise() method in the Dog and Cat classes overrides the implementation in the Animal class,
    providing a specific implementation for each type of animal.

    Polymorphism: Different implementations of a method
 */

class Animal2 {
    private String name;
    private int age;

    public Animal2(String name, int age) {
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

    public void makeNoise() {
        System.out.println("Some generic animal noise.");
    }
}

class Dog2 extends Animal2 {
    private String breed;

    public Dog2(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal2 {
    private boolean indoor;

    public Cat(String name, int age, boolean indoor) {
        super(name, age);
        this.indoor = indoor;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow.");
    }
}

public class ParticularitiesOfOOP {
    public static void main(String[] args) {
        Animal2 a = new Animal2("Generic animal", 5);
        Dog2 d = new Dog2("Fido", 3, "Golden Retriever");
        Cat c = new Cat("Whiskers", 2, true);

        a.makeNoise();
        d.makeNoise();
        c.makeNoise();

        System.out.println("Name: " + a.getName() + ", Age: " + a.getAge());
        System.out.println("Name: " + d.getName() + ", Age: " + d.getAge() + ", Breed: " + d.getBreed());
        System.out.println("Name: " + c.getName() + ", Age: " + c.getAge() + ", Indoor: " + c.isIndoor());
    }
}
