package review;

import java.util.Scanner;

// 3번 : 복습문제
public class Review01 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		// 그 외 숫자를 입력시에는 잘못 입력했습니다 출력하기
		
		// 1) Scanner 클래스 변수 선언 및 import
		Scanner sc = new Scanner(System.in);
		// 2) 입력받은 숫자를 담아둘 정수형 변수 선언 int num = 0; + 숫자의 제곱을 담아둘 정수형 변수 선언 int new_num = 0;
		int num=0, new_num=0;
		// 3) 정수형 입력메소드 nextInt()로 입력받아서 정수형 변수 num에 저장하기.
		System.out.print("1부터 10사이의 숫자만 입력하세요 : ");
		num = sc.nextInt();
		// 4) if(num >= 1 && num <= 10)이라는 조건문을 작성하기
			// 4-1) new_num = num*num; 으로 저장하기.
			// 4-2) new_num 출력하기.
		if(num >=1 && num <= 10) {
			new_num = num*num;
			System.out.printf("제곱된 수는 %d입니다.", new_num);
		}
		// 5) 위 조건식이 틀렸을 경우(1~10 사이의 정수 입력하지않았을때) else문에서 출력할 메세지 만들기.
		else {
			System.out.println("잘못 입력했습니다.");
		}
		// 6) 스캐너 해제.
//		sc.close();
		
		System.out.println("\n==========================================");
		sc.nextLine();
		// 문자열끼리 비교할 수 있는가?
		String data1 = "abc";
		String data2 = "abc";
		System.out.println(data1 == data2); // true 출력
		
		if(data1 == data2) {
			System.out.println("두 문자열은 같습니다.");
		}
		else {
			System.out.println("두 문자열은 다릅니다.");
		}

		System.out.println("문자열3 입력 : ");
		String data3 = sc.nextLine();
		System.out.println("문자열4 입력 : ");
		String data4 = sc.nextLine();
		
		if(data3 == data4) {
			System.out.println("두 문자열은 같습니다.");
		}
		else {
			System.out.println("두 문자열은 다릅니다.");
		}
		
		// data.equals(data2)를 이용해야 같아진다. 문자열은 관계연산자 == 등을 사용하면 비교할 수 없다.
		// <정리>
		// 문자열끼리의 비교는 .equals()메소드를 사용해서 비교한다!
		
	}
}
