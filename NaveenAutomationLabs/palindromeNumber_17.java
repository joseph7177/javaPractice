package NaveenAutomationLabs;

import java.util.Scanner;

public class palindromeNumber_17 {

	public static void main(String[] args) {
		palindromeNumber_17 p = new palindromeNumber_17();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number ");
		int a = sc.nextInt();
		p.IsPalindrome(a);
		p.isPalindromeByStringBuffer(a);
		

	}

	public void IsPalindrome(int num) 
	{
		int sum=0,r=0;
		int temp = num;
		while (num > 0)
		{
			 r = num % 10;
			 sum =(sum*10) +r;
			num = num/10;
		}
		
		if(temp == sum)
		{
			System.out.println(sum + " is a palindrome Number");
		}
		else
		{
			System.out.println(sum + " is a not palindrome Number");
		}

	}
	
	public void isPalindromeByStringBuffer(int num)
	{
		String s = Integer.toString(num);
		
		StringBuffer sb = new StringBuffer(s);
		String reverseString  = sb.reverse().toString();
		int reverse = Integer.parseInt(reverseString);
		
		if(reverse == num)
			{
				System.out.println(reverse + " is a palindrome Number");
			}
			else
			{
				System.out.println(reverse + " is a not palindrome Number");
			}
		
		
	}

}
