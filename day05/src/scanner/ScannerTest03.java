package scanner;

import java.util.Scanner;

// 7번 : 입력클래스, 입력메소드 연습
public class ScannerTest03 {

	public static void main(String[] args) {
		// 1. 사용자로부터 로직을 입력받아 주소를 출력하기
		
		/*
		 * 1) 입력 클래스 선언
		 * 2) 입력 클래스 import
		 * 3) 문자열 변수 선언
		 * 4) 출력 메세지 작성 및 입력 메소드 사용
		 * 5) 결과 출력
		 * 6) 입력클래스 해제
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력하세요 : ");
		String address = sc.nextLine();		
		System.out.println("주소는 " + address + " 입니다.");
		System.out.printf("주소는 %s 입니다.", address);

		
		// 만약 next()로 입력받고 "서울시 강남구 역삼동" 을 입력한다면
		// 서울시만 출력되고, 나중에 입력 메소드를 사용하면 강남구, 역삼동이 차례로 출력된다.
		
		sc.close();
	}

}
