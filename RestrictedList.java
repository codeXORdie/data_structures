package collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RestrictedList {
	
	public static void main(String[] args) {
		
		//new ArrayList<>() implies ArrayList<String>()
		List<String> ls = new ArrayList<>();
		ls.add("orange");
		ls.add("apricot");
		ls.add("watermelon");
		//ls.add(LocalDateTime.now()); impossible to add anything but String
		
		//no need to use cast
		String s = ls.get(0);
		System.out.println("String at index 0: " + s + "\n");
		
		//The List is still the same list that can hold any object
		//we just ask compiler to check if the elements we add to it are of type String
		//therefore, return type is still object and cast is needed
		//compiler generates the cast itself
		//that's why the addDate() compiles as the call to it
		addDate(ls);
		
		//trying to extract the items as Strings will also compile but throw an Exception
		System.out.println("List of Strings:");
		try {
			for(String str : ls) {
				System.out.println("-> " + str);
			}
		} catch(ClassCastException cce) {
			System.out.println("Throwing Exception ->");
			cce.printStackTrace(System.out);
		}
		
	}
	
	public static void addDate(List l) {
		l.add(LocalDateTime.now());
	}

}
