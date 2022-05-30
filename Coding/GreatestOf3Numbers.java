package Coding;

import java.util.Scanner;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("Enter The Numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println(max);

	}

}
