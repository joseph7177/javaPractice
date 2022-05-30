package Practice;

public class concatinate {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "pqr";
		
		System.out.println(s1.concat(s2).concat(s3));
		
		// using StringBuffer
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.append(s2).append(s3));
		
		
		 String str = "java,Selenium,TestNg,Maven,Jenkins";

		 String[] str1 = str.split(",");
	for(String s: str1)
	{
		System.out.println(s);
	}
		

	}

}
