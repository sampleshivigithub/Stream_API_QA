package app_java_10;

import java.util.*;
import java.util.stream.Collectors;

public class Agemap {
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

    // Print the result
      peopleByAge.forEach((age, agePeople) -> {
            System.out.println("Age"+ age + ":");
           
        agePeople.forEach(person-> System.out.println(" " + person));
           System.out.println();
       });
    }
}   
    
    
    