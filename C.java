package app_java_10;

//01/09/2023
//Stream API Project part in intellijIdea

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//find even number from list
public class C {
  public static void main(String[] args) {
	ArrayList<Integer> data = new ArrayList<Integer>();
	data.add(10);
	data.add(21);
	data.add(5);
	data.add(20);
	data.add(10);
	data.add(20);
	data.add(5);
	data.add(50);
	
	List<Integer> newList = 
			data.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(newList);//10,20
	

//	here we use map in the place of filter then automatically change ,
//	the modulo in multiplication and equal to zero is removed given in below  
	
//	2. List<Integer> newList = 
//			data.stream().map(i->i*2).collect(Collectors.toList());
//	System.out.println(newList);//20,42,10,40,20,40,10,100
	
//	for removing the duplicate array value then we can use the 
//  distinct() in the place of filter given in below
	
//	3. List<Integer> newList = 
//			data.stream().distinct().collect(Collectors.toList());
//	System.out.println(newList);//10,20,21,5,50
	
	//for sorting Array to use sorted in the place of filter given in below 
	
//	4. List<Integer> newList = 
//			data.stream().sorted().collect(Collectors.toList());
//	System.out.println(newList);//5,5,10,10,20,20,21,50

  } 
}
