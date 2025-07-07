package review;

import java.util.Scanner;

// 과제 메소드 만들기
public class Task01 {

	public static void main(String[] args) {

		// 객체명.메소드명 호출
		Task01 t1 = new Task01();
		System.out.println(t1.countWord(""));
		System.out.println(t1.countWord("i love java"));
		System.out.println(t1.countWord("i love java"));

		// 2번 문제

		System.out.println("====================3번문제======================");
		// 3번 문제 : 매개변수 O, 2차원배열의 리턴값 O
		Scanner sc = new Scanner(System.in);
		int[][] scores = t1.inputScores(3, 3, sc); // 3명, 3과목

		System.out.println("=====================학점결과=====================");

		for (int i = 0; i < scores.length; i++) { // 행의 길이(학생 수)만큼 반복
			String grade = t1.getGrade(scores[i][0], scores[i][1], scores[i][2]);
			System.out.println(i + 1 + "번째 학생의 학점 : " + grade);
		}

	}

	// 1번 : 문자열 속의 단어를 공백 기준으로 세기.

	// 1) 리턴타입 => void
	// 2) 메소드명 => countWord
	// 3) 매개변수 => String str
	// 4) 구현부
	// 1. 문자열 속의 단어를 공백 기준으로 세기.
	// 메소드명 : countWord
	// 매개변수가 필요함.
	// ex) I love java. => 3개
	int countWord(String str) {

		int count = 0;
		boolean word = false;

		if (str == null) {
			return 0;
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// 문자를 만나면 단어 시작
			if (c != ' ' && !word) {
				word = true;
				count++;
			}

			// 공백을 만나면 단어 끝
			else if (c == ' ') {
				word = false;
			}
		}
		return count;
	}

	// 2번 : 주민등록번호로 성별 판단하기
	// 메소드명 : getGender
	// 매개변수 : String str 000000-3 => 여자
	// 1, 3 => 남자 2, 4 => 여자

	// <방법 1 : 조건문 >
	// 구현부 => 조건문 (null || str.length() < 8 || str.charAt(6) != '-') 일때,
	// return "잘못된 문자열입니다." => return 타입은 String.
	// 매개변수로 받은 str.charAt(7)를 문자형 변수 char c에 저장하고,
	// 조건문 if문으로 c == '1' || c == '3' => return "남자"
	// else if c == '2' || c=='4 => return "여자"
	// else => return "알 수 없습니다."
	String getGender(String str) {
		char c = ' ';
		if (str == null || str.length() < 8 || str.charAt(6) != '-') {
			return "잘못된 문자열입니다.";
		}
		c = str.charAt(7); // 성별을 확인할 수 있는 번호를 저장
		if (c == '1' || c == '3') {
			return "남자입니다.";
		} else if (c == '2' || c == '4') {
			return "여자입니다.";
		} else {
			return "잘못된 입력입니다.";
		}

	}

	// <방법 2 : switch문>
	String switchGender(String str) {
		char c = ' ';
		if (str == null || str.length() < 8 || str.charAt(6) != '-') {
			return "잘못된 문자열입니다.";
		}
		c = str.charAt(7);

		switch (c) {
		case '1', '3':
			return "남자"; // return이 있으면 break 하지 않아도 됨.
		case '2', '4':
			return "여자";
		default:
			return "잘못된 입력";

		}

	}

	// 문제 3 : 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균을 구하여 각 학생별 학점 구하기

	// 방법 1 : if ~ else if ~ else문 이용하기.
	// 매개변수 : 정수형 3개

	// 2) 학점 계산 메소드

	String getGrade(int math, int kor, int eng) {
		// 3개의 값을 합하고 3으로 나눈 값을 저장할 변수
		int avg = (math + kor + eng) / 3;

		if (avg >= 95) {
			return "학점 : A+입니다.";
		} else if (avg >= 90) {
			return "학점 : A입니다.";
		} else if (avg >= 85) {
			return "학점 : B+입니다.";
		} else if (avg >= 80) {
			return "학점 : B입니다.";
		} else if (avg >= 75) {
			return "학점 : C+입니다.";
		} else if (avg >= 70) {
			return "학점 : C입니다.";
		} else {
			return "학점 : F입니다.";
		}
	}

	// 방법 2 : 2차원 배열 이용하기.

	// 1) 점수 입력 받는 메소드
	// 리턴타입 : void => int[][];
	// 메소드명 : inputScore
	// 매개변수 : 정수형 학생수, 정수형 과목수 => 행, 열을 나타내기 위함. + 입력클래스
	// 정수형 2차원 배열명 = new int [학생수][과목수]; 전달받기.
	// 반복문 for => 학생수가 1번 돌때 과목수가 3번도는 루프 작성.
	// 바깥 for문 : int i = 0; i < 학생수; i++ (행)
	// i+1번 학생의 점수를 입력하세요 : 출력
	// 안쪽 for문 : int j = 0; j < 과목수; j++ (열)
	// 점수 입력.
	// if(j==0) subject = "수학";
	// else if(j==1) subject = "영어";
	// else if(j==2) subject = "국어";
	// 출력메세지 : subject + "점수입력";
	// + 입력메소드 사용 : 배열[i][j] = sc.nextInt();
	// return 배열명;

	int[][] inputScores(int studentCnt, int subjectCnt, Scanner sc) {

		int[][] scores = new int[studentCnt][subjectCnt];
		for (int i = 0; i < studentCnt; i++) {
			System.out.println((i + 1) + "번 학생의 점수를 입력하세요 : ");

			for (int j = 0; j < subjectCnt; j++) {

				String subject = "";
				if (j == 0)
					subject = "수학";
				else if (j == 1)
					subject = "영어";
				else if (j == 2)
					subject = "국어";

				System.out.println(subject + " 점수 입력 : ");
				scores[i][j] = sc.nextInt();
			}
		}
		return scores;

	}

}
