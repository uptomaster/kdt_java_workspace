package interfaceTest03;
// 10번 : 클래스 단일 상속

class Parents {
	void printInfo() {
		System.out.println("부모 클래스");
	}
}

class Child extends Parents{ // 클래스는 단 하나의 부모만 가질 수 있다.
	@Override
	void printInfo() {
		System.out.println("자식 클래스");
	}

}

class Parents2 {
	void printInfo2() {
		System.out.println("부모2 클래스");
	}
}

public class Main {
	public static void main(String[] args) {

	}
}
