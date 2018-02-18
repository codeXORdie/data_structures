package set;

import java.util.HashSet;
import java.util.Set;

public class Item {

	private String name;
	private String description;
		
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Item name " + name + ", description: " + description;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if(other.getClass() != Item.class) return false;
		Item otherItem = (Item)other;
		if(this.name == otherItem.name) return true;
		return this.name != null && this.name.equals(otherItem.name);
	}
	
	public static void main(String[] args) {
		Set<Item> set = new HashSet<>();
		Item item1 = new Item("apple", "red");
		set.add(item1);
		Item item2 = new Item("apple", "green");
		set.add(item2);
		Item item3 = new Item("apple", "yellow");
		set.add(item3);
		System.out.println(set);
		
		// creating and adding duplicate item
		Item duplicate = new Item("apple", "red");
		set.add(duplicate);
		
		
		System.out.println("Set contains 'duplicate': " + set.contains(duplicate));
		System.out.println(set);
	}
		
}
