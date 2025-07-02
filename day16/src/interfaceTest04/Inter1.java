package interfaceTest04;

public interface Inter1 {

	// 인터페이스
	// default를 사용하려면 명시해야 한다.
	// default, private, static 을 붙이면 메소드를 구현까지 할 수 있다.
	default void printText() {
		System.out.println("Inter1의 printText() 호출");
	}
}
