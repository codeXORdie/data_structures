package collections;

import java.util.LinkedList;
import java.util.List;

public class Iterator {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("nice");
		list.add("interesting");
		list.add("great");
		list.add("fascinating");
		
		//iterator has to belong to the thing being iterated
		//ask that thing to give the iterator
		java.util.Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			if(s.equals("great")) {
				it.remove();
			}
		}
		
		System.out.println("\nAfter removing 'great' with iterator:");
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}
}
