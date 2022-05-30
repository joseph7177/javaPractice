package NaveenAutomationLabs__2;

import java.util.Arrays;

public class ShiftZeroToRight__70 {

	public static void main(String[] args) {

		int[] a = { 1, 0, 0, 2, 0, 0, 0, 2, 3, 4, 0, 0, 8, 0 };

		shiftZeroToRight(a);

	}

	public static void shiftZeroToRight(int[] a) {
		int[] b = new int[a.length];

		int count = 0;
		for (int num : a) {

			if (num != 0) {
				b[count] = num;
				count++;
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		

	}
}
