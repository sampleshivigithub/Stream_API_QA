package app_java_10;

import java.util.HashMap;
import java.util.Map;

//Hash map example

public class H {
    public static void main(String[] args) {
    	
    	Map<String, Integer> ageMap = new HashMap<>();
    	ageMap.put("Alice", 28);
    	ageMap.put("Bob", 22);
    	ageMap.put("Charlie", 35);
    	ageMap.put("David", 30);
    	ageMap.put("Eve", 28);
    	
// Access values by key
        int aliceAge = ageMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge);
        
// Check if a key exists
        boolean hasKey = ageMap.containsKey("Bob");
        System.out.println("Does the map contain Bob? " + hasKey);
        
// Remove a key-value pair
        ageMap.remove("David");
        
// Remove a key-value pair
        ageMap.remove("David");
        

// Iterate through the keys and values
        
        System.out.println("Iterating through the HashMap:");
        
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + ": " + age);
        }

// Check if the HashMap is empty
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

// Get the size of the HashMap
        int size = ageMap.size();
        System.out.println("Size of the map: " + size);
    }

}

