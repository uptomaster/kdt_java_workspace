package scanner;

import java.util.Scanner;

// 9번 : 입력 메소드 실습1
public class ScannerTesk01 {

	public static void main(String[] args) {
		/*
		 * 1. 본인의 이름과 성별을 입력받고 출력하기
		 * 입력 예> 이름 입력 :
		 * 입력 예> 성별 입력 :
		 * 출력 예> 이름은 000이고 00입니다.
		 * 
		 * <로직 구성>
		 * 1. 입력 클래스 import
		 * 2. 출력 메소드로 입력 메세지 만들기.
		 * 3. 이름, 성별을 문자열 변수 선언 후 입력 메소드로 입력받은 값 저장하기.
		 * 4. 출력 메세지로 전체 결과 출력
		 * */
		
		Scanner sc = new Scanner(System.in); // Scanner 클래스를 입력하고 클래스 import
		System.out.println("이름 입력 : "); // println() 입력메소드를 사용
		String name = sc.next(); // next() 입력메소드를 이용해서 문자열 저장
		System.out.println("성별 입력 : "); // 
		String sex = sc.next(); // next() 입력메소드를 이용해서 문자열 저장
		
		// char gender = sc.next.charAt(0); => char 자료형으로 만들어서 첫 인덱스만 따서 사용가능. 출력문에서는 "" + 로 붙이거나 %c로 서식지정함.
		
		System.out.printf("이름은 %s이고 %s입니다.", name, sex); // 서식 지정자를 이용하는 방법. printf() 메소드를 사용해야함.
//		System.out.println("이름은 " + name + "이고 " + sex + "입니다."); // + 연산으로 문자열 합치기방법.
		
		
		
	}

}
