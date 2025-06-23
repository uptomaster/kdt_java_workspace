package review;

import java.util.Scanner;

// 과제1 : 금액과 곡 당 가격 입력받아서 부를 수 있는 곡 수와 잔돈 계산.
public class SingTask01 {
	public static void main(String[] args) {
		//1) 입력클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);
		//2) 금액과 곡당가격 입력받을 수 있는 정수형 변수2개 + 부를 수 있는 곡수, 잔돈을 저장할 정수형변수 2개 선언.
		int cost=0, song_Price=0, song_Count=0, change=0; 
		//3) 금액 입력 메세지 출력
		System.out.print("투입할 금액을 입력하세요 : ");
		//4) 변수1 nextInt()로 입력받아 저장.
		cost = sc.nextInt(); // 투입한 금액
		//5) 곡 당 가격 입력받을 수 있는 메세지 출력
		System.out.print("곡 당 가격을 입력하세요 : ");		
		//6) 변수2 nextInt()로 입력받아 저장.
		song_Price = sc.nextInt(); // 곡 당 가격 입력받기.
		//7) 입력받은금액 < 곡당가격 if문으로 작성하기. else문에는 노래를 부를 수 있음을 각각 출력
				//7-1) 입력한 금액과 부족한 금액 출력, 부를수있는 곡수와 잔돈 출력.
		if(cost < song_Price) {
			System.out.printf("입력한 금액은 %d원입니다. 한 곡당 가격은 %d원으로 %d원이 부족합니다.", cost, song_Price, (song_Price-cost));
		}
		else { // 지불금액 > 곡당가격일 경우
			song_Count = cost / song_Price; // 부를 수 있는 곡 수 = 지불금액 / 곡당가격
			change = cost % song_Price; // 잔돈 = 지불금액 % 
			System.out.printf("%d곡을 부를 수 있습니다. 잔돈은 %d원입니다.", song_Count, change);
		}
	} // main 종료
} // 클래스 종료
