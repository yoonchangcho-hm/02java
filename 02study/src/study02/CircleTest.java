package study02;

public class CircleTest {

	public static void main(String[] args) {
		Circle obj = new Circle(); //객체를 생성
		
		obj.radius = 100; //객체의 필드 접근
		obj.color = "blue";
		obj.radius = 1000;
		
//		obj.getArea();
		
		
//		System.out.println(obj);
//		System.out.println(obj.radius + ", " + obj.color);
		
//		System.out.println(obj.getArea1());

		
//		int area = (int)obj.getArea1();
		double area = obj.getArea1();
		System.out.println("원의 면적은 " + area);
		
	}

}
