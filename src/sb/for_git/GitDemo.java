package sb.for_git;

import java.util.*;

import sb.for_git.ex_1.Student;

public class GitDemo {
	
	static List<Student> getStudents(){
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(101, "Aakash"));
		students.add(new Student(102, "Akshar"));
		
		return students;
	}

	public static void main(String[] args) {

		System.out.println("\n This project is to learn git");

		Student student = new Student(101, "Rajat");

		System.out.println(student);

	}

}
