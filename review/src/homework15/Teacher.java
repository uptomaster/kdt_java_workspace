package homework15;

public class Teacher extends Person {

	// 필드
	private String subject; // 담당 과목

	// 생성자
	public Teacher(String name) {
		super(name);
	}

	// 메소드 오버라이딩
	@Override
	void introduce() {
		System.out.println(this.getName() + "은 선생님입니다.");
	}

	// 추가 메소드
	void teach() {
		System.out.println(this.getName() + "이 " + this.getSubject() + " 과목을 가르칩니다.");
	}

	// setter, getter 메소드
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
