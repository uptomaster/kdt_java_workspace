package control02;

// 제어문2(p.143 - 3번)
public class ControlCode1 {

	public static void main(String[] args) {

		int sum = 0;
		// 1부터 100까지 정수 중 짝수만을 더해서 합계 출력하기
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("1부터 100사이 짝수만 합계 : " + sum);
	}

}
