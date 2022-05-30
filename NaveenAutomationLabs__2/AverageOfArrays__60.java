package NaveenAutomationLabs__2;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

public class AverageOfArrays__60 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// by for loop
		int total = 0;
		for (int i : a) {
			total = total + i;
		}
		int average = total / a.length;
		System.out.println(total);
		System.out.println(average);
		
		// using Streams Concept
		OptionalDouble Avg = Arrays.stream(a).average();
		System.out.println(Avg);
		System.out.println(Avg.getAsDouble());
		
		// using google guava
		double avg = DoubleMath.mean(a);
		System.out.println(avg);

	}

}
