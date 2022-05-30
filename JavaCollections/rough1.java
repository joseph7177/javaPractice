package JavaCollections;

import java.util.Scanner;

public class rough1 {

	
		
		
	public static void main(String[] args) {
		
		int[][][] a = new int[2][3][4];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					a[i][j][k]= (int)(Math.random()*1000);
					System.out.println(a[i][j][k]);
					
				}
			}
		}
		
	ABC h = new ABC();
	h.ab();
		
				
		
		
		
	}
		
	
	}

class ABC
{

	public void ab()
	{
		ABC[] a = new ABC[5];
		a[0] = new ABC();
		a[1] = new ABC();
		a[2] = new ABC();
		a[3] = new ABC();
		a[4] = new ABC();
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
			
		}
		
		
	}
}


	
	





