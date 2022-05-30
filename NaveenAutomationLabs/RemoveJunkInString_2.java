package NaveenAutomationLabs;

public class RemoveJunkInString_2 {

	public static void main(String[] args) {
	//How to remove Junk characters,Unwanted characters,special characters from a particular String
		
		String s = "^*&$#()&%Hel#@%lo @#$%^& Ami%^&th @#$%^& 1111";
		
		// Regular Expression [^a-zA-Z0-9] this can be applied on any string
		s = s.replaceAll("[^a-zA-z0-9]", "");   // ^ = notEqualTo  (this is not replaceable)
		System.out.println(s);
	}

}
