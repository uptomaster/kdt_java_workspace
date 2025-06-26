package staticTest;

// 2번 : 클래스 상수와 인스턴스 상수
public class ConstantClass {
	// 필드 
		// 클래스 내부에서 상수 선언
	// heap 영역, 객체 생성시 초기화, 객체마다 독립적. 특정 객체마다 고유한 상수를 정의할 때 인스턴스 상수 사용.
	final double PI = 3.14159265359; // 인스턴스 상수
		
	// method 영역, 클래스 로드 시 초기화, 모든 객체가 공유, 클래스 전체에서 공통으로 사용하는 상수
	static final int MAX_LENGTH = 100; // 스태틱 상수(클래스 상수)
		
	//메소드
	
	public static void main(String[] args) {
		ConstantClass c = new ConstantClass();
		
		System.out.println(c.PI);
		System.out.println(ConstantClass.MAX_LENGTH);
		System.out.println(new ConstantClass().PI); // heap 영역에서 만들고 바로 값을 가져오는 방법
	}
}
