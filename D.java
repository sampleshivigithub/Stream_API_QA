package app_java_10;

//01/09/2023
//Stream API program 5

import java.util.*;
import java.util.stream.Collectors;

public class D {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		data.add("Mike");
		data.add("Shivi");
		data.add("Stallin");
		data.add("Mike");
		data.add("Alice");
		data.add("Adam");
		
//	  5. how many times come name given the contentEquals
		
		List<String> newData = data.stream().filter(s->s.contentEquals
				("Mike")).collect(Collectors.toList());
		System.out.println(newData);
		System.out.println(newData.size());//2
	
		
//   6. letters starts with the letter a,b,c
//		
//		List<String> newData = data.stream().filter(s->s.startsWith
//				("A")).collect(Collectors.toList());
//		System.out.println(newData);
//		System.out.println(newData.size());//2
		
//   7. how many types ends with "e" letter
//		List<String> newData = data.stream().filter(s->s.endsWith
//				("e")).collect(Collectors.toList());
//		System.out.println(newData);
//		System.out.println(newData.size());//3
		
	}

}
