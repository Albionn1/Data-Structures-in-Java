package HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//Nonrepating character finder
		
//		CharacterFinder chfinder = new CharacterFinder();
//		
//		var ch = chfinder.findFirstNonRepeatingChar("a green apple");
//		System.out.println(ch);
		
		// Sets Data Structure

//		Set<Integer> set = new HashSet<>();
//		
//		int[] nums = {1, 1, 4 ,3 ,6, 2, 3, 4 ,7 ,9, 5, 6 ,8 ,7};
//		for(var number : nums)
//			set.add(number);
//		System.out.println(set);
		
		//Repaeating character
//		CharacterFinder finder = new CharacterFinder();
//		var ch = finder.firstRepeatedChar("green apple");
//		System.out.println(ch);
		
		// Hash Functions for String values
//		Map<String, String> map = new HashMap<>();
//		map.put("847392-A", "Albion");
//		System.out.println(hash("847392-A"));
//	}
//	public static int hash(String key) {
//		int hash = 0;
//		for(var ch : key.toCharArray())
//			hash += ch;
//		return hash % 100;
//	}
	//Hash function for Integer values
//	Map<Integer, String> map = new HashMap<>();
//	map.put(847392, "Albion");
//	System.out.println(hash(123456));
//	
//	}
//	public static int hash(int number) {
//		return number % 100;
//	}
	// HashTable Class tests
		HashTable table = new HashTable();
		table.put(6, "A");
		table.put(8, "B");
		table.put(11, "C");
		table.put(6, "A+");
		table.remove(6);
		System.out.println(table.get(6));
		
	}
}
