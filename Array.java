package app_java_10;

import java.util.Arrays;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum=numbers.stream()
				.filter(n-> n % 2 == 0)
				.mapToInt(Integer ::intValue)
				.sum();
		System.out.println(sum);
	}

}
