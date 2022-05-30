package Coding;
// Print ASCII value of a character

import java.util.Scanner;

public class PrintASCII_value {

	public static void main(String[] args) {
		
		char ch; int a;
		System.out.println("Enter the Character");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		a = ch;
		System.out.println("ASCII value of Character " + ch + "i s " + a);
		// ASCII value differs for a character depending on its case whether it is a lower case or upper case
	}

}
