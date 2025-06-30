package methodoverride01;
// 6번 : 오버라이딩
// Animal 클래스의 상속을 받은 클래스
public class Dog extends Animal{
	
	// 메소드 오버라이딩 : alt + shift + s + v => 오버라이딩 단축키
	@Override // 오버라이딩 의도를 명시. 어노테이션.
	// 컴파일러가 확인할 수 있도록 명시하는 것을 "어노테이션"이라고 한다.
	void sound() {
		System.out.println("멍멍!!!");
	}

	

}
