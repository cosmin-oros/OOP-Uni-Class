package Extra;

import java.util.HashSet;
import java.util.Set;

public class ContainersSet {
    public static void main(String[] args) {
        // Create a new HashSet
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Try to add a duplicate element
        boolean added = set.add("apple");
        System.out.println("Added apple again: " + added);

        // Check if an element is in the set
        boolean hasApple = set.contains("apple");
        System.out.println("Set contains apple: " + hasApple);

        // Remove an element from the set
        set.remove("orange");

        // Iterate over all elements in the set
        for (String element : set) {
            System.out.println(element);
        }
    }
}
