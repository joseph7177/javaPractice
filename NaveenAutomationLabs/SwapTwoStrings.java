package NaveenAutomationLabs;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		String a = "Hello Amith How Are You";
		String b = "I m fine Thanks, how about you ?";
		
		System.out.println("Before Swaping the value of a => "+a);
		System.out.println("Before Swaping the value of b => "+b);
		
		System.out.println("-------------------------------------------");
		
		// 1st method
		a = a+b; //HelloWorld
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After Swaping the value of a => "+a);
		System.out.println("After Swaping the value of b => "+b);
		
		System.out.println("--------------------------------------------");
		
		
		// 2nd method
		String x = "HelloWorld";
		String y = "World";
		
		x = x.concat(y);
		y = x.replaceFirst(y, "");
		x= x.replaceFirst(y, "");
		System.out.println("After Swaping the value of x => "+x);
		System.out.println("After Swaping the value of y => "+y);

	}

}
