package oper;

// 13번 : 산술연산자(+, -, *, /, %)
public class OperTest01 {
	public static void main(String[] args) {
//		int num1 = 10, num2 = 20;
//		double num3 = 5.5, num4 = 2.5;
//		
//		System.out.println("======덧셈======");
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 정수 + 정수
//		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4)); // 정수 + 
//		System.out.println(num1 + " + " + num4 + " = " + (num1 + num4));
//		
//		System.out.println("\n======뺄셈======");
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		System.out.println(num3 + " - " + num4 + " = " + (num3 - num4));
//		System.out.println(num1 + " - " + num4 + " = " + (num1 - num4));
//		
//		System.out.println("\n======곱셈======");
//		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		System.out.println(num3 + " * " + num4 + " = " + (num3 * num4));
//		System.out.println(num1 + " * " + num4 + " = " + (num1 * num4));
//		
//		System.out.println("\n======나눗셈======");
//		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//		System.out.println(num3 + " / " + num4 + " = " + (num3 / num4));
//		System.out.println(num1 + " / " + num4 + " = " + (num1 / num4));
//
//		System.out.println("\n======나머지======");
//		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//		System.out.println(num3 + " % " + num4 + " = " + (num3 % num4));
//		System.out.println(num1 + " % " + num4 + " = " + (num1 % num4));
		
		//복합대입연산자
		int num = 10;
		System.out.println("num의 현재 값 : " + num);
		num = num + 5;
		
		System.out.println("num의 현재 값 : " + num);
		num = num + 15;
		
		System.out.println("num의 현재 값 : " + num);
		num += 5; //num = num + 5;
		
		System.out.println("num의 현재 값 : " + num);
	
		num -= 2.5;
		System.out.println("num의 현재 값 : " + num); 
		System.out.println(35-2.5); 
		// 실제 정수-실수 계산은 32.5가 맞지만, int형 변수에 저장함으로써 손실이 발생해서 32가 출력됨.(소수점 이하 버림. 강제 형변환)
		
		num *= 2;
		System.out.println("num의 현재 값 : " + num); 
		
		
	
	}
}
