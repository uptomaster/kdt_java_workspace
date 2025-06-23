package typeCasting;
// 12번 : 강제 형변환
public class TypeCasting02 {

	public static void main(String[] args) {

		// 형변환 연산자 (자료형)을 사용해서 강제로 형변환한다.
		// 주로 큰 범위를 가진 자료형 -> 작은 자료형으로 변환시 데이터 손실이 발생하는데,
		// 이 상황에서 강제 형변환을 사용한다.
		
		// 컴파일러는 명시적인 강제 변환이 없으면 오류를 발생시킨다.
		
		
		// 1) 실수 -> 정수
		double num1 = 3.141592;
		int result1 = (int)num1;
		System.out.println(result1);
		System.out.println(num1);
		
		System.out.println("실수형 num1의 값 : " + num1 + ", 정수형으로 변환된 result1의 값 : " + result1);
		
		// 2) 큰 범위 정수 -> 작은 범위 정수	(long -> int)
		long num2 = 10L; // 8byte
		int result2 = (int)num2; // 4byte
		System.out.println("long 타입 num2의 값 : " + num2 + ", int 타입으로 변환된 값 : " + result2); // L 은 명시하기 위한것일뿐 출력 X.
		
		// 3) 범위 초과(오버플로우)
		long num3 = 2147483648L;
		int result3 = (int)num3;
		System.out.println("long 타입 num3의 값 : " + num3 + ", 왜곡된 값 : " + result3); // overflow
		
		/*
		 * <음수가 나타나는 이유(overflow의 원리)>
		 * 
		 * int의 범위는 32bit 자료형
		 * 값의 범위 -2,147,483,648 ~ 2,147,483,647
		 * long 타입에서 int로 변환이 이루어지게 되면, 
		 * 2147483648은 int 범위를 초과하게 된다. 
		 * 초과되면 상위비트(초과된 비트)가 잘리게된다.
		 * 잘린 비트는 2의 보수 형식으로 계산이 되고, 
		 * 그렇기 때문에 음수 값으로 변환이 된다.
		 * 32비트는 4자리씩 8개가 있다는 것.
		 * 1000 0000 0000 0000 0000 0000 0000 0000
		 * 값 왜곡은 작은 자료형으로 형변환시 발생할 수 있는 문제.
		 * 강제 형변환은 값의 범위를 초과하지 않을 때만 사용할 수 있다.
		 * 필요한 경우, 변환하기 전에 범위를 확인해야 한다!
		 * */ 
		
		
	}

}
