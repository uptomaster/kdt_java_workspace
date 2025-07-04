package oper;

import java.util.Scanner;

// 6번 : 삼항연산자 실습1
public class OperTask02 {

	public static void main(String[] args) {
		// 두 수를 입력받아 비교
		// 크다, 작다, 같다가 각각 상황에 맞게 출력되도록 로직 구성
		
		// 입력클래스 변수선언 및 import
		Scanner sc = new Scanner(System.in);
		// 입력메세지 출력
		System.out.print("입력할 두 숫자를 입력하세요(띄어쓰기로 구분) : ");
		// 정수형변수 2개 선언 및 nextInt();로 초기화
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// 문자열변수 1개 선언, 삼항연산자로 확인
		String result = (num1 == num2) ? "두 수는 같다." : (num1 > num2) ? "num1이 크다." : "num2가 크다." ; 
		// 삼항연산자의 출력부분을 문자열로 연결하는 방법도 사용할 수 있다.
		System.out.println(num1 + "과 " + num2 + "의 비교 결과 : " + result);
		
		// sc.close();
		// num1이 크다. num1과 num2가 같다. num2가 크다. 총 3가지 경우 출력
		
		// 2. 한 개의 정수를 입력받아서 짝수인지 아닌지 출력하기
		// 짝수입니다 or 짝수가 아닙니다로 출력할 것.
		
			System.out.println("한 개의 정수를 입력하세요(짝수판별 프로그램) : "); // 입력메세지 출력
			int num3 = sc.nextInt(); // 정수형 변수 선언과 nextInt()메소드로 입력받은 값으로 초기화
			String result2 = num3 % 2 == 0 ? "짝수입니다." : "짝수가 아닙니다."; // 삼항연산자와 나머지연산자, 관계연산자 사용해서 결과에 대입
			System.out.println("입력한 숫자 " + num3 + "는 " + result2); // 결과값 출력
			sc.close(); // Scanner 스트림 제거
	}

	
}
