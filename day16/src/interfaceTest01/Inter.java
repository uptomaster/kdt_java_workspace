package interfaceTest01;

// 6번 : 인터페이스 선언
public interface Inter { // 대표 인터페이스도 public이 붙는다. (클래스와 마찬가지)

	// 멤버로는 상수, 추상 메소드만 가능하다.
	public final static int VAR1 = 10;
	int VAR2 = 20;
	
	public abstract void method1();
	void method2();

}
