package interfaceTest04;
// 16번 : 다중상속(모호성 해결방법 예제)
public class ClassB extends ClassA implements Inter1{
	// ClassB는 ClassA를 상속받고, Inter1을 구현하는 자식클래스이다.
	// ClassA와 Inter1 모두 같은 이름, 같은 리턴타입, 같은 매개변수를 갖는 void printText()를 갖고 있지만,
	// 오류가 나지 않는다.
	// 그 이유는 => 상속하는 클래스인 부모 클래스가 부모 인터페이스인 Inter1보다 우선순위가 더 높기 때문이다.
	
}
