package variable;
// 2번 : 여러개의 변수선언
public class Variable02 {

	public static void main(String[] args) { // main 메소드의 중괄호영역 시작
		// 여러개의 변수를 선언
		int num1 = 10;
		int num2 = 20; // 정수형 num2라는 변수를 선언하고 20이라는 정수형 값을 대입.
		int num3 = 30;
		System.out.println(num1);
		System.out.println(num2); // num2라는 정수형 변수에 저장된 정수형 값을 출력하고 줄바꿈한다.
		System.out.println(num3);
		System.out.println(num1 + num2 + num3); // 정수형은 덧셈연산결과 확인이 가능하다.
		
		// 같은 자료형인 경우, 여러개의 변수를 한 줄로 변수의 선언과 초기화를 동시에 할 수 있다
		int num4 = 10, num5 = 20, num6 = 30; // 정수형 변수 num4, num5, num6를 만들고 각각 10,20,30이라는 정수값을 저장한다.
//		int num4 = 10;
//		int num5 = 20;
//		int num6 = 30;
		System.out.println(num4);		
		System.out.println(num5);
		System.out.println(num6);
		
		
		
	} // main 메소드의 중괄호영역 종료

} 
