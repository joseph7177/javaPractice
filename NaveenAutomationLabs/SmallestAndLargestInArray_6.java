package NaveenAutomationLabs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestAndLargestInArray_6 {

	public static void main(String[] args) {

Integer	a[]= {-78,5,2,6,8,5,3,2,48,9,6,4,2,3,55,77,44};

    // 1st method
	List<Integer> b =  Arrays.asList(a).stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(b);
	System.out.println("Smallest => "+b.get(0));
	System.out.println("Largest => " +b.get(b.size()-1));
	
	// 2nd Method
	int smallest = a[0];
	int largest = a[0];
	
	
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>largest)
		{
			largest = a[i];
		}
		else if(a[i]<smallest){
			smallest = a[i];
		}
	}
	System.out.println(Arrays.toString(a)); // to print array
	System.out.println(smallest);
	System.out.println(largest);
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
