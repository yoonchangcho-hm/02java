package study03;

public class StudentTest {

	public static void main(String[] args) {
//		Student lee = new Student();
//		lee.studentName = "이순신";
		
		Student han = new Student(123,"한석봉");
		Student kim = new Student(124,"김영",3);
		
//		System.out.println(han.studentName);
//		System.out.println(kim.studentName);
		
		System.out.println(han.showStudentInfo());
		System.out.println(kim.showStudentInfo());
		
		
		
		
	}

}
