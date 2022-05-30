package NaveenAutomationLabs;

public class factorial_19 {

	public static void main(String[] args) {

		factorial(4);
		System.out.println(recursiveMethod(4));

	}
	
	public static void factorial(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact *i;
		}
		System.out.println(fact);
	}
	
	// recursive Function = a function calling its own function.
	public static int recursiveMethod(int num )
	{
		if (num==0) return 1;

		else
			return (num * recursiveMethod(num-1));
		
	}
}
