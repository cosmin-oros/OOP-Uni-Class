package Extra;

import java.util.TreeMap;

public class ContainersTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);
        treeMap.put("Date", 4);

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Get the value for a specific key
        int value = treeMap.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Remove a key-value pair
        treeMap.remove("Cherry");
        System.out.println("TreeMap after removing key 'Cherry': " + treeMap);
    }
}
