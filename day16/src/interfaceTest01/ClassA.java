package interfaceTest01;
// 8번 : 인터페이스 구현
public class ClassA implements Inter{

	// Inter : 부모 인터페이스
	// ClassA : 자식 클래스
	
	@Override
	public void method1() {
		System.out.println("method1 오버라이딩!");
	}

	@Override
	public void method2() {
		System.out.println("(앞의 키워드를 없앴지만) method2 오버라이딩!");
	}
	
	
	
}
