package oper;

import java.util.Scanner;

// 5번 : 삼항연산자
public class OperTask01 {

	public static void main(String[] args) {
		// 조건식 ? 참일때의 값 : 거짓일때의 값;
		
		// 조건식은 반드시 결과가 boolean type의 결과가 나와야한다.(true / false)
		// 삼항연산자는 값을 변환하므로 변수에 저장하거나 바로 출력할 수 있다.
		
		System.out.println(true ? "참입니다." : "거짓입니다."); // 조건식은 true 자체이고, 그 값은 자체로true이기 때문에 왼쪽 참일때 값이 출력된다.
		System.out.println(false ? "참입니다." : "거짓입니다.");// 조건식은 false 자체이고, 그 값은 자체로false이기 때문에 왼쪽 참일때 값이 출력된다.
		
		System.out.println((10 > 5) ? "10이 더 큰 수입니다." : "5가 더 큰 수입니다."); // 조건식 (10 > 5)가 참이므로, 왼쪽 결과값이 나온다.
		System.out.println((10 > 5 && 10 == 5) ? "참" : "거짓"); // 조건식 안에서 true && false == false이므로, 오른쪽 결과값이 나온다.

		int number = (1 < 2) ? 1 : -1; // 마지막엔 세미콜론을 꼭 붙인다.
		System.out.println(number);
		
		// 정수 2개를 입력받아서 큰 수 구하기.
		
		
		Scanner sc = new Scanner(System.in);// 입력클래스 변수선언 및 import
	
		System.out.print("입력할 두 숫자를 입력하세요(띄어쓰기로 구분) : ");	// 입력메세지 출력
		
		int num1 = sc.nextInt();// 정수형변수 2개 선언 및 nextInt();로 초기화
		int num2 = sc.nextInt();// 정수형변수 2개 선언 및 nextInt();로 초기화
		// 문자열변수 1개 선언, 삼항연산자로 확인
		String result = (num1 < num2) ? (num2 + "가 큽니다.") : (num2 + "가 크지 않습니다."); // 삼항연산자의 출력부분을 문자열로 연결하는 방법도 사용할 수 있다.
		System.out.println(num1 + "과 " + num2 + "의 비교 결과는 " + result); // + 연산기호로 문자열로 병합한다.
		// sc.close(); 스캐너 클래스의 스트림을 해제한다.
		
	}

}
