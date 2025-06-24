package method;
// 2번 : 메소드를 사용하는 이유2(높은 재사용성)
public class MethodBasic02 {

	public static void main(String[] args) {
		MethodBasic02 mb = new MethodBasic02(); // 클래스 객체 생성
		// 동일한 로직을 구현하기 위해 새롭게 코드를 작성할 필요없이
		// 이미 작성된 메소드를 호출하면 된다.
		// 작성된 코드의 재사용성을 높일 수 있다.
	
		System.out.println("첫번째 직사각형의 면적 : " + mb.calculateArea(5, 10));
		System.out.println("두번째 직사각형의 면적 : " + mb.calculateArea(500, 123));
		
	}

	// 직사각형의 넓이를 구하는 메소드 만들기
	int calculateArea(int width, int height) {
		return width*height;
	}
	
	
}
