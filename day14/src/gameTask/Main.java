package gameTask;

import java.util.Scanner;

public class Main {

	static void printMenu() {
		System.out.println("1. 일반공격\n2. 스킬공격\n3. 특수공격\n4. 종료");
	}

	public static void main(String[] args) {

		// 사용자에게 캐릭터를 선택하게 하고 1. 마법사, 2. 전사, 3. 로그
		// 선택한 캐릭터로 반복적으로 메뉴 실행
		// 1. 기본공격, 2. 스킬공격, 3. 특수공격, 4. 종료

		Wizard w1 = new Wizard();
		Scanner sc = new Scanner(System.in);

		Character character = null;
		Wizard wizard = null;
		Warrior warrior = null;
		Rogue rogue = null;

		while (true) {
			// 캐릭터 선택 메세지 출력
			System.out.println("캐릭터를 선택하세요 : \n1.마법사\n2.전사\n3.로그\n입력 : ");
			int select = sc.nextInt(); // select : 지역변수(인스턴스변수)
			sc.nextLine();
			if (select == 1) {
				wizard = new Wizard();
				break;
			} else if (select == 2) {
				warrior = new Warrior();
				break;
			} else if (select == 3) {
				rogue = new Rogue();
				break;
			} else
				System.out.println("다시 입력하세요");
		}

		while (true) {
			// 메뉴 출력
			printMenu();
			System.out.print("번호를 입력하세요. (1~4) : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				w1.normalAttack();
				break;
			case 2:
				w1.skillAttack();
				break;
			case 3:
				w1.specialAttack();
				break;
			case 4:
				System.out.println("게임 종료");
				sc.close();
				return;
			default:
				System.out.println("다시 입력하세요.");
				break;
			}

//		do {
//			printMenu();
//			System.out.print("번호를 입력하세요. (1~4) : ");
//			int ch = sc.nextInt();
//			sc.nextLine();
//		switch(ch) {
//		case 1:
//			w1.normalAttack();
//			break;
//		case 2:
//			w1.skillAttack();
//			break;
//		case 3:
//			w1.specialAttack();
//			break;
//		case 4:
//			sc.close();
//			return;
//		default:
//			System.out.println("다시 입력하세요.");
//			break;
//		}
//		}while(w1.hp > 0 || w1.mp > 0);

		}
	}
}
