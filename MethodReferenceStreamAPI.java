package app_java_10;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceStreamAPI {
    public static String convertToUppercase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Using a lambda expression
        names.stream().map(s -> convertToUppercase(s))
        .forEach(System.out::println);

// Using a static method reference
        names.stream().map(MethodReferenceStreamAPI::convertToUppercase)
                .forEach(System.out::println);
    }
}
