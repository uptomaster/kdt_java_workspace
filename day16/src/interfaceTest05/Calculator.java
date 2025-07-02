package interfaceTest05;

// 20번 : static 메소드, default 메소드, private 메소드
public interface Calculator {

	// 인터페이스

	// default 메소드
	default int add(int num1, int num2) {
//		return validate(num1,num2) == 1 ? num1 + num2 : 0; // 삼항연산자로 참일때 원하는값 출력, 거짓이면 0출력
		return validate(num1, num2) * (num1 + num2); // 거짓이면 0을 곱하므로 0출력, 참이면 1을 곱하므로 원하는 값 그대로 출력.
	}

	default int subtract(int num1, int num2) {
		return num1 - num2;
	}

	// static 메소드
	static void info() {
		System.out.println("계산기 인터페이스입니다. 양수만 가능합니다.");
	}

	// private 메소드로 양수인지 판별하기
	private int validate(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			System.out.println("음수값은 사용 불가합니다.. 양수만 가능합니다...");
			return 0;
		}
		return 1;
	}

}
