package Coding;

import java.util.Scanner;

public class PrintOddNumbers {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		
		// 1st method
		for(int i = 1; i<a ;i++) {
			if(i % 2 !=0) System.out.print(i + " ");
		}
		System.out.println(" ");
		
		// 2nd method
		for(int i = 1; i<a ;i=i+2) {
			 System.out.print(i + " ");
		}

	}

}
