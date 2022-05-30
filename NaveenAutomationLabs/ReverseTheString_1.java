package NaveenAutomationLabs;

import java.util.Scanner;

public class ReverseTheString_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		// sc.next() => will take only first word and will not consider remaining words
		// in a sentence
		// String a = sc.nextLine().toUpperCase();
		char ch;
// s.reverse() is not available as strings are immutable and we cannot perform the reverse function on same object and moreover there is no reverse function as such 

		// 1st method by using the loop concept
		for (int i = a.length() - 1; i >= 0; i--) {
			ch = a.charAt(i);
			System.out.print(ch);
		}
		System.out.println("");

		// 2nd method using the StringBuffer class (we have reverse method in this but
		// not in string ) stringBuffer is mutable class we can apply reverse method for
		// this class
		// (difference between the string and StringBuffer )
		// String is immutable and has no reverse function whereas StringBuffer is
		// mutable and has reverse function

		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb.reverse());

	}

}
