package Coding;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		int a; String result;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		result = (a % 2 == 0)? "Number is Even" : "Number is Odd";
		System.out.println(result);

	}

}
