package app_java_10;

import java.util.Arrays;
import java.util.List;

//public class ReferenceVariable {
//    public static void main(String[] args) {
//    	
//        List<String> values = Arrays.asList("mike", "apple", "xyz");
//        
//        long updatedResult = values.stream()
//        		.filter(ReferenceVariable::countTheWord)
//        		.count();
//        
//        System.out.println("Count: " + updatedResult);
//    }
//
//    public static boolean countTheWord(String word) {
//        return word.length() > 3;
//    }
//}


public class ReferenceVariable {
    public static void main(String[] args) {
        ReferenceVariable referenceVariable = new ReferenceVariable();
        
        List<String> values = Arrays.asList("mike", "apple", "xyz");
        
        long updatedResult = values.stream()
        		.filter(referenceVariable::countTheWord)
        		.count();
        System.out.println("Count: " + updatedResult);
    }

    public boolean countTheWord(String word) {
        return word.length() > 3;
    }
}
