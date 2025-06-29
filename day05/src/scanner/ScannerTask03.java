package scanner;

import java.util.Scanner;

// 11번 : 두 정수를 입력받아 합을 출력하기 next()메소드를 사용하기.
public class ScannerTask03 {
	public static void main(String[] args) {

		
		//로직구성
		String msg1 = "정수1 입력 : ", msg2 = "정수2 입력 : ";
		// 1. Scanner 클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);
		// 2-1. 출력 메세지인 msg1를 출력 메소드 print를 이용하여 입력한다.
		// 2-2. 정수1을 입력하기 위해 num1 이라는 정수형 변수를 선언하고, 입력할 문자열을 Integer.parseInt()메소드로 변환하여 초기화한다.
		System.out.print(msg1);
//		int num1 = Integer.parseInt(sc.next());
		
		int num1 = sc.nextInt(); // nextInt() 메소드를 이용하면 형변환없이 바로 대입이 가능하다.
		
		// 3-1. 출력 메세지인 msg2를 출력 메소드 println을 이용하여 입력한다.
		// 3-2. 정수2를 입력하기 위해 num2라는 정수형 변수를 선언하고, 입력할 문자열을 Integer.parseInt()메소드로 변환하여 초기화한다.
		System.out.print(msg2);
//		int num2 = Integer.parseInt(sc.next());
		
		int num2 = sc.nextInt();
		
		// 4. 두 정수의 합을 출력한다.
		System.out.printf("두 정수의 합 : %d", num1 + num2);
		// 5. Scanner 해제
		sc.close();
		
	}
}
