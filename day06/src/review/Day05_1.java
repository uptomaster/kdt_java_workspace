package review;
// 1번 : hw 1) 복습
import java.util.Scanner;


// hw : 거스름돈 문제

/* 강사님 로직구성
 * 1) 입력클래스 import 및 선언
 * 2) 출력메세지
 * 3) 정수형 변수1(물건가격)에 입력메소드 사용. next()
 * 4) 출력메세지
 * 5) 정수형 변수2(지불금액)에 입력메소드 사용. next()
 * 6) 거스름돈 정수형 변수3(거스름돈) 하나 더 만들기 변수3 = 변수2 - 변수1
 * 7) 출력(거스름돈은 00원입니다)
 * 8) 출력(변수3 / 1000)
 * 9) 출력((변수3 % 1000) / 500)
 *10) 출력( ((변수3 % 1000) % 500) / 100 )
 * */


//방법2
	/*	8) 정수형 변수 선언 = 변수3 / 1000;
	 * 	9) 변수3 %= 1000;
	 * 10) 정수형 변수4선언 = 변수3 / 500;
	 * 11) 변수3 %= 500;
	 * 12) 정수형 변수5선언 = 변수3 / 100;
	 * 
	 * */
public class Day05_1 {// 클래스 중괄호 시작 영역

	public static void main(String[] args) {
		
		// 1. 스캐너 클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);
		// 2. 출력 메세지 & 각 값을 저장할 변수 선언과 입력값을 그 변수에 저장. 
		System.out.print("물건값 : ");
		// 2-1. nextInt()로 입력받은 문자열을 정수로 형변환
		int price = sc.nextInt();
		// 2-2. 출력 메세지 & 지불금액도 마찬가지로 선언,형변환, 초기화
		System.out.print("지불금액 : ");
		int cost = sc.nextInt();
		// 2-3. 거스름돈은 지불금액 - 물건값이다.
		int change = (cost - price);
		System.out.println("거스름돈은 " + change + "원 입니다.");
		// 3. 거스름돈을 1000, 500, 100원으로 분류한다. 큰 단위가 있으면 그 화폐로 변환
		int change_1000 = change / 1000; // 거슬러줄 1000원의 개수
		int change_500 = (change - (change_1000 * 1000)) / 500; // 거슬러줄 500원의 개수
		int change_100 = (change - change_1000 * 1000 - change_500 * 500) / 100;
		// 4. 출력 결과 작성
		System.out.printf("1000원 : %d\n500원 : %d\n100원 : %d", change_1000, change_500, change_100);
		
		sc.close();

		
	}// main 중괄호 종료 영역


}// 클래스 중괄호 종료 영역