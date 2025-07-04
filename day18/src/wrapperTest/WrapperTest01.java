package wrapperTest;
// 5번 : Wrapper 클래스(boxing과 unboxing)
public class WrapperTest01 {
	public static void main(String[] args) {

		// boxing : 기본자료형의 값을 -> wrapper 클래스
		int num1 = 10;
		System.out.println(num1);
		
		Integer number = Integer.valueOf(10);
		System.out.println(number);
		System.out.println(number.toString()); // value값을 그대로 반환하도록 오버라이딩 됨을 알 수 있음.
		
		// unboxing : Wrapper 클래스 타입을 -> 기본자료형으로 바꿔주는 것.
		int unNum1 = number.intValue();
		System.out.println(unNum1);
		
		// AutoBoxing
		double num2 = 1.1; // 기본자료형 값
		Double dNumber = num2; // 자동으로 boxing된다.
		System.out.println(dNumber);
		System.out.println(num2);
		
		// AutoUnBoxing
		Double unNum2 = dNumber;
		System.out.println(unNum2);
	}
}
