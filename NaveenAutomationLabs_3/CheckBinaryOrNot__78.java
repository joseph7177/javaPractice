package NaveenAutomationLabs_3;

public class CheckBinaryOrNot__78 {

	public static void main(String[] args) {

		IsBinary(1110110);
		isBinaryByRegularExpression(1101100101010l);
	}

	public static void IsBinary(long num) {
		boolean isBinary = true;
		long copyNum = num;
		

		while (copyNum != 0) 
		{
			long rem = copyNum % 10;
			if (rem > 1) {
				isBinary=false;
				break;
			} else {
				copyNum = copyNum / 10;
			}
		}
		
		if(isBinary)  System.out.println(num +" : it is a Binary Number");
		else           System.out.println(num +" : Not a Binary Number");

	}
	
	public static void isBinaryByRegularExpression(long num)
	{
		if(Long.toString(num).matches("[0-1]+")) System.out.println(num +" : it is a Binary Number");
		else           System.out.println(num +" : Not a Binary Number");
		
	}

}
