package NaveenAutomationLabs__2;

public class CheckValidPhoneNumber__77 {

	public static void main(String[] args) {


		isNumber("1234a");
		isPhoneNumber("1234567891");
		isCreditCardNumber("12341234123412a34");
		regularExpression("1234567812");

	}
	
	public static void regularExpression(String Number)
	{
		if(Number.matches("^[0-9]{10}")) System.out.println("valid Phone number");
		else System.out.println("Not a valid Phone Number");
	}
	
	public static boolean isNumber(String num)
	{
		try {
			Long.parseLong(num);
		//	System.out.println("valid Number");

		}
		catch(Exception e)
		{
			System.out.println("Not a valid Number");
			return false;
		}
		return true;
	}
	
	public static void isPhoneNumber(String Number)
	{
		if(Number.length()==10 && isNumber(Number))
		{
			System.out.println("Valid Phone Number");
		}
		else {
			System.out.println("Not a Valid Phone Number");
		}
	}
	
	public static void isCreditCardNumber(String Number)
	{
		if(Number.length()==16 && isNumber(Number))
		{
			System.out.println("Valid Credit Card Number");
		}
		else {
			System.out.println("Not a Valid Credit Card Number");
		}
	}

}
