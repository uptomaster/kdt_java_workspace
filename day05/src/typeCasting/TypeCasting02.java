package typeCasting;
// 3번 : 문자열 자료형 -> 다른 자료형
public class TypeCasting02 {

	public static void main(String[] args) {
		// 기본자료형 -> 문자열 자료형
		String str1 = 3 + "";
		String str2 = "" + 6.17;
		String str3 = 'a' + "";
		String str4 = true + "";
		
		// 아래 출력값들의 타입은 모두 String이다.
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// 문자열자료형 -> 다른 기본자료형
		int number1 = Integer.parseInt(str1);
		System.out.println(number1); // 정수형으로 변환된 숫자 3이 출력.
		
		double number2 = Double.parseDouble(str2);
		System.out.println(number2 + 10); // 실수형으로 변환된 숫자 16.17이 출력.
		
		boolean isTrue2 = Boolean.parseBoolean(str4);
		System.out.println(!isTrue2); // 논리형으로 변환된 true 값에 토글의 의미인 ! 를 붙여서 false라는 논리값 출력
		
		char ch = "hello".charAt(0); // 0은 hello 문자열의 0번 인덱스
		System.out.println(ch); // 
		
		
	}

}
