package NaveenAutomationLabs__2;

public class Length_ofString__55 {

	public static void main(String[] args) {
		// find length of string without using length()
		String str = "Amith Reddy";
		System.out.println(str.toCharArray().length);
		
		System.out.println(str.lastIndexOf(""));
		System.out.println(str.split("").length);
		
		// using forLoop
		int count =0;
		for(char ch : str.toCharArray())
		{
			count++;
		}
		System.out.println(count);
		
		// streams concept
		System.out.println(str.chars().count());
	}

}
