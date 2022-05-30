package NaveenAutomationLabs;

import java.util.Scanner;

public class primeNumbers_16 {
	
	// 2 is the lowest prime number 

	public static void main(String[] args) {

		int a,i,j,s,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number upto where prime numbers need to be printed :");
		 a = sc.nextInt();
		 
		for( i=2;i<=a;i++)
		{
			s = 0;
			
			for( j=2;j<i;j++)
			{
				if((i%j==0)) 
				{ 
					s =1;
					break;
				}
			}
		  if(s==0)
		  { count++;
			System.out.print(i + "  ");
		  }
	
		}
		System.out.println("");
		System.out.println("there are "+ count +" prime no's below " + a);

	}

}
