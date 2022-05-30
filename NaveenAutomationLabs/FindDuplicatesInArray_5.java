package NaveenAutomationLabs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesInArray_5 {

	public static void main(String[] args) {

		// 1st method   => not for duplicates but for distinct values
		String[] a = { "Amith", "Arjun", "Amith", "Allu", "AlluArjun", "Arjun" };
		Arrays.asList(a).stream().distinct().forEach(s -> System.out.println(s));

		System.out.println("---------------------------");
		// 2nd method
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					System.out.println(i + 1 + " Duplicate Value is " + a[i]);
				}
			}
		}

		System.out.println("---------------------------");
		// 3rd method        HashSet = stores unique values
		Set<String> store = new HashSet<String>();
		for (String name : a) {
			if (store.add(name) == false) {
				System.out.println("Duplicate Value is " + name);
			}
		}

		System.out.println("---------------------------");
		
		// 4th method
		Map<String, Integer> StoreMap = new HashMap<String, Integer>();

		for (String name : a) 
		{
               Integer count =StoreMap.get(name);
               if(count == null)
               {
            	   StoreMap.put(name, 1);
               }
               else {
            	   StoreMap.put(name, ++count);
               }
		}
		
		Iterator<Entry<String, Integer>> it = StoreMap.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<String, Integer> entry = it.next();
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate value is " + entry.getKey());
			}
		}
		
		
		
		
		
		
		

	}
}
