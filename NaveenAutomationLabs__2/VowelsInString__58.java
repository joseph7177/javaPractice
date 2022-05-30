package NaveenAutomationLabs__2;

import com.google.common.base.CharMatcher;

public class VowelsInString__58 {

	public static void main(String[] args) {

		String str = "Amith Reddy i Love You";

		long VowelCount = str.toLowerCase().chars().filter(
				s -> (char) s == 'a' || (char) s == 'e' || (char) s == 'i' || (char) s == 'o' || (char) s == 'u')
				.count();
		System.out.println(VowelCount);
		
		// using Google Guava library
		int guava = CharMatcher.anyOf("aeiouAEIOU").countIn(str);
		System.out.println(guava);
	}

}
