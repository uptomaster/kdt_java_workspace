package inheritance02;
// Animal 클래스의 자식 클래스 Bird class
public class Bird extends Animal{

	// 필드
	
	// 생성자
	public Bird() {}
	
	// 메소드
	
	void fly() {
		System.out.println(this.name + "이/가 하늘을 날고 있습니다.");
	}

}
