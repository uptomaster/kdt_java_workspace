package task;

import java.util.Scanner;

// 메소드 문제
public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===================1번===================");
		// 1번 문제
		countWord("I love Java.");
		countWord("I went Japan yesterday .");
		countWord(""); // null일때는 예외처리
		countWord("      abc    d e"); // 공백이 여러번 들어간다면? => 예외처리해야함.
		
		System.out.println("===================2번===================");
		// 2번 문제
		System.out.printf("주민등록번호 뒷자리 7자리를 입력하세요 : ");
		getGender("3222222");
		
		System.out.println("===================3번===================");
		// 3번 문제
		// 학생1의 수학,영어,국어 점수
	
		System.out.println("학생 3명의 평균 점수로 등급 구하기");
		
		int math[] = new int[3];
		int eng[] = new int[3];
		int kor[] = new int[3];
		
		int avg[] = new int[3];
		String name[] = {"1", "2", "3"};
		for(int i = 0; i < 3; i++) {
			System.out.println("(수학,영어,국어 점수를 순서대로 입력하세요. 띄어쓰기로 구분합니다.) : ");
			math[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			kor[i] = sc.nextInt();
			
			avg[i] = (math[i] + eng[i] + kor[i]) / 3;
		}

//		System.out.println(avg[]);
		
//		getGrade(name[], avg[]);
//		for(int i = 0; i < 3; i++) {
//			getAvg(math[i] + eng[i] + kor[i]);
//		}
		
		// 학생 a의 수학, 영어, 국어점수
		
//		System.out.println("(수학,영어,국어 점수를 순서대로 입력하세요. 띄어쓰기로 구분합니다.) : ");
//		int a_math = sc.nextInt();
//		int a_eng = sc.nextInt();
//		int a_kor = sc.nextInt();
//		int a_avg = getAvg(a_math, a_eng, a_kor);
		// 학생 a의 등급구하기
//		getGrade("a", a_avg);
		
		// 학생 b의 수학, 영어, 국어점수
//		System.out.println("(수학,영어,국어 점수를 순서대로 입력하세요. 띄어쓰기로 구분합니다.) : ");
//		int b_math = sc.nextInt();
//		int b_eng = sc.nextInt();
//		int b_kor = sc.nextInt();
//		int b_avg = getAvg(b_math, b_eng, b_kor);
//		// 학생 a의 등급구하기
//		getGrade("b", b_avg);
		
		// 학생 c의 수학, 영어, 국어점수
//		System.out.println("(수학,영어,국어 점수를 순서대로 입력하세요. 띄어쓰기로 구분합니다.) : ");
//		int c_math = sc.nextInt();
//		int c_eng = sc.nextInt();
//		int c_kor = sc.nextInt();
//		int c_avg = getAvg(c_math, c_eng, c_kor);
//		// 학생 c의 등급구하기
//		getGrade("c",c_avg);
		

		
		
	}


	//1. 문자열 속의 단어를 공백 기준으로 세기.
	// 메소드명 : countWord
	// 매개변수가 필요함.
	// ex) I love java. => 3개
	static void countWord(String str) {
		int count = 0;
		if(str == null) {
			return;
		}
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' || i == str.length()-1) {
				count++;
			}
		
		}
		System.out.printf("단어의 개수는 %d개 입니다.\n", count);
	}
	
	//2. 주민등록번호로 성별 판단하기
	// 메소드명 : getGender
	// 1, 3 => 남자
	// 2, 4 => 여자
	static void getGender(String num) {
		// 주민등록번호는 뒷자리 7자리라고 가정. 앞 첫 글자만 따져서 성별 나눌수있음
		String gender = "";
		
		if(num.charAt(0)=='1' || num.charAt(0)== '3') {
			gender = "남자";
			System.out.println(gender + "입니다.");
		}
		else if(num.charAt(0)==2 || num.charAt(0)==4) {
			gender = "여자";
			System.out.println(gender + "입니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	//3. 학생 3명의 수학, 국어, 영어 점수를 받아서 평균을 구해서 각 학생별 학점 구하기(정수형)
	// 메소드명 : getGrade
	// 95점이상 : A+
	// 90점이상 : A
	// 85점이상 : B+
	// 80점이상 : B
	// 75점이상 : C+
	// 70점이상 : C
	// 69점이하 : F
	
	static int[] getAvg(int math[], int eng[], int kor[]) { // 학생의 과목 점수 합을 받아서 평균을 반환하는 메소드
		int avg[] = new int [3];
		for(int i = 0; i < avg.length; i++) {
			avg[i] = (math[i] + eng[i] + kor[i]) / 3;
		}
		return avg;
	}
	
	static void getGrade(String name[], int avg[]) { // 각 학생의 평균값을 받아서(총3개의 매개변수) 평균을 내는 메소드 
		
			for(int i = 0; i < 3; i++) {
			if(avg[i] >= 95) {
				System.out.printf("%s학생의 ", name[i]);
				System.out.println("학점은 A+입니다.");
			}
			else if(avg[i] >= 90) {
				System.out.printf("%s학생의 ", name[i]);
				System.out.println("학점은 A입니다.");
			}
			else if(avg[i] >= 85) {
				System.out.printf("%s학생의 ", name[i]);
				System.out.println("학점은 B+입니다.");
			}
			else if(avg[i] >= 80) {
				System.out.printf("%s학생의 ", name[i]);
				System.out.println("학점은 B입니다.");
			}
			else if(avg[i] >= 75) {
				System.out.printf("%s학생의 ", name[i]);
				System.out.println("학점은 C+입니다.");
			}
			else if(avg[i] >= 70) {
				System.out.printf("%s학생의 ", name[i]);
				System.out.println("학점은 C입니다.");
			}
			else {
				System.out.printf("%s학생의 ", name[i]);
				System.out.println("학점은 F입니다.");
			}
		}
		
		
		
	}
	
	
	
	
	
}