package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingMap {
	
	public static void main(String[] args) {
		Map<String, Integer> msi = new HashMap<>();
		
		msi.put("First", 1);
		msi.put("Second", 2);
		msi.put("Third", 3);
		msi.put("Fourth", 4);
		
		//extract keys
		Set<String> keys = msi.keySet();
		for(String s : keys) {
			System.out.println(s);
		}
		
		System.out.println("\n===========================\n");
		
		//extract values
		Collection<Integer> values = msi.values();
		for(int x : values) {
			System.out.println(x);
		}
		
		System.out.println("\n===========================\n");
		
		//iterating key-value
		//make msi unmodifiable
		msi = Collections.unmodifiableMap(msi);
		
		Set<Map.Entry<String, Integer>> entries = msi.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println("Key: " + entry.getKey() + 
					"; value: " + entry.getValue());
			
			try {
				if(entry.getKey().equals("First"))
				entry.setValue(0);
			} catch(UnsupportedOperationException uoe) {
				System.out.println("Was not able to setValue. The map is unmodifiable.");
			}
			
		}
		
		System.out.println("Changed map: " + msi);
	}
}
