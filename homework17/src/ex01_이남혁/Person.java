package ex01_이남혁;

public abstract class Person {

	// 필드
	private String name;
	private int age;
	// 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// 메소드
	public abstract void score(); // 추상메소드
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}

//Person 클래스를 상속하는 Student 클래스를 작성하기 
//Person 클래스의 필수 멤버(필요한 것은 추가하여 작성)
//필드 : 이름, 나이(접근제한자 private)
//생성자 : 매개변수 모두 받는 생성자(접근제한자 public)
//점수계산메소드(접근제한자 public, 메소드명 score) => 점수가 없습니다 출력
