package ifTest;

import java.util.Scanner;

// 12번 : if ~ else if ~ else문
public class IfTest03 {

	public static void main(String[] args) {
		
		// 양수, 음수, 0 인지 출력하기
		
		Scanner sc = new Scanner(System.in); // 스캐너 클래스 변수 선언 및 초기화
		
		System.out.println("출력 시작"); // 출력문 
		
		System.out.print("숫자를 입력하세요 : "); // 출력문
		int num = sc.nextInt(); // 정수형 입력을 받기 위한 선언과 초기화
		
		if(num > 0) { // num > 0 이면 이 영역의 문장이 실행된다.
			System.out.println("양수입니다."); // num > 0 이면 이 영역의 문장이 실행된다.
		}
		else if(num < 0) { // num < 0 이면 이 영역의 문장이 실행된다.
			System.out.println("음수입니다.");
		}
		else { // 위의 조건식이 다 거짓이라면 이 영역의 문장이 실행된다.
			System.out.println("0 입니다.");
		}

		// 조건식의 순서를 잘 써야하는 이유 => 더 큰 범위를 먼저 작성하면 정확한 값을 구할 수 없는 예시이다.
//		if(num > 3) {
//			System.out.println("5보다 큽니다.");
//		}
//		else if(num > 5) {
//			System.out.println("3보다 큽니다.");
//		}
//		else {
//			System.out.println(num);
//		}
//		
		
		
		System.out.println("출력 끝");
	}

}
