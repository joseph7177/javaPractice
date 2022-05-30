package Coding;

import java.util.Scanner;

public class FactorialOfA_number {

	public static void main(String[] args) {
		
		int a,factorial,result = 1;
		System.out.println("Enter The Numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		for(int i =1; i<=a;i++) {
			 result = result * i ;
		}
        
		System.out.println(result);
	}

}
