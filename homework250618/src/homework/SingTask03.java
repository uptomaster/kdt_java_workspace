package homework;

import java.util.Scanner;

// 4번 : 총 부른 곡 수에 따른 보너스 곡 지급
public class SingTask03 {

	public static void main(String[] args) {
		
		// 스캐너 클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);

		// 투입 금액 입력
		// 출력 메세지
		System.out.print("투입할 금액을 입력하세요 : ");
		int cost = sc.nextInt();

		// 출력메세지 작성
		System.out.print("곡 당 가격 입력 : ");
		// 한 곡당 금액을 입력받을 정수형 변수 선언 및 nextInt()로 초기화 진행
		int song_Fee = sc.nextInt();

		// 부를 수 있는 곡 수 계산
		int song = cost / song_Fee;

		// 잔돈 계산
		int change = cost - song * song_Fee;
		
		// 
		int bonus_Song = (song / 5);
//		부른 곡의 수 /  5
//		 20 / 5 = 4 => 추가된 곡의 수

		System.out.println("부를 수 있는 곡의 수는 " + "추가된 곡의 수는 " + (song / 5) + "곡 입니다.(5곡을 부르면 1곡 추가 제공)");
		System.out.println("총 부를 수 있는 곡의 수는 " + (song + bonus_Song) + "곡 입니다.");
	}

}
