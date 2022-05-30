package NaveenAutomationLabs__2;

import java.util.ArrayList;

public class StudentTestclass__69 {

	public static void main(String[] args) {
		
		Student__69 s1 = new Student__69("Amith", 01, 100, 24);
		Student__69 s2 = new Student__69("Arjun", 02, 96, 40);
		Student__69 s3 = new Student__69("Surya", 03, 90, 43);
		Student__69 s4 = new Student__69("Dhruva", 04, 89, 34);
		Student__69 s5 = new Student__69("Tiger", 05, 56, 28);
		
		// add all the student objects to the ArrayList
		ArrayList<Student__69> studentList = new ArrayList<>(); 
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		studentList.stream().filter(s-> s.getName().contains("Amith")).forEach(s-> System.out.println(s));
		
		studentList.stream().filter(s-> s.getMarks()>95).forEach(s -> System.out.println(s.getName()+" => "+s.getMarks()));

	}

}
