package Coding;

import java.util.Scanner;

public class PrintNaturalNumbers {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		
		for(int i=1;i<=a;i++) 
		{
			System.out.print(i+" ");
		}
	}

}
