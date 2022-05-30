package NaveenAutomationLabsPractice;

import java.util.Scanner;

public class reverseTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence/word ");
		String a = sc.nextLine();
	

		for(int i=a.length()-1;i>=0;i--)
		{
			char c = a.charAt(i);
			System.out.print(c);
		}
		
		System.out.println("");
		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb.reverse());
		
		
	}

}
