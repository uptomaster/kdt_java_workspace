package interfaceTest04;
// 17번 : 다중상속(모호성 해결방법 예제)
public interface Inter2 {

	// 인터페이스 default
	default void printText() {
		System.out.println("Inter2의 printText() 호출");
	}
	
}
