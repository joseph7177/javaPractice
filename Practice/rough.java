package Practice;

public class rough {
	
	

	public static void main(String[] args) {
	
		String s = "welcome";
		
//		int count =0;
//		for(char c : s.toCharArray())
//		{
//			
//			if(c == 'a' || c=='e' || c=='i'|| c=='o'|| c=='u')
//			{
//			   count++;
//			  
//			}
//		}
//		if(count!=0)
//		{
//			System.out.println("yes");
//		}
		
		if(s.contains("[^aeiou]")) System.out.println("yes");
		

	}

}
