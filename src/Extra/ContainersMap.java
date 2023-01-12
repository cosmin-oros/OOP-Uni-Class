package Extra;

import java.util.HashMap;
import java.util.Map;

public class ContainersMap {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // Get the value for a specific key
        int bananaValue = map.get("banana");
        System.out.println("The value for banana is: " + bananaValue);

        // Check if a key is in the map
        boolean hasApple = map.containsKey("apple");
        System.out.println("Map contains key apple: " + hasApple);

        // Remove a key-value pair from the map
        map.remove("orange");

        // Iterate over all key-value pairs in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
