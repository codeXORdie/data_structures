package collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FirstuseOfList {
	
	public static void main(String[] args) {
		
		//generalized list can hold any object, any mix of objects
		List list = new ArrayList();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add(LocalDateTime.now()); //not the string
		
		//check if some items contains in the list
		System.out.format("Mango %s in the list.%nApple %s in the list."
				+ "%nCherry %s in the list.%n%n", list.contains("mango") ? "is" : "is not", 
						list.contains("apple") ? "is" : "is not", list.contains("cherry") ? "is" : "is not");
		
		//fetch items from the list
		System.out.println("List of items:");
		for(Object o : list) {
			System.out.println("-> " + o);
		}
		System.out.println();
		
		//because the list is generalized compiler does not allow to assign object to without a cast
		String s = (String)list.get(0);
		System.out.println("Item at index 0 is: " + s);
		
		//assigning with cast may throw an exception if the extracted item can't be assigned to a type var
		try {
			String notStr = (String)list.get(3);
		} catch(ClassCastException cce) {
			System.out.println("Throwing Exception ->");
			cce.printStackTrace(System.out);
		}
	}

}
