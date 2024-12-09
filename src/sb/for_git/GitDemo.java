package sb.for_git;

import java.util.ArrayList;
import java.util.List;

import sb.for_git.ex_1.Student;

public class GitDemo {

	public static void main(String[] args) {

		System.out.println("\n This project is to learn git");

		Student student = new Student(101, "Rajat");

		System.out.println(student);

	}
	
	static void modifyStudent(){
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Umesh"));
		students.add(new Student(11, "Vijay"));
		
		System.out.println(students);
		
	}

}
