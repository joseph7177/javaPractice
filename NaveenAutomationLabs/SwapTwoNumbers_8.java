package NaveenAutomationLabs;

public class SwapTwoNumbers_8 {

	public static void main(String[] args) {
		 long a = 5433232341l;
		long b = 312323455674l;
		
		//1st method
		a= a+b; 
		b = a-b; 
		a=a-b;
		System.out.println("a => "+a);
		System.out.println("b => "+b);
		
		System.out.println("----------------------------");
		// 2nd method
		a = a*b; // 8
		b=a/b; // 8/4=2
		a = a/b ;
		// this not works for every number
		System.out.println("a => "+a);
		System.out.println("b => "+b);
		
		

	}

}
