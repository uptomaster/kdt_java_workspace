package variable;

// 1번 : 변수선언
public class Variable01 {

	public static void main(String[] args) {
		// 변수 선언
		// 자료형 변수명; 순서로 선언한다.
		int number1; // 4바이트 정수형타입의 값을 저장할 수 있는 number1이라는 변수 생성. 아직 초기값은 X
		boolean isTrue; // 1바이트 논리형타입의 값을 저장할 수 있는 isTrue라는 변수 생성. 아직 초기값은 X
		double number2; // 8바이트 실수형타입의 값을 저장할 수 있는 number2라는 변수 생성. 아직 초기값은 X

		// 변수에 값 대입 = 초기화(저장. 변수를 선언한 후에 값을 저장할 수 있음.)
		// 변수명 = 값;
		number1 = 10; // 10이라는 정수형값을 number1이라는 변수에 저장.
		isTrue = true; // true라는 논리형값을 isTrue라는 변수에 저장.
		number2 = 3.14; // 3.14라는 실수형값을 number2라는 변수에 저장.

		// 출력
		System.out.println(10); // 변수를 이용한것이 아닌, 10이라는 정수값을 콘솔창에 출력한 것 뿐임.
		System.out.println(number1); // number1변수에 저장된 10이라는 정수값을 콘솔창에 출력함. 변수 활용 O
		System.out.println(isTrue); // isTrue변수에 저장된 true라는 논리값을 콘솔창에 출력함. 변수 활용 O
		System.out.println(number2); // number2변수에 저장된 3.14라는 실수값을 콘솔창에 출력함. 변수 활용 O

		// 변수의 선언 & 초기화 한번에 하기.
		// 자료형 변수명 = 값;
		int number3 = 100; // int number; number = 100; 을 한번에 한 과정

		System.out.println(number3);
		// ctrl + shift + f : 자동정렬

		// 초기화를 하지 않으면 에러
		int number = 1;
		System.out.println(number);		

	}

}
