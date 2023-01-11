package Extra;

class Animal {
    String name;
    int age;
    String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void speak() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String sound, String breed) {
        super(name, age, sound);
        this.breed = breed;
    }

    public void wagTail() {
        System.out.println("Wagging tail...");
    }
}

public class AnotherInheritEx {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", 3, "Woof woof!", "Golden Retriever");
        dog.speak(); // prints "Woof woof!"
        dog.wagTail(); // prints "Wagging tail..."
    }
}