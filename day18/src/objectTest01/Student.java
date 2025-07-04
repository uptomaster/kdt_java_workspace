package objectTest01;

// 3번 : Object 클래스 - toString() 메소드
public class Student {
	// 필드
	String name;
	int javaScore;
	int dbmsScore;
	int total;

	// 생성자
	public Student(String name, int javaScore, int dbmsScore, int total) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.total = total;
	}
	// 메소드

	@Override
	public String toString() {
		return "학생 정보 : " + name + ", java점수 : " + javaScore + ", db점수 : " 
	+ dbmsScore + ",total : " + total;
	}

	// 객체의 참조값이 나오는 이유
//	public String toString() {
//		return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	}

}
