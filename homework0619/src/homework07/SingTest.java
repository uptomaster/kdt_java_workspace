package homework07;

import java.util.Scanner;

// 7번 문제
public class SingTest {
	public static void main(String[] args) {
//		7. 코인 노래방 시스템을 구현하는 개발자입니다.
//		사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 계산하고, 음료를 마실 수 있는지 여부도 안내하는 프로그램
//
//		[요구사항]
//		사용자에게 곡 당 가격을 입력받는다.
//		반복문을 사용하여 사용자에게 금액을 계속 입력받는다.
//		단, 0을 입력하면 프로그램은 종료된다.
//		입력받은 금액으로 부를 수 있는 곡 수와 잔돈을 출력한다.
//		곡 수 : 금액 ÷ 곡당 가격
//		보너스 : 5곡당 1곡 보너스 (예: 5곡 → 6곡, 10곡 → 12곡)
//		잔돈 : 금액 % 곡당 가격
//		음료(100원)를 마시고 싶다면, 음료 가격을 차감하고 노래를 줄이는 방식으로 대체 제안을 출력한다.
//		사용자에게 "음료를 구매하시겠습니까?" 라고 묻고
//		YES를 입력하면 대체 결과를 출력 NO를 입력하면 원래 계산된 노래 수를 유지한다
//		금액이 부족할 경우, 노래를 부를 수 없다는 안내 메시지를 출력한다.
//
//		입력은 정수로 받되, nextLine()을 사용하여 입력 오류를 방지한다.
//		대소문자 구분해서 YES/NO 처리한다.
//		Scanner는 한 번만 생성하고 마지막에 .close()로 닫을 것
//		[입출력 예시]
//				곡 당 가격 입력: 300
//				금액 입력 (0 입력 시 종료): 1000
//				3곡을 부를 수 있으며 잔돈은 100원입니다
//				음료를 마시고 싶으면 3곡을 부를 수 있으며 잔돈은 0원입니다
//				음료를 구매하시겠습니까? (YES/NO): YES
//				음료를 구매하셨습니다.
//				3곡을 부를 수 있으며 잔돈은 0원입니다
//				금액 입력 (0 입력 시 종료): 900
//				3곡을 부를 수 있으며 잔돈은 0원입니다
//				음료를 마시고 싶으면 2곡을 부를 수 있으며 잔돈은 200원입니다
//				음료를 구매하시겠습니까? (YES/NO): YES
//				음료를 구매하셨습니다.
//				2곡을 부를 수 있으며 잔돈은 200원입니다
//				금액 입력 (0 입력 시 종료): 900
//				3곡을 부를 수 있으며 잔돈은 0원입니다
//				음료를 마시고 싶으면 2곡을 부를 수 있으며 잔돈은 200원입니다
//				음료를 구매하시겠습니까? (YES/NO): NO
//				음료를 구매하지 않았습니다.
//				금액 입력 (0 입력 시 종료): 0
//				프로그램을 종료합니다.
		
				//입력클래스 변수 선언 및 import
				Scanner sc = new Scanner(System.in);
				
				int cost=0, price = 0, song_Count=0, new_song_Count=0, change=0, new_change=0, bonus_Song=0;
				final int DRINK_FEE=100; // 음료수 값 : 100원
				String choice = "";
				//입력 메세지 출력
				System.out.print("한 곡당 가격 입력 : ");
				price = sc.nextInt(); // 곡 당 가격 입력
				
				sc.nextLine();

				
				while(true) {
					
					System.out.print("금액 입력 (0 입력 시 종료): ");
					cost = sc.nextInt();
					
					// 투입금액이 0원이면 종료
					if(cost == 0) {
						break;
					}
					
					//부를 수 있는 곡수 = 지불금액 / 한곡당금액
					song_Count = cost / price;
					
					//잔돈 = 지불금액 % 한곡당금액
					change = cost % price;
					
					//5곡당 1곡 추가되는 보너스 곡
					bonus_Song = song_Count / 5; // 보너스 곡 계산
					// 음료를 선택했을 때 부를수있는 곡 수
					new_song_Count = (cost-100)/price;
					// 음료를 선택했을 때 잔돈
					new_change = (cost-100)%price;
					//버퍼 비우기
					sc.nextLine();
	
					//출력
					System.out.printf("%d곡을 부를 수 있으며, 잔돈은 %d원입니다.\n",(song_Count+bonus_Song),change);
					

					
					// 음료를 마실지 선택하기. YES/NO로 입력받기
					System.out.println("음료를 구매하시겠습니까? (YES/NO): ");
					choice = sc.next();
					
					if(choice.equals("YES")) {
						System.out.printf("음료를 구매하셨습니다.\n");
						System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다.\n", new_song_Count, new_change);
					}
					else if(choice.equals("NO"))
						{System.out.println("음료를 구매하지 않았습니다.");
				      }
					else {
						break;
					}
				}
				
				// sc.close();
				
				}//main 종료
	} 

