package Coding;

import java.util.Scanner;

public class SumOfOddEvenNaturalNumbers {

	public static void main(String[] args) {
		int a,EvenSum=0,OddSum=0;
		System.out.println("Enter the Range");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			if(i % 2== 0) EvenSum = EvenSum + i;
			else OddSum = OddSum + i;
		}
		
		System.out.println("sum of 1st " + a +" even Natural Numbers are " + EvenSum);
		System.out.println("sum of 1st " + a + " odd Natural Numbers are " + OddSum);

	}

}
