package app;

import java.util.Scanner;

public class ConsoleUI {

	Scanner sc = new Scanner(System.in);

	// 필드
	String printMenu = "\n0. 시스템 종료" + "\n1. 로그인 " + "\n2. 회원가입";

	String loginMenu = "\n1. 나의 예약정보" + "\n2. 호텔 목록 조회" + "\n3. 로그아웃";


	String id;
	String pw;
	String name;
	
	// 메소드
	public void printMenu() {
		System.out.println(printMenu);
	}
}
