package NaveenAutomationLabs;

public class primeNumbersOrNot_16 {

	public static void main(String[] args) {

		isPrime(10);

	}
	
	public static boolean isPrime(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
		
	}

}
