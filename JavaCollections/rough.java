package JavaCollections;

public class rough {
	
	

	public static void main(String[] args) {
//		rough r1 = new rough();
//		
//		rough r2 = new rough();
//		
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(new rough());
		
		/*String s1 = new String("Amith");
	
		
		System.out.println(s1.hashCode());
		s1 = "Arjun";
		System.out.println(s1.hashCode());
		s1="Allu";
		System.out.println(s1.hashCode());
		s1=s1.concat("Arjun");
		System.out.println(s1);
		*/
		
		String s1 = "Amith";
		String s2 = "Amith";
		String s3 = "Amith";
		String s4 = "Amith";
		String s5 = "Amith";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println("-----------------------------");
		s1 = "Arjun";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		
		String a ="Arya";
		String b = "Arjun";
		
		a = a + b;
		System.out.println(a);
		b= a.substring(0,4);
		System.out.println(b);
		a = a.substring(4);
		System.out.println(a);
		
//		int a = 12;
//		int b = 2 ;
//		System.out.println(a/b);
//		
//		int a = 12;
//		double b = 2 ;
//		System.out.println(a/b);
		
		int c = 'b';
		char d = 'a';
		
		c= c +d;
		
		System.out.println(c+d);
		
		
		String f1 = "AlluArjun";
		String f2 = "AlluArjun";
		String f3 = new String("AlluArjun");
		String f4 = new String("AlluArjun");
		
		System.out.println(f1==f2);
		System.out.println(f3==f4);
		
		
	}

}
