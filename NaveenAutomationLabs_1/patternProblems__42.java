package NaveenAutomationLabs_1;

public class patternProblems__42 {

	public static void main(String[] args) {

		pattern1();
		System.out.println("=========================");
		pattern2();
		System.out.println("=========================");
		pattern3();
		System.out.println("=========================");
		pattern4();
		System.out.println("=========================");
		pattern5();
		System.out.println("=========================");
		pattern6();
		System.out.println("=========================");
		pattern7();
		System.out.println("=========================");
		pattern8();
		System.out.println("=========================");
		pattern9();
		System.out.println("=========================");
		pattern10();
		System.out.println("=========================");
		pattern11();
	}

	public static void pattern1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void pattern2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 4-i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void pattern3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 3-i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void pattern4() {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 1; j <= 4-i; j++) {
				
				System.out.print("  ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	
	public static void pattern5() {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 1; j <= 4-i; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
	
	public static void pattern6() {
		char k = 65;
			for (int i = 0; i <= 5; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(k+" ");
					 k++;
				}
				k=65;
				System.out.println("");
			}
		}
	
	public static void pattern7() {
		char k = 97;
			for (int i = 0; i <= 5; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(k+" ");
					 k++;
				}
				k=97;
				System.out.println("");
			}
		}
	
	public static void pattern8() {
		char k = 65;
			for (int i = 0; i <= 5; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(k+" ");
					 k++;
				}
				System.out.println("");
			}
		}
	
	public static void pattern9() {
		int k=1;
			for (int i = 0; i <4; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(k+" ");
					 k++;
				}
				System.out.println("");
			}
		}
	
	public static void pattern10()
	{
		// A-Z = 65-90
		// a-z = 97-122
		
		char ch = 65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				 
				System.out.print(ch+ " ");
			}
			ch++;
			System.out.println("");
		}
	}
	
	public static void pattern11()
	{
		for(int i=0;i<5;i++)
		{
			
			for(int k=0;k<4-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
		
		for(int n=0;n<4;n++)
		{
			for(int o=0;o<=n;o++)
			{
				System.out.print(" ");
			}
			for(int m=4-n;m>0;m--)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}

	}
	
	
	

}
