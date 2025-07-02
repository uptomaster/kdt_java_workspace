package interfaceTest03;

interface InterA {
	void methodA();
}

interface InterB {
	void methodA();
	void methodB();
}

//구현하는 클래스 => 
class ClassC implements InterA, InterB { 
	// 같은 이름의 추상 메소드를 선언해도, 어차피 클래스에서 오버라이딩을 해야함.

	@Override
	public void methodA() {
		System.out.println("InterA의 메소드 구현");
	}

	@Override
	public void methodB() {
		System.out.println("InterB의 메소드 구현");
	}
}

public class Main2 {
	public static void main(String[] args) {

		System.out.println("'클래스는 인터페이스를 다중구현이 가능하다.'");
		System.out.println("=============================");
		ClassC c = new ClassC();
		c.methodA();
		c.methodB();
		
		// 업캐스팅
		InterA a = new ClassC();
		InterB b = new ClassC();
		
		System.out.println("==========업캐스팅 이후==========");
		a.methodA();
		b.methodA();
		b.methodB();
		
	}
}
