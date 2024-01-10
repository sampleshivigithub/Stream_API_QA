package app_java_10;

import java.util.Arrays;
import java.util.List;

public class ReferenceVariable2 {
    public static void main(String[] args) {
    	
        ReferenceVariable2 referenceVariable = new ReferenceVariable2(); // Use ReferenceVariable2 here
        
        List<String> values = Arrays.asList("mike", "apple", "xyz");
        
        long updatedResult = values.stream()
                .filter(referenceVariable::countTheWord) // Use referenceVariable, not referenceVariable2
                .count();
        System.out.println("Count: " + updatedResult);
    }

    public boolean countTheWord(String word) {
        return word.length() > 3;
    }
}

