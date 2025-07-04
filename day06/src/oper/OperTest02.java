package oper;

import java.util.Scanner;

// 4번 : ~논리연산자까지 복습문제
public class OperTest02 {

	public static void main(String[] args) {
		System.out.println();
		// 사용자가 입력한 값 2개의 값을 서로 비교하기
		// nextInt() 사용, 변수를 먼저 만들고 진행할 것! 
		// 변수 만들 때 의미있는 문자로 사용하기.
		// 로직구성부터 진행!
		
		
		// 입력을 받기 위해 클래스 변수 선언 및 import
		// 입력을 받기 위한 메세지 작성
		// 사용자가 입력한 값을 저장할 2개의 값을 정수값으로 받을 예정이고, int타입의 변수 생성 및 nextInt()로 동시에 초기화
		// 출력 메세지 작성1 => syso(num1 + "과 " + num2 + " 비교 " + (num1 == num2))
		// 출력 메세지 작성2 => syso(num1 + "과 " + num2 + " 비교 " + (num1 > num2))
		// 출력 메세지 작성3 => syso(num1 + "과 " + num2 + " 비교 " + (num1 < num2))
		// 스캐너 해제 sc.close();
		
		Scanner sc = new Scanner(System.in); // 입력을 받기 위해 클래스 변수 선언 및 import
		
		System.out.print("값을 입력해주세요 : "); // 입력을 받기 위한 메세지 작성
		int num1 = sc.nextInt();// 사용자가 입력한 값을 저장할 2개의 값을 정수값으로 받을 예정이고, int타입의 변수 생성 및 nextInt()로 동시에 초기화
// nextInt();를 사용하면 입력메소드하나에 두개의 값을 띄어쓰기로 입력해서 변수에 저장할 수 있다.
// syso("숫자 2개를 띄어쓰기로 입력하세요 : ");
// int num1 = nextInt(); 여기서 2개를 입력하면, 띄어쓰기가 버퍼에 남아있어서 자동으로 연결된다. 마지막으로 nextLine()으로 버퍼를 비워줘야한다.
// int num2 = nextInt();
		System.out.print("값을 입력해주세요 : "); // 입력을 받기 위한 메세지 작성
		int num2 = sc.nextInt();// 사용자가 입력한 값을 저장할 2개의 값을 정수값으로 받을 예정이고, int타입의 변수 생성 및 nextInt()로 동시에 초기화
		
		System.out.println(num1 + "과 " + num2 + " 비교 : " + (num1 == num2)); // 두 수가 같은지 비교 연산을 소괄호 내에서 먼저 진행하고 나온 boolean 값을 문자열과 연결
		System.out.println(num1 + "과 " + num2 + " 비교 : " + (num1 > num2));// 크기 비교 연산을 소괄호 내에서 먼저 진행하고 나온 boolean 값을 문자열과 연결
		System.out.println(num1 + "과 " + num2 + " 비교 : " + (num1 < num2));// 크기 비교 연산을 소괄호 내에서 먼저 진행하고 나온 boolean 값을 문자열과 연결
		System.out.println(num1 + " > " + num2 + " || " + num1 + " == " + num2 + " : " + (num1 > num2 || num1 == num2));
		
		// 실수 관계연산자 사용
		double num3, num4;
		System.out.println("실수 2개를 띄어쓰기로 구분하여 입력하세요 : ");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		System.out.println(num3 + " < " + num4 + " : " + (num3 < num4) );
//		0.0000001 0.000000001
//		1.0E-7 < 1.0E-9 : false => 1.0E-7 은 10의 -7제곱을 의미한다. 다시말해서, 소수점아래 7자리를 의미한다.
//								=> 1.0E-9 은 10의 -9제곱을 의미한다. 다시말해서, 소수점아래 9자리를 의미한다.
		
		sc.close();		// 스캐너 해제
	}

}
