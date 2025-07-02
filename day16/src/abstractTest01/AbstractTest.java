package abstractTest01;
// 4번 : 일반 클래스와 추상 클래스 객체화
public class AbstractTest {
	public static void main(String[] args) {
		// 일반클래스 ClassA 객체화
		ClassA a = new ClassA();
		System.out.println(a); // 객체화가 되었다는 의미 = 메모리 주소가 할당됨.
		a.method1();
		
		// 추상클래스 ClassB 객체화는 불가능하다. -> 미완성된 클래스
//		ClassB b = new ClassB(); //Cannot instantiate the type ClassB
		
		// 추상클래스 ClassB를 상속받은 일반클래스 ClassC의 객체화를 해보자.
		ClassC c = new ClassC(); // 가능
		c.method1(); // 추상클래스 ClassB에 선언된 추상 메소드였다. ClassC에서 재정의하였음.
		c.method2(); 
		c.printNumber();
		
		ClassB b = new ClassC(); // 업캐스팅(자식 -> 부모클래스 형변환)
		b.method1();
		b.method2();
		
		// 다운캐스팅
		((ClassC)b).printNumber(); // 다시 원상복구한다.
		
		
	}
}
