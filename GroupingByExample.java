package app_java_10;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
    	
        List<Person> people = Arrays.asList(
            new Person("Alice", 28, "New York"),
            new Person("Bob", 22, "Los Angeles"),
            new Person("Charlie", 35, "New York"),
            new Person("David", 30, "Chicago"),
            new Person("Eve", 28, "Chicago"),
            new Person("Frank", 35, "Los Angeles")
        );

// Group people by city
        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person->Person.getAge()));

        
        for (Entry<Integer, List<Person>> entry : peopleByAge.entrySet()) {
        	        	System.out.println(entry.getValue());
        	     System.out.println("{");
        	for(Person p : entry.getValue()) {
        		System.out.println(p.getName());
        		
        	}
        	System.out.println("}");
        }
    }
}
