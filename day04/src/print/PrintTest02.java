package print;
// 9번 : printf() 출력메소드
public class PrintTest02 {

	public static void main(String[] args) {
		
//		String name = "이남혁";
//		int age = 25;
//		
//		System.out.println("제 이름은 이남혁이고, 나이는 25살 입니다.");
//		System.out.println("제 이름은 " + name + "이고, " + "나이는 " + age + "살 입니다.");
//		// System.out.println("제 이름은 %s이고, 나이는 %d살 입니다.", name, age); // error
//		System.out.printf("제 이름은 %s이고, 나이는 %d살 입니다.", name, age); // 이 방식은 오직 printf() 메소드만 가능하다.
		

		
		// 정수형
		int num1 = 200;
		System.out.printf("10진수 : %d\n", num1);
//		System.out.printf("10진수 : %d\n", num1, "\n");	
		System.out.printf("10진수 : %d\n", 10);
		System.out.printf("8진수 : %o\n", 8);
		System.out.printf("8진수 : %o\n", 7);
		System.out.printf("8진수 : %o\n", 9);
		System.out.printf("16진수 : %x\n", 10);
		System.out.printf("16진수 : %x\n", 15);
		System.out.printf("16진수 : %x\n", 16); // 16진수는 0~9, 10 A, 11 B, 12 C, 13 D, 14 E, 15 F, 16 10
		
		// 실수형 => 정밀도 관련
		System.out.printf("\n실수형 : %f", 3.1234567); 
		// 실수형은 소수점 아래 6자리까지만 출력이 가능하다. 초과했다면 7번째자리에서 반올림한다.
		// float type => 소수점 이하 6자리까지만 명확하게 출력.
		double num2 = 3.1234567891234; 
		// double이 실수형의 기본타입인 이유 : 소수점 아래 15번째 자리까지 정밀하게 표현할 수 있다.
//		float num3 = 3.12345678912345;
		System.out.print(num2);		
		
		System.out.printf("\n실수형 2자리까지 표현 : %.2f\n", 3.12345);
		
		// 문자형
		System.out.printf("\n문자형 : %c", 'a');
//		System.out.printf("\n문자형 : %c", 'ab'); // c 타입은 한개의 문자만 가능하다. 이 코드는 에러.
		
		// 문자열
		System.out.printf("\n문자열 : %s", "Hello");
		String data = "hello, java";
		System.out.printf("\n문자열 : %s", data);
		
		// 논리형
		System.out.printf("\n논리형 : %s", true);
		System.out.printf("\n논리형 : %.1s", true); // 문자열 자릿수 슬라이싱도 가능하다.
		
		
	}

}
