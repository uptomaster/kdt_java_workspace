package inheritance;
// Person 클래스의 자식 클래스 Student
public class Student extends Person{

	// 필드
	String major;

	// 기본 생성자
	public Student() {
		this("이름없음", 0, "전공없음"); // this() : 같은 클래스의 다른 생성자 호출(자기자신의 생성자)
		System.out.println("Student 기본 생성자 호출");
	}
	
	public Student(String name, int age, String major) {
		super(name, age); // 부모 클래스의 생성자 호출
		this.major = major;
		System.out.println("Student 매개변수 있는 생성자 호출");
	}
	
	// 메소드
	void introduce() {
		super.introduce(); // 부모클래스의 멤버 참조
		System.out.println("전공 : " + this.major); // 현재 객체 자기 자신 참조
	}
	


}
