package Coding;

public class Pattern {

	public static void main(String[] args) {
		// 1
		// 2  3
		// 4  5  6
		// 7  8  9  10
		
		int k = 1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k +"   ");
				k++;
			}
			System.out.println(" ");
		}
		
		// 1  2  3  4
		// 5  6  7
		// 8  9
		// 10
		
		System.out.println("------------------------------------------");
		
		int m= 1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(m + "   ");
				m++;
			}
			System.out.println(" ");
		}
	}

}
