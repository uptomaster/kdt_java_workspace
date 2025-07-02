package interfaceTest03;
// 클래스와 인터페이스

class Parent {
	void parentMethod() {
		System.out.println("Parent 클래스의 메소드");
	}
}

interface InterC {
	void interMethod1();
}

interface InterD {
	void interMethod2();
}

class Children extends Parent implements InterC, InterD {
	// 상속은 단일상속, 구현은 다중구현. 둘은 별개임.
	@Override
	public void interMethod2() {
		System.out.println("InterMethod2 메소드 구현");
	}
	@Override
	public void interMethod1() {
		System.out.println("InterMethod1 메소드 구현");
	}
	@Override
	void parentMethod() { // 자식클래스에서 부모클래스의 메소드 오버라이딩
		System.out.println("Parent 메소드 구현");
	}
}

public class Main4 {
	public static void main(String[] args) {
		Parent p = new Children();
		p.parentMethod();
		
		Children obj = new Children(); // obj는 한개의 클래스를 상속받고, 두개의 인터페이스를 구현했다.
		obj.parentMethod();
		obj.interMethod1();
		obj.interMethod2();
	}
}
