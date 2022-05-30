package NaveenAutomationLabs__2;

import java.util.StringJoiner;

public class StringJoiner__56 {

	public static void main(String[] args) {

		// question : print this {Amith,Arjun,Reddy,Allu]
		
		StringJoiner joiner = new StringJoiner("-", "{", "]");
		
		joiner.add("Amith").add("Arjun").add("Reddy").add("Allu");
		
		System.out.println(joiner);
		
		// concept of unicode
		
		// concept of unicode \u000d System.out.println("concept of unicode is it goes  to new line");
		
		// \u000d int i = 20;
		System.out.println(i);

	}

}
