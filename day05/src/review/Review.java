package review;
// 1번 : 복습
public class Review {

	public static void main(String[] args) {
			
		//printf() : 서식 지정 출력메소드
		System.out.printf("'%s' '%d' '%f' '%s'\n","Hello", 2025, 6.17, true );
		System.out.printf("'%7s' '%d' '%f' '%s'\n","Hello", 2025, 6.17, true );
		// 문자열이 5자리인데, 7자리로 서식지정을 하니 공백이 추가되었음.
		System.out.printf("'%7s' '%5d' '%f' '%s'\n","Hello", 2025, 6.17, true );
		System.out.printf("'%7s' '%5d' '%5.2f' '%s'\n","Hello", 2025, 6.17, true );
		System.out.printf("'%-7.2s' '%5d' '%5.2f' '%s'\n","Hello", 2025, 6.17, true );
		System.out.printf("'%-7.2s' '%05d' '%5.2f' '%s'\n","Hello", 2025, 6.17, true );
		System.out.printf("'%-7.2s' '%-5d' '%5.2f' '%s'\n","Hello", 2025, 6.17, true ); // 왼쪽 정렬
		System.out.printf("'%-7.2s' '%-5d' '%10f' '%s'\n","Hello", 2025, 6.17, true ); // 실수도 기존 자릿수보다 큰 자릿수 지정가능
		System.out.printf("'%-7.2s' '%-5d' '%10f' '%5s'\n","Hello", 2025, 6.17, true ); // 논리형도 자릿수 지정가능
		System.out.printf("'%-7.2s' '%-5d' '%10f' '%-5s'\n","Hello", 2025, 6.17, true ); // 논리형도 자릿수 지정가능 + 왼쪽정렬
		
		
		System.out.println("======================================================");
		
		//변수
		byte num1 = 5;
		byte num2 = 127;
		System.out.println(num1);
		System.out.println(num2); // 127은 byte의 가장 큰 출력값.
		
//		byte num3 = 128; // 128은 byte의 출력 범위 초과
		
		int num3 = 128;
//		byte num4 = num3; // 큰 범위 값을 작은 범위 값에 넣을 수 없음.
		byte num4 = (byte)num3; // 강제 형변환으로 오류는 발생하지 않지만 표현할 수 없는 범위이므로 음수로 출력된다.
		System.out.println(num4); // 오버플로우발생 -128 출력
		
		
		
	}

}
