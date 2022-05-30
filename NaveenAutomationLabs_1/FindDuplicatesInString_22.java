package NaveenAutomationLabs_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesInString_22 {

	public static void main(String[] args) {
		
		findDuplicates("Hello Amith u r best Amith u r great Amith");
		findDuplicates("hi hi hi hi hi hi hi hi hi hi ");
		System.out.println("---------------------------------------");
		
		usingForLoop("Hello Amith u r best Amith u r great Amith");
		System.out.println("");
		System.out.println("---------------------------------------");
		usingHashSet("Hello Amith u r best Amith u r great Amith");
		usingHashSet("Anu wat Anu wat r u doin Anu r u der");
		
		System.out.println("");
		System.out.println("---------------------------------------");
		streamConcept("Anu wat Anu wat r u doin Anu r u der");
		
		System.out.println("---------------------------------------");
		streamFrequency("Anu wat Anu wat r u doin Anu r u der");

	}

	public static void findDuplicates(String InputString)
	{
		String[] words = InputString.split(" ");
		
		Map<String,Integer> wordCount = new HashMap<>();
	
		for(String word : words)
		{
			if(wordCount.containsKey(word))
			{
				wordCount.put(word, wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}
		}
		
		 Iterator<Entry<String, Integer>> entrySet = wordCount.entrySet().iterator();
		while(entrySet.hasNext())
		{
			Entry<String, Integer> entry = entrySet.next();
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + " => " +entry.getValue() + " times repeated");
			}
					
		}
	}
	
	
	public static void usingForLoop(String str)
	{
		String[] words = str.split(" ");
		
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
				System.out.print(words[i]+"  ");
				break;
				}
			}
			
		}
		
	}
	
	public static void usingHashSet(String InputString)
	{
		String[] words = InputString.split(" ");
		Set<String> set = new HashSet<String>();
		
		for(String word: words)
		{
			if(set.add(word)==false)
			{
				System.out.print(word + "   ");
			}
		}
	}
	
	
	public static void streamConcept(String InputString)
	{
		String[] words = InputString.split(" ");
		Set<String> set = new HashSet<String>();
		
		List<String> list = Arrays.asList(words).stream().filter(s-> !set.add(s)).collect(Collectors.toList());
		System.out.println(list);
	}
	
	public static void streamFrequency(String InputString)
	{
		String[] words = InputString.split(" ");
		List<String> list = Arrays.asList(words);
		Set<String> set = list.stream().filter(elementInList->Collections.frequency(list, elementInList)>1).collect(Collectors.toSet());
	 System.out.println(set);
	}
}
