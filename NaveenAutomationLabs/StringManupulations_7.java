package NaveenAutomationLabs;

import java.util.Arrays;

public class StringManupulations_7 {

	public static void main(String[] args) {

		String s = new String("The rains have started here and shit mann");
		String s1 = "The rains have started here and shit manN";
		System.out.println(s.length());

		System.out.println(s.charAt(8));

		// 1st occurance of s
		System.out.println(s.indexOf("s"));

		// 2nd occurance of s
		System.out.println(s.indexOf("s", s.indexOf("s") + 1));

		// 3rd occurance of s
		System.out.println(s.indexOf("s", (s.indexOf("s", s.indexOf("s") + 1)) + 1));

		// if the string doesnot exist
		System.out.println(s.indexOf("hello"));

		// Comparision of 2 strings
		System.out.println(s.equals(s1));

		// Comparision of 2 strings and ignore the case
		System.out.println(s.equalsIgnoreCase(s1));

		// SubString
		System.out.println(s.substring(0, 9));

		// trim()
		String s2 = "           Hello Amith       ";
		System.out.println(s2.trim());
		System.out.println(s2.replace(" ", "")); // if i want to remove the middle space also
		
		// if i want to replace something
		String s3 = "19-02-2001"; // i want 19/02/2001
		System.out.println(s3.replace("-", "/"));
		
		// if i want to split the string
		String[] split = s.split(" ");
		System.out.println(Arrays.toString(split));
		for(String value : split)
		{
			System.out.println(value);
		}
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		System.out.println(split[3]);
		
		// Reverse the string
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		for (int i = s.length()-1; i >= 0; i--) {
			char ch = s.charAt(i);
			System.out.print(ch);
		}
		System.out.println(" ");
		// Concatinate the string
		System.out.println(s.concat(s2.concat(s3)));
		
		int a =100;
		int b=200;
		String x = "Hello";
		String y = "world";
		// feel the difference
		System.out.println(a+b+x+y); // if a+b is present at 1st only then it will add 
		System.out.println(x+y+a+b); // if a+b is present at last it will assume as the string
		System.out.println(x+a+y+b);
		System.out.println(x+a+b+y); // if a+b is present at middle also it will assume as the string
		
		
		
		
		
	}

}
