package classBasic;
// 10-1번 : 사용자 정의 타입
public class Student {

	// 필드(속성)
	// 이름, 수학점수, 영어점수, 국어점수, 평균점수
	String name = "";
	int math_Score = 0, eng_Score = 0,kor_Score = 0;
	int sum = math_Score + eng_Score + kor_Score;
	double avg_Score = sum / 3.0;
	
	
	
	
	// 메소드(행동, 동작, 기능)
	// 10-3번 : 연관성 있는 저장공간과 기능을 한곳에 모아 관리할 수 있다.
	// 정수의 총합을 반환하는 메소드
	int getTotal() {
		int total = 0;
		total = math_Score + eng_Score + kor_Score;
		return total;
	}
}
