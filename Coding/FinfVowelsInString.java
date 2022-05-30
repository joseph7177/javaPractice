package Coding;

import java.util.Scanner;

public class FinfVowelsInString {

	public static void main(String[] args) {
		
		String a;
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine().toLowerCase();
		char ch;
		int Vowels = 0;
		int consonants = 0;
		
		for(int i =0; i<a.length();i++)
		{
			ch = a.charAt(i);
			if(ch == 'a'|| ch =='e'||ch =='i' ||ch =='o'||ch =='u' ) {
				System.out.print(ch +" ");
				Vowels++;
			}
			else {
				
				System.out.print(ch +" ");
			consonants++;
			}
		}
		System.out.println(" ");
		System.out.println("No of Vowels = " + Vowels);
		System.out.println("No of Vowels = " + consonants);
	}

}
