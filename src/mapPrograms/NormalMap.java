package mapPrograms;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NormalMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(10, "R15");
		map.put(11, "RC200");
		map.put(12, "RC390");
		map.put(13, "Duke390");
		map.put(14, "Duke200");

		// Print the map in the console
		System.out.println("---------------------------------------");

		System.out.println(map);

		// Print the value of 14
		System.out.println("---------------------------------------");
		String value = map.get(14);
		System.out.println("The value of 14 is " + value);

		// Check whether the key 12 is present or not
		System.out.println("---------------------------------------");
		boolean x = map.containsKey(12);

		if (x == true) {
			System.out.println("The key 12 is present");
		} else {
			System.out.println("The key 12 is not present");
		}

		// Check whether the value Duke390 is present or not
		System.out.println("---------------------------------------");
		boolean y = map.containsValue("Duke390");

		if (y == true) {
			System.out.println("The value Duke390 is present");
		} else {
			System.out.println("The value Duke390 is not present");
		}
		System.out.println("---------------------------------------");

		// Check whether the Map is empty or not
		System.out.println(map.isEmpty());

		System.out.println("---------------------------------------");
		// Print only the key
		Set<Integer> key = map.keySet();
		for (Integer k : key) {
			System.out.println(k);
		}
		System.out.println("---------------------------------------");
		// Print only the values
		Collection<String> values = map.values();
		for (String value1 : values) {
			System.out.println(value1);
		}
		System.out.println("---------------------------------------");
		Set<Entry<Integer, String>> es = map.entrySet();

		// Using Enhanced for loop
		for (Entry<Integer, String> entry : es) {
			// System.out.println(entry);

			// Print only the key
			// System.out.println(entry.getKey());

			// Print only the values
			System.out.println(entry.getValue());
		}

	}

}
