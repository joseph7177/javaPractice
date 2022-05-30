package NaveenAutomationLabs;

public class FindMissingNumber_4 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int sum =0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
			// why we have assigned i as 0 because array always starts with 0 index 
		{
			sum=sum + a[i];
		}
		
		for(int j=1;j<=10;j++)
		{
			sum1=sum1 + j;
		}
		
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println("Missing number is => " +(sum1-sum));

	}

}
