package inheritanceConstructor01;
//3번 : 상속관계-생성자 확인
// 자식클래스(서브클래스)
public class Child extends Parents{
	// 필드
	int num;

	// 기본 생성자
	public Child() {
		super(); // 부모클래스의 생성자를 호출하는 코드
		System.out.println("Child클래스 생성자 호출");
	}
	
	// 메소드
	void printInt(int num) {
		System.out.println("자식 클래스에서의 메소드 호출 : " + num);
	}
	
}
