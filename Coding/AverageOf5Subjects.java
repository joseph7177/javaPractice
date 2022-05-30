package Coding;

import java.util.Scanner;

public class AverageOf5Subjects {

	public static void main(String[] args) {
		int a,b,c,d,e,sum;
		System.out.println("Enter The Numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		sum = (a+b+c+d+e);
		double Average = sum/5;
		
		System.out.println(Average);
	}

}
