package NaveenAutomationLabs__2;

public class getCapitalLettersInString__65 {

	public static void main(String[] args) {

		String str = "NullPointerException";

		usingChar(str);
		usingASCII(str);
		usingStreams_1(str);
		usingStreams_2(str);
		

	}

	public static void usingChar(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void usingASCII(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void usingStreams_1(String str)
	{
		long count = str.chars().filter(s-> (char)s>='A' && (char)s<='Z').count();
		System.out.println(count);
	}
	
	public static void usingStreams_2(String str)
	{
		long count = str.chars().filter(s-> Character.isUpperCase(s)).count();
		System.out.println(count);
	}
	
	

}
