package innerTest;

// 25번 : 내부클래스
public class Outer {
	// Outer 클래스의 필드
	int var1;
	String data1 = "Outer";

	// Outer 클래스의 기본 생성자
	public Outer() {
		super(); // Object 클래스의 생성자 호출
		System.out.println("외부 클래스의 기본 생성자");
	}
	// Outer 클래스의 인스턴스 메소드
	void outerMethod() {
		System.out.println("외부 클래스의 메소드 호출");
	}
	
	// 내부 클래스 : Inner
	class Inner{
		// 필드, 생성자, 메소드
		// Inner 클래스의 필드
		int var2 = 10;
		String data2 = "Inner";
		
		public Inner() {
			super(); // Object 클래스의 생성자 호출
			System.out.println(this);
			System.out.println("내부 클래스의 생성자 호출");
		}
		
		// Inner 클래스의 메소드
		void innerMethod() {
			System.out.println("내부 클래스의 메소드 호출");
			var2 = 20;
//			this.var1 = 10; => 이건 사용할수없음.(오류발생)
			var1 = 100; // 외부클래스를 내부클래스에서 사용할때는 그냥 불러써야함. 
			// = 외부클래스의 객체를 만들어야만 내부 클래스의 객체를 만들 수 있음.
			System.out.println("내부클래스에서 외부클래스 변수 var1의 값 : " + var1);
			System.out.println("내부클래스에서 내부클래스 변수 var2의 값 : " + var2);
		}
		
	} // 내부 클래스의 중괄호 종료
	
} // 외부 클래스의 중괄호 종료
