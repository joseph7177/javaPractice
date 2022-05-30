package Coding;

import java.util.Scanner;

public class SumFirtstN_NaturalNumbers {

	public static void main(String[] args) {
		
		int a; int sum = 0;
		System.out.println("Enter the Number");
		Scanner r = new Scanner(System.in);
		a = r.nextInt();
		
		for(int i = 0; i<=a;i++)
		{
			sum = sum + i;
			
		}
		
	//	sum = a * (a-1);
		System.out.println("Summation of 1st " + a + " Natutal numbers is "+ sum);
	}

}
