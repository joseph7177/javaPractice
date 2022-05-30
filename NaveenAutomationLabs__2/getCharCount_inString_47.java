package NaveenAutomationLabs__2;

import org.apache.commons.lang3.StringUtils;

public class getCharCount_inString_47 {

	public static void main(String[] args) {
		
		String s = "Amith How Are You";
		getCharCountUsingStreams("Amith How Are You","A");
		
		getCharCountUsingForLoop("Amith How Are You",'A');
		
		// using StringUtils from apache commons lang
		int count = StringUtils.countMatches(s, 'A');
		System.out.println(count);
		
		// using streams concept
	   long count1 = s.chars().filter(e-> (char)e=='A').count();
	   System.out.println(count1);
	
	}
	
	public static void getCharCountUsingStreams(String str,String i)
	{
		long count = str.chars().mapToObj(s-> String.valueOf((char)s)).filter(s-> s.equals(i)).count();
		System.out.println(i+" : "+ count);
	}
	
	public static void getCharCountUsingForLoop(String str,char val)
	{
		int count=0; char c = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch==val)
			{
				 c = str.charAt(i);
				 count++;
			}
			
		}
	
		System.out.println(c + " : " + count);
	}

}
