package oper;
// 15번 : 증감연산자
public class OperTest02 {

	public static void main(String[] args) {
		int num = 1;
		System.out.println("num의 값 : " + num);
		System.out.println("num + 10의 값 : " + (num + 10));
		
		System.out.println("==========증감연산자Test(전위형)============");
		System.out.println("기존 num의 값 : " + num); // 1
		System.out.println("전위증감연산자를 사용한 num의 값 : " + ++num); // 2
		System.out.println("현재 num의 값 : " + num); // 2
		
		System.out.println("==========증감연산자Test(후위형)============");
		int num2 = 1;
		System.out.println("기존 num2의 값 : " + num2); // 1
		System.out.println("후위증감연산자를 사용한 num2의 값 : " + num2++); 
		// 1이 출력되지만, 실제 num2의 값은 1만큼 증가한 2가 저장되어있음.
		System.out.println("현재 num2의 값 : " + num); // 2
		
		System.out.println();
		int num3 = 7, num4 = 7;
		int result1 = 0, result2 = 0;
		
		result1 = --num3 + 4;
		System.out.println(result1);
		
		result2 = num3++ -4;
		System.out.println(result2);
	}

}
