package homework15;

public class Student extends Person {

	// 필드
	boolean stu;

	// 생성자
	public Student(String name, boolean stu) {
		super(name);
		this.stu = stu;
	}

	// introduce() 오버라이딩
	@Override
	void introduce() {
		System.out.println(this.getName() + "은 학생입니다.");
	}

	// 자식클래스에 메소드 추가
	void study() {
		System.out.println(this.getName() + "이 공부합니다.");
	}

	// boolean 타입의 변수는 is + 필드명으로 지어진다.
	public boolean isStu() {
		return stu;
	}

	public void setStu(boolean stu) {
		this.stu = stu;
	}
	
	
}
