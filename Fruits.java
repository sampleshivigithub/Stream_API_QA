package app_java_10;

import java.util.Arrays;
import java.util.List;

//1. count the number of fruits in given string

public class Fruits {
     public static void main(String[] args) {
        	  
//		  List<String> words = Arrays.asList
//					("apple", "banana", "cherry", "date", "elderberry");
//			
//	      long count = words.stream().
//			      filter(word-> word.length() >= 5).count();
//		  System.out.println(count);
//		
    	 
    	 
//2. find the max number of the given string 	 
       List<Integer> numbers = Arrays.asList(4,7,1,9,3,12,5); 
    	      Integer max = numbers.stream()
    			    .max(Integer::compare).get();
    	      System.out.println(max);
    	 
     }
     
}
