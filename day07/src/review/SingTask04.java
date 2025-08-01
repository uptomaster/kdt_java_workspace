package review;

import java.util.Scanner;

// 과제3,4번을 합치는 경우
public class SingTask04 {

	public static void main(String[] args) {

//		총 부른 곡 수에 따른 보너스 곡 지급
//		5곡을 부르면 1곡 추가 제공
// 		이미 노래를 부를 금액을 정하고, 잔액에서 음료를 고른다.
//		남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
//		[출력]
//		5곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다
		
		//1) 입력클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);
		//2) 입력받을 금액(정수형변수), 한곡당금액,음료금액(정수형상수2개),부를수 있는 곡 수(정수형변수), 음료를 마실경우 줄어들 노래곡수(정수형변수), 잔돈(정수형변수), 보너스곡(정수형변수) 선언
		int cost=0, song_Count=0, new_song_Count=0, change=0, new_change=0, bonus_Song=0; 
		final int SONG_FEE=500, DRINK_FEE=1000;
		//3) 입력 메세지 출력
		System.out.println("한 곡당 금액은 500원입니다.");
		System.out.print("투입할 금액을 입력하세요 : ");
		//4) nextInt()로 투입금액입력
		cost = sc.nextInt();
		//5) 부를 수 있는 곡수 = 지불금액 / 한곡당금액
		song_Count = cost / SONG_FEE;
		//6) 잔돈 = 지불금액 % 한곡당금액
		change = cost % SONG_FEE;
		// 음료를 선택하지 않았을 때 추가되는 보너스 곡
		bonus_Song = song_Count / 5; // 보너스 곡 계산
		//7) 출력(몇곡 부를수있으며 잔돈은 얼마입니다.)
		System.out.printf("보너스 곡은 %d곡입니다(5곡당 1곡 제공).\n총 %d곡을 부를 수 있습니다.\n잔돈은 %d원입니다.\n",bonus_Song,(song_Count+bonus_Song),change);
		//8) 음료를 선택한경우 "음료를 마시고 싶으면 ()곡을 부를 수 있으며 잔돈은 ()원입니다"를 출력하기 위한 조건문 작성
			//8-1) 음료를 선택해서 곡 수를 줄여야하는경우
//				if(곡수 > 0 && (투입금액-(노래곡수-1)*곡당가격 >= 음료금액)){
//					음료마실경우 노래곡수 = 노래곡수 - 1;
//					음료마실경우 잔돈 = 금액 - (음료마실경우 노래곡수 * 한곡당금액 + 부를수있는곡수)
//				else{
//					
//					}
//			}
		// 음료를 선택할지 고르는 입력메세지와 변수 생성
		System.out.print("음료를 마시겠습니까?(마시면 1, 마시지 않으면 0 입력) : ");
		int choice = sc.nextInt();
		
		// 조건문 작성(음료 선택 여부)
		if(choice == 1) { // 음료를 마실 경우
			// 음료를 마실 경우 새로운 잔돈 계산
			new_change = (cost - 1000) % SONG_FEE;
			System.out.printf("\n음료를 선택하셨습니다.\n음료 요금은 %d원입니다.\n잔돈은 %d원입니다.",DRINK_FEE, new_change);
			if(new_change < DRINK_FEE) {
				System.out.printf("음료를 선택할 수 없습니다.\n잔돈이 %d원보다 부족합니다.\n",DRINK_FEE);
		}
		else { // 음료를 마시지 않는 경우
				System.out.printf("\n총 %d곡을 부를 수 있습니다.\n보너스 곡은 %d곡입니다.\n잔돈은 %d원입니다\n", song_Count, bonus_Song, change);
				}
		}
		
//		//9) 보너스 곡 제공
		//10) 조건추가 if(bonus > 0){
//		보너스로 ()곡이 추가되어 총 ()곡을 부를 수 있습니다.
//		}
		//11) sc.close();

	} // main 종료

}
