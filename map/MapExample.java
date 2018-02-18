package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		Map<Integer, String> numNames = new HashMap<>();
		
		numNames.put(0, "zero");
		numNames.put(1, "one");
		numNames.put(2, "two");
		numNames.put(3, "three");
		numNames.put(4, "four");
		numNames.put(5, "five");
		numNames.put(6, "six");
		numNames.put(7, "seven");
		numNames.put(8, "eight");
		numNames.put(9, "nine");
		numNames.put(10, "ten");
		
		System.out.println(numNames);
		System.out.println("=================");
		
		numNames.put(3, "üç");
		System.out.println(numNames);
		System.out.println("=================");
		
		
		System.out.println(numNames.get(2));
		System.out.println("=================");
		
		System.out.println("Removed key: " + numNames.remove(3));
		System.out.println(numNames);
		System.out.println("=================");
	}

}
