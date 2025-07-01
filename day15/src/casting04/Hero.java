package casting04;
// 7번 : 캐스팅 예제
public class Hero {

	// 필드
	private String name;

	// 매개변수가 있는 생성자 => setter 메소드는 필요없음
	public Hero(String name) {
		super();
		this.name = name;
	}

	// getter 메소드
	public String getName() {
		return name;
	}
	
	// 메소드
	void superPower() {
		System.out.println(this.name + "이/가 Super Power를 사용합니다!");
	}
	
	void say() {
		System.out.println(this.name + "이/가 대사를 외칩니다!");
	}
	
	
	
}
