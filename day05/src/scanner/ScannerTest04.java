package scanner;

import java.util.Scanner;

// 8번 : 사용자로부터 숫자를 입력받고 10을 더한값 출력받기
public class ScannerTest04 {

	public static void main(String[] args) {
		
		/*
		 * <로직 구성>
		 * 1. 입력클래스 선언
		 * 2. 입력클래스 import
		 * 3. 입력메세지 출력
		 * 4. 문자열 변수를 선언하고, 입력메소드 사용
		 * 5. 문자열을 정수 형변환 후 10을 더해서 변수 출력
		 * 6. 전체 결과 출력
		 * */
		
		Scanner sc = new Scanner(System.in); // ctrl shift o
		System.out.println("숫자를 입력하세요 : ");
		String number = sc.nextLine();
		int num_int = Integer.parseInt(number);
		System.out.printf("입력하신 값은 %d이고, 입력하신 값에 10을 더한 값은 %d입니다. ",num_int, num_int + 10);
		
		
		
	}

}
