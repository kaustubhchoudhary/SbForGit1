package sb.for_git.ex_1;

public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n Student [id=" + id + ", name=" + name + "]";
	}

	Student getSingleStudent() {
		return new Student(456, "Harish");
	}
}
