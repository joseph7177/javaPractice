package NaveenAutomationLabsPractice;

public class smalletAndLargestNumber {

	public static void main(String[] args) {
		double a[] = {7,2,5,-123,2345,6543,345678,9876543,-2345678,9};
		double smallestNo = a[0]; //-123
		double largestNo = a[0];  //2345
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largestNo) largestNo = a[i];
			else if(a[i]<smallestNo) smallestNo = a[i];
		}
		
		System.out.println(smallestNo);
		System.out.println(largestNo);
		
		

	}

}
