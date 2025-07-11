package typeCasting;
// 11번 : 자동 형변환
public class TypeCasting01 {

	public static void main(String[] args) {
		/*
		 * 1) 작은 자료형의 값을 큰 자료형으로 변환
		 * int(4byte) -> long(8byte)
		 * */
		int iVal = 100;
		long result1 = iVal; // int 형 값 100을 long타입 변수에 자동형변환
		System.out.println(iVal);
		System.out.println(result1);
		
		// int(4byte) -> float(4byte)
		float result2 = iVal;
		System.out.println(result2);
		
		// int(4byte) -> double(8byte)
		double result3 = iVal;
		System.out.println(result3);
		
		// double(8byte) -> long(8byte)
		// long result4 = result3; 
		// result4는 long타입이자 정수형이다. 
		// 소수점을 표현할 수 없으므로 같은 8바이트인 double형의 소수점이 손실된다. 
		// 손실이 발생할 때, 자동 형변환이 아닌, 강제 형변환을 한다.
	
		// flaot(4byte) -> double(8byte)
		result3 = result2; // 작은 통은 큰 통에 담긴다.
		
		/*
		 * double type : 소수점 이하 15자리까지 정밀표현
		 * float type : 소수점 이하 6자리까지 정밀표현
		 * */
		
		// 2) 연산 시 자동 형변환
		// 정수와 실수의 연산
		
		int iVal2 = 10;
		double dVal2 = 3.14;
		System.out.println(iVal2 + dVal2);
		
//		double result6 = iVal2 + dVal2; // 이미 우측에서 double형으로 자동형변환이 되었으므로 double -> float 형변환은 불가능하다.
		
		// 3) 문자형에서 정수형으로 변환
		char letter = 'a'; // 97
		int ascii = letter;
		System.out.println(letter);
		System.out.println(ascii);
		
		char letter2 = 'b'; // 98
		int ascii2 = letter2;
		System.out.println(letter2);
		System.out.println(ascii2);
		
		char letter3 = 'A'; // 65
		int ascii3 = letter3;
		System.out.println(letter3);
		System.out.println(ascii3);

		char letter4 = '가'; // 44032
		int ascii4 = letter4;
		System.out.println(letter4);
		System.out.println(ascii4);
		
		
		
		
		
	}

}
