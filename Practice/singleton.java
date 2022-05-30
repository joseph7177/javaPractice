package Practice;

public class singleton {
	
	public String str;
	
	
	public singleton() {
		str = "hey i m inside the Constructor";
	}
	
	public String demo()
	{
		str = "hey i m inside the demo";
	//	System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
	
		singleton s = new singleton();
	System.out.println(	s.str);
		System.out.println(s.demo());
		
		
	}

}
