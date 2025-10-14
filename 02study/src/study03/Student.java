package study03;

public class Student {
	int studentNumber;
	String studentName;
	int grade;

	public Student() {
	}

//	public Student(int i, String s, int j) {
//		studentNumber = i;
//		studentName = s;
//		grade = j;
//	}

	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public Student(int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;

	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber+ "입니다.";
	}

}
