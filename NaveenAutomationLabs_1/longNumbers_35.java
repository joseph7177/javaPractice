package NaveenAutomationLabs_1;

public class longNumbers_35 {

	public static void main(String[] args) {

		long longNumberWithoutL = 1000 * 24 * 60 * 60 * 365;
		long longNumberWithL = 1000 * 24 * 60 * 60 * 365L;

		System.out.println(longNumberWithoutL); // gives 1471228928 => not correct one
		System.out.println(longNumberWithL); // gives 31536000000 => correct one

		// 1471228928 => 32 bits (4 byte) => 1010111101100010010110000000000

// 31536000000 => 36bits => 11101010111101100010010110000000000  , if we remove 1st 4 digits we get above result

		/*
		  if we doesnot provide L at lst it considers as int and max capacity of int is
		  to store 32 bits but the output is of capacity 36 bits so it narrows the
		  output and provides the output equivalant to 32 bits
		 */
	}

}
