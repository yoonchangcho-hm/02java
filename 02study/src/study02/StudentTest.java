package study02;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student();
		lee.studentName = "이순신";
		lee.address = "서울";
		
		Student han = new Student();
		han.studentName = "환석봉";
		han.address = "부산";
			
	
	
	
//		System.out.println(lee.studentName);
	
		 lee.showInfo();
		 han.showInfo();
		 
		 System.out.println(lee);
		 System.out.println(han);
	}

}
