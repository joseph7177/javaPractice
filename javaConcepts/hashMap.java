package javaConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMap {

	public static void main(String[] args) {
		
		// No order no indexing
		// stores as key value pairs
		// can store n number of null values but stores only one null key
		// hashmap is not thread-safe - Unsynchronized;
		
		HashMap<String, String> CapitalList = new HashMap<String,String>();
		CapitalList.put("India", "New Delhi");
		CapitalList.put("USA", "Washington D C");
		CapitalList.put("UK", "London");
		CapitalList.put("UK", "London11");
		CapitalList.put(null, "LOS Angels");
		CapitalList.put(null, "Rome");
		CapitalList.put("Russia", null);
		CapitalList.put("France", null);
		
		System.out.println(CapitalList.get("UK"));
		System.out.println(CapitalList.get(null));
		
		// 1st method to iterate
		Iterator<String> it = CapitalList.keySet().iterator();
		while(it.hasNext())
		{
			String key = it.next();
			String value = CapitalList.get(key);
			System.out.println("Key is " + key + " Value is " + value);
		}
		
		System.out.println("------------------------------------");
		
		// 2nd method to iterate
		Iterator<Entry<String, String>> it1 = CapitalList.entrySet().iterator();
		while(it1.hasNext())
		{
			Entry<String, String> entry = it1.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key is " + key + " Value is " + value);
		}
		
		System.out.println("------------------------------------");
		
		// 3rd method to iterate(using Java8 and lamda method)
		CapitalList.forEach((k,v) -> System.out.println("Key is " + k + " Value is " + v));
		
		
		

	}

}
