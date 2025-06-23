package ifTest;

import java.util.Scanner;

// 11번 : if~else문 실습1 
public class IfTask01 {

	public static void main(String[] args) {
		
		// 사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기.
		
		/* 자료형의 기본값들
		 * 정수 0
		 * 실수 0.0
		 * 문자형 ''
		 * 문자열 "" or null
		 * 논리형 false
		 * */
		
		// 로직구성
		// 1.입력 Scanner 클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);
		// 2.입력메세지 출력
		System.out.print("숫자를 입력하세요 : ");
		// 3.입력받은 숫자를 저장할 변수 선언 및 nextInt()메소드로 동시에 초기화
		int num = sc.nextInt();
		// 4.조건문 ( 2로 나머지를 만들었을 때 0)
		if(num % 2 == 0) { 
		
			// 5.if문의 조건식이 참일때 출력될 메세지
			System.out.println(num + "은(는) 짝수입니다.");
		}
		else { // 6. 2로 나머지를 만들었을 때 0이 아니라면 else문으로 이동.
			// 7. if문의 조건식이 거짓일 때 출력될 메세지 
			System.out.println(num + "은(는) 홀수입니다.");
		}
		
		// 삼항연산자 사용.  조건식은 참이므로 왼쪽값인 짝수입니다 가 출력된다.
		System.out.println((num % 2 == 0)? "짝수입니다" : "홀수입니다");
		
		
		
		// 8. Scanner 클래스 스트림 제거
		sc.close();
		
	} // main 종료

}
