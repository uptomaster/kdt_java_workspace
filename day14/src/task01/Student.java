package task01;

public class Student extends Person{
	// 서브 클래스 : Student
	// 필드 : 학번, 전공
	// 생성자 : 기본생성자(이름없음, 0, 값없음, 전공없음) 전달
	// 매개변수가 4개있는 생성자
	// 생성자 안에서 Student 생성자 호출 출력하기.
	// 부모클래스의 introduce 메소드 오버라이딩
	// 부모 메소드 호출
	// 학번과 전공도 출력하는 메소드
	
	// 필드
	String classnumber;
	String major;
	
	// 매개변수가 4개 있는 생성자
	public Student(String name, int age, String classnumber, String major) {
		super(name, age); // 부모의 생성자 호출
		this.classnumber = classnumber;
		this.major = major;
		System.out.println("Student 생성자 호출");
	}
	
	// 기본생성자
	public Student() {
		this("이름없음", 0, "값없음", "전공없음");
		System.out.println("Student 생성자 호출");
	}
	

	// 메소드
	void sleep(int time) {
		super.sleep(time);
		System.out.println("학번 : " + this.classnumber + ", 전공 : " + this.major);		
	}
	void introduce() {
		super.introduce();
		System.out.println("학번 : " + this.classnumber + ", 전공 : " + this.major);
	}
}
