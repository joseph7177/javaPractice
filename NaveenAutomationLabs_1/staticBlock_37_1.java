package NaveenAutomationLabs_1;

public class staticBlock_37_1 {

	static {
		System.out.println("static block.... executed first ");
	}
	
	{
		System.out.println(
				"Instance Initialisation Block => gets executed only when object is created and execution takes place before constructor");
	}
	
	public staticBlock_37_1()
	{
		System.out.println("Constructor => executed after instance initialisation block");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		
		// after creation of object only constructor and instance initialization block gets executed
		
		staticBlock_37_1 obj = new staticBlock_37_1();

	}

}
