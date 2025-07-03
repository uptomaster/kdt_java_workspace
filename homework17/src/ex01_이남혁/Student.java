package ex01_이남혁;

public class Student extends Person{

	// 필드
	private int score;
	// 생성자
	public Student(String name, int age) {
		super(name, age);
	}
	// 메소드 오버라이딩
	@Override
	public void score() {
		System.out.println(getName() + "의 점수는 " + getScore() + "점입니다.");
	}
	
	// 메소드
	public int getScore() {
		return score;
	}

	
}

//Student클래스
//필드 : 점수(접근제한자 private)
//생성자 : 매개변수 모두 받는 생성자(접근제한자 public)
//점수계산메소드 오버라이딩 => 학생이름의 점수는 몇점입니다 출력
//
//[ 조건 ] Person클래스 Student클래스의 상속구조를 추상클래스나 인터페이스 구조로 확장하기