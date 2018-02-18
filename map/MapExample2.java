package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
	
	public static void main(String[] args) {
		
		Map<String, String> translate = new HashMap<>();
		
		//keys and values must be of those types that implements hashCode() and equal()
		//eg can't use StringBuilder
		
		translate.put("zero", "sıfır");
		translate.put("one", "bir");
		translate.put("two", "iki");
		translate.put("three", "üç");
		translate.put("four", "dört");
		translate.put("five", "beş");
		translate.put("six", "altı");
		
		String eng = "one";
		String tr = translate.get(eng);
		System.out.format("%s : %s", eng, tr);
		
	}

}
