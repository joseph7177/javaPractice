package NaveenAutomationLabs_1;

public class Min_Value__36 {

	public static void main(String[] args) {
		/*  what is the min value of double ?
		 * which one is bigger => Double.MIN_VALUE (or) 0.0d
		 *  which one is bigger => Double.MIN_VALUE (or) NEGATIVE_INFINITY
		*/

		System.out.println(Double.MIN_VALUE);  // its a +ve number
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		
		System.out.println(Integer.MIN_VALUE); // its a -ve number
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE); // its a -ve number
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE); // its a +ve number
		System.out.println(Float.MAX_VALUE);
		
		// Note: min value for double and float is a -ve number but for integer and long its +ve number.
		
		
	}

}
