/*Set contains no duplicate items*/

package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		String[] colors = {"blue", "green", "yellow", "white", "red",
				"pink", "black", "magneta", "orange", "white", "green", "yellow"};
		List<String> list = Arrays.asList(colors);
		System.out.println("List with duplicate items: " + list);
		
		deleteDuplicate(list);
		
	}
	
	private static void deleteDuplicate(List<String> list) {
		
		Set<String> set = new HashSet<>(list);
		System.out.println("List with duplicates removed: " + set);
	}
}
