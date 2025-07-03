package exceptionQuest02;

import java.util.Scanner;

public class MyExceptionMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		System.out.print("양의 정수만 입력하세요 : ");
		number = sc.nextInt();
		
		if(number <= 0) {
//			System.out.println("음수 입력불가"); // 우리는 지금까지 이런 방식으로 예외처리했음
			try {
				throw new MyException();
			} catch (MyException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("입력한 숫자는 " + number + "입니다.");
		}
		System.out.println("프로그램 종료");
	}
}
