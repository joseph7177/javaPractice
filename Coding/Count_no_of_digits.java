package Coding;

import java.util.Scanner;

public class Count_no_of_digits {

	public static void main(String[] args) {
		
		long a; int count = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		while(a>0)
		{
			a = a/10;
			count++;
		}
           System.out.println(count);
	}

}
