package NaveenAutomationLabs;

public class addingGivenNumbers {

	public static void main(String[] args) {

		
		addition a1 = new addition();
		a1.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,5667.728,567);

	}

}

class addition {
	
	// public void add(int... a, double... b, String... c) this is not possible we
	// can store only one kind of data as the method can take infinite values and if
	// we are trying to store different kind of data types it gets confused as
	// infinite no of arguments will be passed so to avoid this only single datatype
	// is permitted

	public void add(double... a) // variable-arguments
	{
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

	}
}
