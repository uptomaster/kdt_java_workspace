package staticTest01;

// 9번 : 정적변수와 정적메소드
public class MyClassA {

	//필드(인스턴스변수, 스태틱 변수, 상수)
	// 인스턴스 변수
	int instanceVar;
	
	// 스태틱 변수
	static int staticVar;

	// 기본 생성자
	public MyClassA() {
		
	}
	
	// 메소드(인스턴스 메소드 / 스태틱 메소드)
	// 인스턴스 메소드1
	void instanceMethod1() {
		System.out.println("인스턴스 메소드1 호출되었습니다.");
		instanceVar = 10;
		System.out.println("인스턴스 메소드1에서의 인스턴스 변수값 : " + this.instanceVar);
		staticVar = 100;
		System.out.println("인스턴스 메소드1에서의 스태틱 변수값 : " + staticVar); // this를 쓸 필요가 없다.
		instanceMethod2();
	}
	// 인스턴스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드2 호출되었습니다.");
		staticMethod1(); // 인스턴스는 스태틱에 항상 접근할 수 있다.
	}
	// 스태틱 메소드1
	static void staticMethod1() {
		System.out.println("스태틱 메소드1 호출되었습니다.");
		staticVar = 1000; // 스태틱 메소드에서는 인스턴스 메소드 호출 불가. 
		System.out.println("스태틱 메소드1에서 스태틱 변수값 : " + staticVar);
		// 스태틱 메소드에서는 스태틱 메소드 또는 스태틱 변수에만 접근이 가능하다.
	}
	// 스태틱 메소드2
	static void staticMethod2() {
		System.out.println("스태틱 메소드2 호출되었습니다.");
//		instanceMethod1(); // 저장공간이 다르기 때문에 불가능. (객체 생성 전에는 인스턴스 메소드는 없는 녀석이다.)
	}
	
}
