package set;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	
	public static void main(String[] args) {
		
		String[] colors = {"blue", "green", "yellow", "white", "red",
				"pink", "black", "magneta", "orange", "white", "green", "yellow"};
		List<String> list = Arrays.asList(colors);
		SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
		System.out.println("Original unsorted duplicate array: " + list);
		System.out.println("Sorted set: " + tree);
		System.out.println("headSet(orange): " + tree.headSet("orange"));
		System.out.println("tailSet(orange): " + tree.tailSet("orange"));
		System.out.println("first: " + tree.first());
		System.out.println("last: " + tree.last());
	}

}
