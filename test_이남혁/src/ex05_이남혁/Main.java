package ex05_이남혁;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		// 입력 클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);

		// 반복문을 돌기전에 몇 명의 학생을 입력받을지 입력받기.
		System.out.printf("몇 명의 학생을 입력하시겠습니까? ");
		int time = sc.nextInt(); // 학생 수 입력받기
		sc.nextLine(); // 버퍼 제거

		// while 조건문에 들어갈 변수 선언
		int j = 1;

		// 객체를 담을 배열선언
		Student[] student = new Student[time];

		while (j <= time) { // 입력한 횟수인 time번만큼 실행하기 위한 루프

			// 객체 입력받기
			// 출력문
			for (int i = 0; i < time; i++) {
				// 몇번째 학생인지 체크
				System.out.printf("[%d번째 학생 정보 입력]\n", j);
				System.out.printf("이름 : ");
				String name = sc.nextLine(); // 이름 입력받기
				System.out.printf("Java 점수 : ");
				int javaScore = Integer.parseInt(sc.nextLine()); // 자바점수 입력받기 + 정수형변환
				System.out.printf("DBMS 점수 : ");
				int dbmsScore = Integer.parseInt(sc.nextLine()); // dmbs점수 입력받기 + 정수형변환
				System.out.printf("HTML 점수 : ");
				int htmlScore = Integer.parseInt(sc.nextLine()); // html점수 입력받기 + 정수형변환
				System.out.printf("전공 (COMPUTER_SCIENCE / CYBER_SECURITY / ARTIFICIAL_INTELLIGENCE) : ");
				Major major = Major.valueOf(sc.nextLine()); // enum 타입을 문자열로 변환하는 메소드.
				
				// 입력받은 값을 Student생성자에 넣고 객체 생성하기
				Student st = new Student(name, javaScore, dbmsScore, htmlScore, major);
				student[i] = st; // 반복문 밖에서만든 Student 클래스를 담을 배열에 하나씩 넣기
				j++; // 루프를 빠져나가기 위해 객체 하나를 생성할때마다 j값을 1씩 증가
			}
			// 성적 출력문
			for (int k = 0; k < time; k++) {

				System.out.println("=====성적 출력=====");
				System.out.println(student[k].getName() + "님의 전공은 " + student[k].getMajor() + "입니다.");
				System.out.println("총점 : " + student[k].getTotalScore()); // student클래스의 총점구하는 메소드 호출
				System.out.println("평균 : " + student[k].getAverageScore()); // student클래스의 평균구하는 메소드 호출
			}

		}

		// 몇명의 학생을 입력받을지 선택.
		// while문에서 j <= time일 동안 루프 돌리기
		// 일단 점수 입력과 객체를 생성하고,
		// 모든 객체에 점수를 입력했다면
		// 다시 반복문 돌려서 각 개체의 총점과 평균 출력하기
		sc.close();

	}
}
