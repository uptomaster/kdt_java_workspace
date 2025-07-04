package lambdaTask;

// 7번 : 함수형 인터페이스의 객체를 람다식으로 만들기.
public class FuntionalMain {
	public static void main(String[] args) {

		// 익명클래스로 객체 생성부터 해보자.
		Func1 f1 = new Func1() {
			
			@Override
			public void addTen(int number) {
				System.out.println(number + 10);
			}
		};
		f1.addTen(10); // 익명클래스로 객체 만들고 호출
		
		// 람다식으로 호출하기
		// 1. 이름을 없애고 ()뒤에 -> 붙인다.
		// 2. 반환타입 추론가능, 생략가능.
		// 3. 매개변수의 타입 추론가능, 생략가능. => 타입 생략 시 매개변수가 1개이므로 ()를 없애야함.
		// 4. 바디가 1줄이니 중괄호와 세미콜론을 생략가능.
		Func1 f11 = number -> System.out.println(number + 10);
		System.out.println(f11);
		f11.addTen(40);
		
		
		// Func2
		Func2 f2 = new Func2() {
			
			@Override
			public int printSum(int num1, int num2) {
				return num1+num2;
			}
		};
				
		// 람다식으로 만들기
		Func2 f22 = (num1, num2) -> {
			System.out.printf("num1 : %d, num2 : %d, num1+num2 :  ",num1, num2, num1+num2);
			return num1+num2;
		};
				
	}
}
