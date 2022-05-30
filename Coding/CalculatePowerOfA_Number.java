package Coding;

import java.util.Scanner;

public class CalculatePowerOfA_Number {

	public static void main(String[] args) {
		
		int a,b,result = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		a = sc.nextInt();
		System.out.println("Enter the Power");
		b = sc.nextInt();
		
		for(int i =1; i<=b ;i++)
		{
			result = result*a;
		}
		System.out.println(result);

	}

}
