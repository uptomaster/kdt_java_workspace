package interfaceTest01;
// 7번 : 인터페이스 객체화와 구현한 클래스 객체화 확인
public class InterMain {
	public static void main(String[] args) {
		// 인터페이스를 객체화할 수 있는가? => (X)
		// Inter i = new Inter(); // Cannot instantiate the type Inter
		// 추상 메소드를 구현한 클래스로 객체화시켜야 한다!
		
		// ClassA는 클래스이므로 객체화 가능
		ClassA a = new ClassA();
		a.method1();
		
		
		// a라는 객체를 Inter 인터페이스로 업캐스팅이 가능한가?
		Inter i = new ClassA(); // 자식클래스 -> 부모인터페이스 업캐스팅가능
		
		System.out.println(a.VAR1);
		System.out.println(a.VAR2);
		System.out.println(ClassA.VAR1); // static상수 또한 클래스명으로 접근한다.
		System.out.println(Inter.VAR1); // static상수 또한 클래스명으로 접근한다.
		System.out.println(Inter.VAR2); // static상수 또한 클래스명으로 접근한다.
		
		a.method2(); // public, static, abstract를 생략했지만 알아서 붙여줌.
	
	}
}
