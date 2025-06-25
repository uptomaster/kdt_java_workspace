package staticTest01;
// 9번 : 정적변수와 정적메소드 Main 클래스
public class MyClassB {

	public static void main(String[] args) {
		// 1. 인스턴스 변수 출력 => 객체생성 필수
		MyClassA A = new MyClassA();
		System.out.println(A); // Heap 메모리 참조값
		A.instanceVar = 10;
		System.out.println(A.instanceVar); // 10
		
		
		MyClassA aa = new MyClassA();
		System.out.println(aa);
		aa.instanceVar = 100;
		System.out.println(aa.instanceVar); // 100
	
		// 2. 정적변수 출력 => 객체 생성으로 접근 가능하지만 권장하지 않음
	      // 클래스명.정적변수명으로 접근한다!! => 공통된 저장공간을 사용한다!!!!!
	      A.staticVar = 20;
	      System.out.println(A.staticVar); // 20
	      aa.staticVar = 200; // 저장공간은 단 하나이므로 최종 저장값이 저장된다. 객체와는 무관하다.
	      System.out.println(aa.staticVar); // 200
	      System.out.println(A.staticVar); // 200
	      
	      MyClassA.staticVar = 100; // 클래스명으로 정적변수에 접근해라.
	      System.out.println(MyClassA.staticVar); // 100
	      
	      // 3. 다른 클래스에서 인스턴스 메소드 호출
	      A.instanceMethod1();
	      A.instanceVar = 20;
	      A.instanceMethod1();
	      
	      // 4. 다른 클래스에서 스태틱 메소드 호출
	      MyClassA.staticMethod1();
	}

}
