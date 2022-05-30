package NaveenAutomationLabs;

public class isArmstrongNumber_18 {

	public static void main(String[] args) {

		isArmStrongNumber(371);


	}
	
	public static void isArmStrongNumber(int num)
	{
		int temp = num;
		int cube =0;
		
		
		while(num > 0)
		{
			int r = num%10;
			num = num/10;
			cube = cube +(r*r*r);
		}
		
		if(temp == cube)
		{
			System.out.println(cube +" is a Armstrong Number");
		}
		else
		{
			System.out.println(cube+" is not a Armstrong Number");
		}
		
	}

}
