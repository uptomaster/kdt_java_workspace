package homework;

import java.util.Scanner;

// 남은 금액으로 음료 구매 가능 여부 추가 (한 곡당 금액 200원, 음료 금액은 100원)
public class SingTask02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 한 곡당 금액 200원을 상수로 선언, 음료 금액은 100원 상수로 선언ㅇ
		final int SONG_FEE = 200;
		final int DRINK_FEE = 100;
		// 지불할 금액 입력할 변수와 초기화
		// 출력 메세지
		System.out.print("지불할 금액을 입력하세요 : ");
		int cost = sc.nextInt();

		// 부를 수 있는 곡의 수
		int song = cost / SONG_FEE;
		
		// 잔돈 계산
		int change = cost - SONG_FEE*song;
		
		// 음료를 마실 경우 새로운 예산 금액을 넣을 변수 선언
		int new_Cost = cost - DRINK_FEE;
		
		// 음료를 마실 경우 부를 수 있는 곡 수가 바뀜
		int new_Song = (cost-100) / SONG_FEE;
		
		// 출력 메세지
		System.out.println(song + "곡을 부를 수 있으며 잔돈은 " + change + "원입니다.");
		System.out.println("음료를 마시고 싶으면 " + (new_Song) + "곡을 부를 수 있으며 잔돈은 " + (new_Cost-new_Song*200) + "원입니다.");
		
		
//		1000 을 넣엇어 잔돈은 100원이야 음료마시려면 내 예산은 900원이됨.  4곡 부르니까 100원 남음
//		여기서 900원은 cost-100임. 그럼 다시 곡 수를 계산하면, (cost-100) / SONG_FEE
	}
}
