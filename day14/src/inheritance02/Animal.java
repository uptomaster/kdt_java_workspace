package inheritance02;
// 2번 : 상속기초
public class Animal {

	// 필드
	String name;
	int age;
	String type;
	
	// 생성자
	public Animal() {
		super();
	}

	// 메소드
	// 먹고 자기
	void eat(String food) {
		System.out.println(this.name + "이/가 " + food + "를 먹고 있습니다.");
	}
	void sleep(int time, String place) {
		System.out.println(this.name + "이/가 " + time + 
				"시에 "+ place +"에서 잠을 잡니다.");
	}
}

