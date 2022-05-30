package Coding;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(a + "x" + i + "=" + a*i);
		}

	}

}
