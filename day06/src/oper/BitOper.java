package oper;
// 7번 : 비트연산자
public class BitOper {

	public static void main(String[] args) {
		System.out.println(10 & 11); // 1010 & 1011 == 1010 => 10이라는 10진수 결과값이 출력
		System.out.println(10 | 11); // 1010 | 1011 == 1011 => 11 이라는 10진수 결과값이 출력
//		System.out.println(10 || 11); // 비트 연산은 한개의 비트연산자만 들어가야한다.
		System.out.println(10 ^ 11); // 1010 ^ 1011 == 0001
		System.out.println(~10); // -11
		
		System.out.println("10진수 : " + 10 + " => 2진수 : " + Integer.toBinaryString(10)); 
		// 10을 변환한 1010 이라는 2진수를 표기하기 위해 toBinaryString()메소드를 이용했다. 소괄호안에는 정수형 타입의 값을 입력해야한다.
		System.out.println("10진수 : " + 11 + " => 2진수 : " + Integer.toBinaryString(11)); // 1011
		// 11을 변환한 1011 이라는 2진수를 표기하기 위해 toBinaryString()메소드를 이용했다. 소괄호안에는 정수형 타입의 값을 입력해야한다.
		// & : 두 비트가 모두 1이면 1, 하나라도 0이면 0
		System.out.println("10 & 11 의 10진수 : " + (10 & 11));
		System.out.println("10 & 11 의 2진수 : " + Integer.toBinaryString(10 & 11));
		// 10 & 11의 비트연산 결과
		// | : 두 비트 중 하나라도 1이면 1, 모두 0이면 0
		System.out.println("10 | 11 의 10진수 : " + (10 | 11)); // 10 | 11 의 비트연산을 진행하면 1010 | 1011 => 1011이므로 11출력
		System.out.println("10 | 11 의 2진수 : " + Integer.toBinaryString(10 | 11)); // 11이라는 10진수 값을 2진수(String타입)로 변환하는 메소드
		
		// ^ : 두 비트가 서로 다르면 1, 같으면 0
		System.out.println("10 ^ 11 의 10진수 : " + (10 ^ 11)); 
		// 10^11 의 비트연산은 XOR이라는 배타 논리합 연산이다. xor은 두 비트가 다르면 1, 같으면 0을 출력하므로, 
		//1010 ^ 1011 => 0001 이므로, 이 값을 10진수로 변환하면 1이라는 값이 출력된다. 
		
		System.out.println("12 ^ 14 의 2진수 : " + Integer.toBinaryString(12 ^ 14)); 
//		8 4     8 4 2
//		1100 ^ 1110 => 0010
 		
		// 10 ^ 11 의 결과값은 1이라는 10진수인데,
		// 이 값을 Integer.toBinaryString()메소드를 사용하면 1이 출력된다.
		// ~ : 0을 1로, 1을 0으로
		// 공식 : ~x => -(x+1)
		System.out.println("~10의 10진수 : " + (~10));
		System.out.println("~10의 2진수 : " + Integer.toBinaryString(~10));
		System.out.println(" ~5의 10진수 : " + (~5));
		System.out.println(" ~5의 2진수 : " + Integer.toBinaryString(~5));
		

//		System.out.println((10 & 11));
//		System.out.println((10 & 11) + 1);
	}

}
