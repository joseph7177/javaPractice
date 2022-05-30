package Coding;

import java.util.Scanner;

public class Print_Each_Char_in_String {

	public static void main(String[] args) {
		
		String a;
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		
		for(int i = 0; i< a.length();i++)
		{
			System.out.println(a.charAt(i));
		}

	}

}
