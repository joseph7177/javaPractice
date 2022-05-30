package NaveenAutomationLabs__2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class joiningtwoArrays__59 {

	public static void main(String[] args) {
		
		String[] batsmen = {"Rohit","Virat","Dhawan","Shreyas","Rishab","Shubman"};
		String[] bowlers = {"Hardik","Bhuvi","Bhumrah","Chahal","Jaddu"};
		
		
		// using java8
		String[] fullTeam = Stream.concat(Arrays.stream(batsmen), Arrays.stream(bowlers)).toArray(size-> new String[size]);
	
		for(String team : fullTeam)
		{
			System.out.println(team);
		}
		
	List<String> fullTeamList = Stream.concat(Arrays.stream(batsmen), Arrays.stream(bowlers)).collect(Collectors.toList());
		System.out.println(fullTeamList);
		
		System.out.println("=======================================================");
		
		// using google guava for Objects Array
		String[] allTeam = ObjectArrays.concat(batsmen, bowlers,String.class);
		Arrays.asList(allTeam).stream().forEach(s-> System.out.println(s));
		
		int[] a= {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		
		int[] c = Ints.concat(a,b);
		for(int i : c)
		{
			System.out.print(i + ",");
		}
	}

}
