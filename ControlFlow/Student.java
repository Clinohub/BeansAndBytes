public class Student {

	private int marks;

	public Student (int marks) {
		this.marks = marks;
	}

	public char assignGrade() {
		char grade = '\000';
		if (marks < 0 || marks > 100)
			grade = 'X';
		else if (marks >= 90)
			grade = 'A';
		else if (marks >= 80)
			grade = 'B';
		else if (marks >= 70)
			grade = 'C';
		else if (marks >= 60)
			grade = 'D';
		else if (marks >= 50)
			grade = 'E';
		else
			grade = 'F';

		return grade;
	}

	public static void main(String[] args) {
		// Test Assign Grade A
		System.out.println("Test Assign Grade A");
		Student student = new Student(90);
		System.out.println(student.assignGrade());
		student = new Student(91);
		System.out.println(student.assignGrade());
		student = new Student(100);
		System.out.println(student.assignGrade());

		// Test Assign Grade B 
		System.out.println();
		System.out.println("Test Assign Grade B");
		student = new Student(80);
		System.out.println(student.assignGrade());
		student = new Student(81);
		System.out.println(student.assignGrade());
		student = new Student(89);
		System.out.println(student.assignGrade());

		// Test Assign Grade C 
		System.out.println();
		System.out.println("Test Assign Grade C");
		student = new Student(70);
		System.out.println(student.assignGrade());
		student = new Student(71);
		System.out.println(student.assignGrade());
		student = new Student(79);
		System.out.println(student.assignGrade());
		
		// Test Assign Grade D 
		System.out.println();
		System.out.println("Test Assign Grade D");
		student = new Student(60);
		System.out.println(student.assignGrade());
		student = new Student(61);
		System.out.println(student.assignGrade());
		student = new Student(69);
		System.out.println(student.assignGrade());

		// Test Assign Grade E
		System.out.println();
		System.out.println("Test Assign Grade E");
		student = new Student(50);
		System.out.println(student.assignGrade());
		student = new Student(51);
		System.out.println(student.assignGrade());
		student = new Student(59);
		System.out.println(student.assignGrade());

		// Test Assign Grade F 
		System.out.println();
		System.out.println("Test Assign Grade F");
		student = new Student(49);
		System.out.println(student.assignGrade());
		student = new Student(31);
		System.out.println(student.assignGrade());
		student = new Student(20);
		System.out.println(student.assignGrade());
		student = new Student(5);
		System.out.println(student.assignGrade());
		student = new Student(40);
		System.out.println(student.assignGrade());
		student = new Student(0);
		System.out.println(student.assignGrade());

		// Test Assign Grade X
		System.out.println();
		System.out.println("Test Assign Grade X");
		student = new Student(-1);
		System.out.println(student.assignGrade());
		student = new Student(101);
		System.out.println(student.assignGrade());
	}

} 
