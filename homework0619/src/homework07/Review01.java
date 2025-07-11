package homework07;

import java.util.Scanner;

// 1 ~ 5번 문제
public class Review01 {
	public static void main(String[] args) {
//		1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)

		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		// 입력 메세지 출력
		System.out.print("한 개의 정수를 입력하세요.(1번문제) : ");
		num1 = sc.nextInt();
		System.out.println(num1 % 2 == 0 ? "짝수입니다." : "홀수입니다.");

		
		System.out.println("======================="); 
//		2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		
		int num2 = 0;
		// 입력 메세지 출력
		System.out.printf("한 개의 정수를 입력하세요.(2번문제) : ");
		num2 = sc.nextInt();
		if(num2 > 0) {
			System.out.printf("%d는 양수입니다.\n", num2);
			}
			else if(num2 < 0) {
				System.out.printf("%d는 음수입니다.\n", num2);
			}
			else {
				System.out.printf("%d는 0입니다.\n", num2);
			}
		
		System.out.println("======================="); 
		
//		3. 나이를 입력받아서 다음 기준으로 출력하기
//		   0 ~ 12   : 어린이입니다
//		   13 ~ 19 : 청소년입니다
//		   20 이상 : 성인입니다
		
		int age = 0;
		// 출력 메세지 입력
		System.out.println("나이를 입력하세요 : (3번문제)");
		age = sc.nextInt();
		if(age >= 0 && age <= 12 ) {
			System.out.printf("%-2d ~ %2d : 어린이입니다.\n",0,12);
			System.out.printf("현재 나이는 %d살이고 어린이입니다\n", age);
		}
		else if(age >= 13 && age <= 19) {
			System.out.printf("%-2d ~ %2d : 청소년입니다.\n",13,19);
			System.out.printf("현재 나이는 %d살이고 청소년입니다\n", age);
		}
		else if(age >= 20) {
			System.out.printf("20이상 : 성인입니다.\n");
			System.out.printf("현재 나이는 %d살이고 성인입니다\n", age);
		}
		else {
			System.out.println("나이를 잘못 입력했습니다.");
		}
		
//		4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
//		   단, 세 개의 정수는 모두 다른 숫자이어야한다(중복값 X)
//		   
//		   숫자 3개 입력 :  5 1 9
//		   정렬된 숫자 : 9 5 1
		System.out.println("======================="); 
		int number1 = 0, number2 = 0, number3 = 0;
		// 입력 메세지 출력
		System.out.printf("세 개의 정수를 띄어쓰기로 입력해주세요(4번문제) : ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		
//		 1 7 5
		int high = 0, middle = 0, low = 0;
		
		if(number1 > number2) {
			if(number2 > number3) { // number1 > number2 > number3 인 상황
				high = number1;
				middle = number2;
				low = number3;
			}
			else { //  number2 < number3 인 상황
				if(number1 > number3) { // number1 > number3 > number2
					high = number1;
					middle = number3;
					low = number2;
				}
				else { // number2 < number1 < number3
					high = number3;
					middle = number1;
					low = number2;
				}
			}
		}
		else { // number1 < number2 인 상황
			if(number1 > number3) { // number2 > number1 > number3
				high = number2;
				middle = number1;
				low = number3;
			}
			else { // number1 < number3
				if(number2 < number3) { // number1 < number2 < number3
					high = number3;
					middle = number2;
					low = number1;
				}
				else { // number2 > number3 > number1
					high = number2;
					middle = number3;
					low = number1;
				}
			}
		}
		
		System.out.printf("정렬된 숫자 : %d %d %d\n", high, middle, low);
		
		System.out.println("======================="); 
		
		sc.nextLine(); // 버퍼제거
		
		// 5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		
		String quitMsg = "";
		//출력메세지
		System.out.print("문자열을 입력하세요.X를 입력했을때만 종료됩니다.(5번문제) : ");
		quitMsg = sc.nextLine();
		
		if(quitMsg == "X") {
			System.out.println("프로그램을 종료합니다.");
		}
		else {
			System.out.println(quitMsg);
		}
		
		
		
		
		
		
		
		
		
		
	} // main 종료
}
