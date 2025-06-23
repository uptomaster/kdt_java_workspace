package review;
// 복습
public class Oper {

	public static void main(String[] args) {
		int num1 = -8;
		System.out.println(num1 >> 1); // -4 출력. 부호비트를 유지한다.
		System.out.println(num1 >>> 1); 
		// 2147483644 출력 => 최상위 부호비트가 1이었는데, 오른쪽으로 밀려서 0으로 바뀐다. 따라서 가장 큰 양수로 출력된다.
		System.out.println(Integer.toBinaryString(-4 >>> 1)); // 1111111111111111111111111111110출력. 부호가 
	}
}
