package homework15;

public class Employee extends Person {

	// 생성자
	public Employee(String name) {
		super(name);
	}

	// 메소드 오버라이딩
	@Override
	void introduce() {
		System.out.println(this.getName() + "은 회사원입니다.");
	}

	// 메소드 추가
	void work() {
		System.out.println(this.getName() + "이 일하고 있습니다.");
	}

}
