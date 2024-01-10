package app_java_10;

//07/09/2023
//how to create content of the map to storing the key value

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
      
	public static void main(String[] args) {
		Map<String, Integer> hashmap=new HashMap<String, Integer>();
		
		    hashmap.put("Alice", 28);
	        hashmap.put("Bob", 22);
	        hashmap.put("Charlie", 35);
	        hashmap.put("David", 30);
	        hashmap.put("Eve", 28);
	
	    for(Entry<String, Integer> x : hashmap.entrySet()) {
	    	System.out.println(x.getKey()+" "+x.getValue());
	    }
	}
}
