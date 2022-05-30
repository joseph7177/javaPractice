package NaveenAutomationLabs__2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class countTheLettersInString__75 {

	public static void main(String[] args) {

		String str = "hello,Amith Reddy How are you";
	
		getLettersCount(str);
		getLettersCount("Helllo World");

	}
	
	public static void getLettersCount(String Input)
	{
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch : Input.toCharArray())
		{
			if(map.get(ch)==null)
			{
				map.put(ch, 1);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}
		}
		/*
		Iterator<Entry<Character, Integer>> entrySet = map.entrySet().iterator();
		while(entrySet.hasNext())
		{
			Entry<Character, Integer> entry = entrySet.next();
			System.out.println(entry.getKey() +" : " + entry.getValue());
		}
		*/
		
		System.out.println(Input + " : " + map);
		
	}

}
