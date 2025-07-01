package whileTest;

import java.util.Scanner;

// 10번 : while문 예제
public class WhileTest03 {

	public static void main(String[] args) {

		// 2개의 정수를 입력받아서, 두 정수의 합을 출력
		// 0을 입력하면 종료, 1을 입력하면 계속 반복
		// while문 사용
		// 기타 제어문 활용

		// 1)Scanner 클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);
		// 2)정수형 변수 3개 선언
		int num1 = 0, num2 = 0, sum = 0; // 입력받은 수를 넣고, 저장할 변수들
		// while문 안에서 입력을 받자.
		while (true) {
			// 3-1)두 정수를 입력하라는 입력메세지 출력
			System.out.print("정수1을 입력하세요 : \n");
			// 3-2) 선언한 변수에 입력메소드로 입력받기
			num1 = sc.nextInt();
			System.out.print("정수1을 입력하세요 : \n");
			num2 = sc.nextInt();

			// 3-3) 두 정수의 합 덧셈연산
			sum = num1 + num2;
			// 3-4) 두정수의 합 출력
			System.out.println("두 수의 합은 : " + sum);
			// 3-5) 종료/계속할지 출력 메세지
			System.out.println("종료(0) / 반복(1)할지 선택하세요.(0과 1중 선택)");
			// 3-6) 종료/반복 입력받기
			int choice = sc.nextInt();
			// 4) 조건문 if 종료라면 == 0
			if (choice == 0) {
				// 4-1) 종료 메세지 출력
				System.out.println("종료합니다.");
				// 4-2) break;
				break;
			}

			// 5) else if 계속이라면 == 1
			else if (choice == 1) {
				// 5-1) 반복 메세지 출력
				System.out.println("프로그램을 반복합니다.");
				// 5-2) continue => continue는 다음 반복문인 while 처음으로 돌아간다.
				continue;
			}
		}
		// 5-3) 메세지 출력
		System.out.println("프로그램을 종료합니다.");

		// 6) sc.close();
		sc.close();

	}

}
