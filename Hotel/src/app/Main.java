package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		ConsoleUI console = new ConsoleUI();
		Hotel hotel = new Hotel();
		
		console.printMenu();
		
		int num = 0;
		
		while(true) {
			// 로그인 시 입력할 번호
			num = sc.nextInt();
			console.printMenu();
			switch(num) {
			case 1: 
				System.out.println("호텔 목록 확인");
				System.out.println(hotel.info);
				break;
			case 2:
				System.out.println("나의 예약 정보 확인");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
			
			
		}
		
		System.out.println("프로그램 종료");
	}
}
