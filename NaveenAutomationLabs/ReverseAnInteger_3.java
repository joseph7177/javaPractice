package NaveenAutomationLabs;

public class ReverseAnInteger_3 {

	public static void main(String[] args) {
		long a = 8792764749l;
		long rev = 0;
		
		
		// 1st method
		while(a !=0) 
		{
			rev = rev*10 + a%10;
			a = a/10;
		}
		System.out.println(rev);
		
		// 2nd Method
		long num1 =9449958908l;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		// String.valueOf converts int/boolean/char/long/object etc.. to String
		// here we are converting long to String and we are reversing this 
		
		// another way of doing the above method
		long num2 = 12345678987654l;
		String rev1 = String.valueOf(num2);
		StringBuffer sb = new StringBuffer(rev1);
		System.out.println(sb.reverse());
		
		
	}

}
