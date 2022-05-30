package NaveenAutomationLabs_1;

public class nullConcept_23 {

	static Object object;
	static String str;
	static nullConcept_23 nc;

	public static void main(String[] args) {
		// 1) case sensitive
		Object obj = null;
		System.out.println(obj);

		// 2) default values of any class whether user defined class or pre-defined class or wrapper class,
		// the reference variable points to null for above classes
		System.out.println(object);
		System.out.println(str);
		System.out.println(nc);
		
		// 3)
		Integer i = null;
		System.out.println(i);
	//	int j = i; // gives nullPointerException as primitive data type cannot handle null values
		
		// 4) instanceOf
		Integer a = 10;
		Integer b = null;
		
		System.out.println(a instanceof Integer);
		System.out.println(b instanceof Integer);  // as reference is pointing to null it means nothing
		
		// 5) static vs non-static
		nullConcept_23 obj1 = null;
		nullConcept_23.staticBlock();
	//	obj1.NonStaticBlock(); // throws NullPointerException
		
		// Typecasting to other classes
		String s1 = (String)null;
		Integer i1 = (Integer)null;
		Double d1 = (Double)null;
		System.out.println(s1);
	//	System.out.println(s1.length()); throws null pointer exception
		System.out.println(i1);
	//	System.out.println(i1.hashCode());  throws null pointer exception
		System.out.println(d1);
		
		

	}
	
	public static void staticBlock()
	{
		System.out.println("Static block doesnot need any object creation to access it");
	}
	
	public void NonStaticBlock()
	{
		System.out.println("Non Static block  need  object creation to access it if not throws null pointer exception evn if object created is pointing towards null");
	}

}
