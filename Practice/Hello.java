package Practice;

import java.util.ArrayList;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
//		ArrayList<> a = new ArrayList<>();
//		a.add(5);
//		a.add("Amith");
//		a.add(true);
//		a.add('A');
//		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Amith");
		a.add("Arjun");
		a.add("Akash");
		a.add("Arun");
		
		for(String b : a)
		{
			System.out.println(b);
		}
		
	}

}
