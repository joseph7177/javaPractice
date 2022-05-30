package NaveenAutomationLabs__2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacter__46 {

	public static void main(String[] args) {

		Duplicate_characters("Amith Reddy");


	}
	
	public static void Duplicate_characters(String InputString)
	{
		if(InputString==null) 
		{
			System.out.println("Null String");
			
		}
		if(InputString.isEmpty())
		{
			System.out.println("Empty String");
			
		}
		if(InputString.length()==1) 
		{
			System.out.println("Single char String");
			
		}
		
		
		char[] letters= InputString.toCharArray();
		
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char letter :letters)
		{
			if(map.get(letter)==null)
			{
				map.put(letter, 1);
			}
			else{
				map.put(letter, map.get(letter)+1);
			}
		}
		
		Iterator<Entry<Character, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Character, Integer> entry = iterator.next();
			
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() +" => " + entry.getValue()+ " times repeated in the String");
			}
		}
		
		
		
		
	}

}
