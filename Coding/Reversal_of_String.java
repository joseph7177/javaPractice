package Coding;

import java.util.Scanner;

public class Reversal_of_String {

	public static void main(String[] args) {
		
		String a;
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		
		for(int i = a.length()-1; i>=0;i--)
		{
			System.out.println(a.charAt(i));
		}

	}

}
