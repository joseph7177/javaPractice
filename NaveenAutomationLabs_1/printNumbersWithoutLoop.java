package NaveenAutomationLabs_1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class printNumbersWithoutLoop {

	public static void main(String[] args) {
		
		printNumbers(1,100);
		
		System.out.println("");
		
		// using Streams concept
		IntStream.range(1, 101).forEach(s-> System.out.print(s +"  "));
		
		

	}
	
	// recursive function 
	public static void printNumbers(int startingNum, int EndingNum)
	{
		if(startingNum<=EndingNum)
		{
			System.out.print(startingNum+ "  ");
			startingNum++;
			printNumbers(startingNum,EndingNum);
		}
		
	}

}
