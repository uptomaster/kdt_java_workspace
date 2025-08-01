package oper;
// 3번 : 관계연산자와 논리연산자
public class OperTest01 {

	public static void main(String[] args) {
		System.out.println("======================"); // 출력문
		int num1 = 10, num2 = 20, num3 = 10; // 비교를 위한 정수형 변수 선언 및 초기화
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2)); // num1 > num2의 연산결과 출력 : false
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2)); // num1 < num2의 연산결과 출력 : true
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));// num1 >= num2의 연산결과 출력 : false
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));// num1 <= num2의 연산결과 출력 : true
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));// num1 == num2의 연산결과 출력 : false
		System.out.println(num1 + " != " + num3 + " : " + (num1 != num3));// num1 != num3의 연산결과 출력 : false
		// 관계 연산자의 연산 결과는 true false 둘 중하나인 boolean type으로 나온다.
		
//		System.out.println(10 >= 10 + ""); 반드시 숫자끼리 비교해야함. 10 >= "10" 은 비교할 수 없음.
		
		System.out.println("\n======================");
		System.out.println("and : 두 조건식이 전부 참이면 참(&&)");
		System.out.println(true && true); // 양변이 참이기 때문에 결과도 참
		System.out.println(true && false); // 하나라도 거짓이기때문에 결과는 거짓
		System.out.println(false && true); // 위와 동일
		System.out.println(false && false); // 둘다 거짓이기 때문에 결과는 거짓(위와 동일)

		
		System.out.println("\n======================"); // || 는 or의 의미를 가짐.
		System.out.println(true || true); // 둘 중 하나라도 참이면 참
		System.out.println(true || false); // 둘 중 하나라도 참이면 참 
		System.out.println(false || true); // 둘 중 하나라도 참이면 참
		System.out.println(false || false); // 둘 다 거짓이므로 거짓

		System.out.println("\n======================"); // ! 는 부정(not)의 의미를 가짐.
		System.out.println(!true); // false (토글)
		System.out.println(!false); // true (토글)
		
		
		
	}

}
