package NaveenAutomationLabs_1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Iteration_21 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Amith","Dhruva","Arjun","Puneeth","Surya");
		
		System.out.println(names);
		
		System.out.println("==================using forEach and lamda expression====================");
		// 1st method (using forEach and lamda expression)
		names.forEach(s-> System.out.println(s));
		
		
		System.out.println("===================using iterator===================");
		// 2nd method (using iterator)
		Iterator<String> it = names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===================using iterator and forEach===================");
		 names.iterator().forEachRemaining(name-> System.out.println(name));
		
		System.out.println("===================using Enhanced for loop===================");
		
		for(String name:names)
		{
			System.out.println(name);
		}

		System.out.println("===================using Typical for loop===================");
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		System.out.println("===================using List iterator===================");
		
		ListIterator<String> ListIterator = names.listIterator();
		ListIterator.forEachRemaining(s-> System.out.println(s));
		
		System.out.println("===========using List iterator printing in reverse manner========");
		// printing in reverse manner
		while (ListIterator.hasPrevious())
		{
			System.out.println(ListIterator.previous());
		}
	}

}
