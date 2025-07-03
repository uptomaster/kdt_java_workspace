package anonymousTest;
// 4번 : 익명클래스 객체화 위한 인터페이스
@FunctionalInterface // 어노테이션 -> 하나의 추상메소드만 존재해야 람다식을 쓸 수 있음.
public interface InterA {

	// 추상메소드
	void method();
}
