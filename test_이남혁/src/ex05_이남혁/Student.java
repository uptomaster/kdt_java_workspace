package ex05_이남혁;

public class Student extends Person {
	// 필드
	int javaScore;
	int dbmsScore;
	int htmlScore;
	Major major;

	// 매개변수가 4개인 생성자
	public Student(String name, int javaScore, int dbmsScore, int htmlScore, Major major) {
		super(name); // 부모클래스인 Person 호출, name전달
		// 각 점수들을 해당 객체에 저장
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major;
	}

	// 메소드
//  – 총점 반환
	int getTotalScore() { // 총점 반환하는 메소드 int타입
		return javaScore + dbmsScore + htmlScore;
	}

//  – 정수 평균 반환
	int getAverageScore() { // 총점 반환하는 메소드를 호출한 뒤, 3으로 나누어 리턴
		return getTotalScore() / 3;
	}

//  – 전공 반환
	Major getMajor() {
		return major;
	}

}
