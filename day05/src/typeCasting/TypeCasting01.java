package typeCasting;
// 2번 : 다른자료형 -> 문자열 형변환
public class TypeCasting01 {

	public static void main(String[] args) {
		int num1 = 10;
		float num2 = 20.17f;
		long num3 = 30L;
		double num4 = 40.17;
		boolean isTrue = true;
		char alpha = 'a';
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(isTrue);
		System.out.println(alpha);
		
		System.out.println(num1 + num3); // 정수 + 정수 = 정수
		System.out.println(num2 + num4); // 실수 + 실수 = 실수(double로 형변환)
		System.out.println(num1 + num4); // 정수(int) + 실수(double) = 실수(double) => 50.17 출력. 
		// 애초에 double이지만 double num4 = 40.17로 명시해 놓았기 때문에 두자리까지만 출력됨.
		
//		String result1 = num1 + num2; // 불가능. 문자열로 넣기 위해서는 연산 후 결과에 문자열을 넣어줘야한다.
		String result1 = num1 + num2 + ""; // 40 
		String result2 = "" + num1 + num3; // 1030 
		System.out.println("=============");
		System.out.println(result1); // => 10 + 30 = 40, 40 + "" => "40"
		System.out.println(result2); // => 왼쪽부터 순차적으로 계산이 된다. "10" + 30 => "1030"
		
		// isTrue라는 논리형값을 문자열로 변환
		System.out.println("isTrue라는 논리형값을 문자열로 변환");
		System.out.println(isTrue + "");
		System.out.println(alpha + ""); // 문자형으로 보이지만 문자열로 바꾼것임.
		
		
	}

}
