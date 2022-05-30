package NaveenAutomationLabs;

public class final_finally_finalize_10 {
	// final => keyword , Finally => block , finalize => method

	// Final Keyword
	// we cannot reinitialize the variable if it contains final keyword.
	// we cannot override a method in child class if parent class method is declared
	// final .
	// we cannot inherit the class if it is declared final .
	// Note : final keyword doesn't allow reinitialize,method
	// overriding,Inheritance.

	// Finally Block
	// finally is the block in Java Exception Handling to execute the important code
	// whether the exception occurs or not
	// doesn't matter whether exception is coming or not Finally block will be
	// Executed.
	// we can use driver.quit() in finally so that exception comes or not browser
	// will closes

	// finalize method
	// this method is called to clean up the memory in the heap as this methods
	// calls the garbage collector.
	// System.gc() => to call the garbage collector explicitly.
	//Finalize() method is called by default for every object before its deletion. 

	public static void main(String[] args) {

		test();
		System.out.println("===================");
		// test1();
		System.out.println("===================");
		test2(); // here we are not catching the proper Exception so not entering in catch block

	}

	public static void test() {
		try {
			System.out.println("inside try block of test()");
			System.out.println(4 / 0);

		} catch (ArithmeticException e) {
			System.out.println("inside catch block of test()");

		} finally {
			System.out.println("Indide the finally block of test()");
		}
	}

	public static void test1() {
		try {
			System.out.println("inside try block of test1()");
			System.out.println(4 / 0);
		}

		finally {
			System.out.println("Indide the finally block of test1()");
		}
		System.out.println("hello");
	}

	public static void test2() {
		try {
			System.out.println("inside try block of test2()");
			System.out.println(4 / 0);

		} catch (NullPointerException e) {
			System.out.println("inside catch block of test2()");
		} finally {
			System.out.println("Indide the finally block of test2() gets executed evn if exception is thrown");
		}
	}

}
