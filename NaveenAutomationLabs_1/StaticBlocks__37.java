package NaveenAutomationLabs_1;

public class StaticBlocks__37 {

	/*
	  => static blocks executed even before the main() i.e when the class is loaded.
	  
	  => if there are n no's of static blocks then they will be executed before
	  main method in a sequence how its written.
	  
	  => static blocks are different from static methods for ex static blocks are automatically 
	  called where as static methods need to be called explicitely and main method is called by JVM.
	  
	 */

	static {
		System.out.println("Static block 1");
		
	}

	static {
		System.out.println("Static block 2");
	}

	static {
		System.out.println("Static block 3");
	}
	
	public  static void demo()
	{
		System.out.println("static method");
	}

	public static void main(String[] args) {

		System.out.println("Main method");
	}

	static {
		System.out.println("Static block 4");
	}

}
