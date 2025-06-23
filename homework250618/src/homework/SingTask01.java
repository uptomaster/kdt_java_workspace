package homework;

import java.util.Scanner;

// 
public class SingTask01 {

	public static void main(String[] args) {
//		코인 노래방 프로그램
//
//		한 곡당 300원인 코인노래방이다. 사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력하기
//		금액입력 : 1000
//		[출력]
//		3곡을 부를 수 있으며 잔돈은 100원입니다
//
//		클래스명 : SingTask01
//		1) 한 곡당 금액도 입력받기
//		금액입력 : 1000
//		곡 당 가격 입력 : 300
//		[출력]
//		3곡을 부를 수 있으며 잔돈은 100원입니다
//
//		2) 잔돈이 부족할 경우 안내하기
//		금액입력 : 100
//		곡 당 가격 입력 : 
//		[출력]
//		입력한 금액은 100원입니다. 곡 당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다 출력
//
//		클래스명 : SingTask02
//		3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
//		금액입력 : 1000
//		[출력]
//		5곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
//
//		클래스명 : SingTask03
//		4) 총 부른 곡 수에 따른 보너스 곡 지급
//		5곡을 부르면 1곡 추가 제공

//1000 / 300 => 부를 수 있는 곡 수
//cost / song_Fee
		
		// <로직구성>
		// Scanner 클래스 변수선언 및 import
		Scanner sc = new Scanner(System.in);
		// 출력메세지 작성
		System.out.print("곡 당 가격 입력 : ");
		// 한 곡당 금액을 입력받을 정수형 변수 선언 및 nextInt()로 초기화 진행
		int song_Fee = sc.nextInt();
		// 출력메세지 작성
		System.out.print("투입 금액 입력 : ");
		// 투입 금액을 저장할 변수선언
		int cost = sc.nextInt();
		// 부를 수 있는 곡 수 계산
		int song = cost / song_Fee;	
		// 잔돈 계산
		int change = cost - song*song_Fee;
		
		// 출력 메세지
		System.out.println(song + "곡을 부를 수 있으며 잔돈은 " + change + "원 입니다.");
		
		// 부족한 금액 안내
		if(cost < song_Fee) {
			System.out.println("입력한 금액은 " + cost + "원입니다. 곡 당 가격은 " + song_Fee + "원으로 " + (song_Fee - cost) + " 원이 부족하여 노래를 부를 수 없습니다." );
		}
		
		// 스캐너 클래스 해제
		sc.close();
		
	}
	
		

}
