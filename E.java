package app_java_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//8. sorted an array

public class E {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		
//		data.add("Mike");
//		data.add("Shivi");
//		data.add("Stallin");
//		data.add("xyz");
//		data.add("Alice");
//		data.add("Adam");
//		
//		List<String> newData = data.stream().sorted()
//				.collect(Collectors.toList());
//		System.out.println(newData);
//		System.out.println(newData.size());
		
//9. removing the duplicate array using distinct	
		
		data.add("Mike");
		data.add("Shivi");
		data.add("Stallin");
		data.add("xyz");
		data.add("Mike");
		data.add("Mike");
		
		List<String> newData = data.stream().distinct()
				.collect(Collectors.toList());
		System.out.println(newData);
		System.out.println(newData.size());
	}
}
