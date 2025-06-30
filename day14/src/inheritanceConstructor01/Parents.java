package inheritanceConstructor01;
// 3번 : 상속관계-생성자 확인
// 부모클래스(슈퍼클래스)
public class Parents {
	// 필드
	int number;
	// 기본생성자
	public Parents() {
		super(); // 부모클래스의 생성자 => 모든 클래스의 최상위 부모 클래스는 Object 클래스임.
		System.out.println("Parents 생성자 호출");
	}
	
	void printStr(String str) {
		System.out.println("부모 클래스에서 메소드 호출 : " + str);
	}
	
}
