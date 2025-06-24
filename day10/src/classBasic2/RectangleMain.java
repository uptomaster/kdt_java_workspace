package classBasic2;
// 12번 : Rectangle 클래스의 객체 
public class RectangleMain {

	public static void main(String[] args) {
		
		//객체 생성
		Rectangle r1 = new Rectangle();
		System.out.println(r1); // classBasic2.Rectangle@279f2327
		
		//객체명.필드명 = 값;
		r1.width = 10;
		r1.height = 20;
		
		//넓이 구하는 메소드 호출 - 매개변수X 리턴값O
		System.out.println(r1.getArea());
		
		//둘레 구하는 메소드 호출 - 매개변수X 리턴값X
		r1.getPerimeter();
		
	}

}
