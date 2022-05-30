package Coding;

import java.util.Scanner;

public class FindVowelsBySwitch {

	public static void main(String[] args) {
		
		String a; char ch; int count = 0;
		System.out.println("Enter The String");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine().toLowerCase();

		for(int i = 0; i<a.length();i++)
		{
			ch = a.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			}
			
		}
		System.out.println(count);
	}

}
