package ex04_이남혁;

public class ForGugudan {

//			문제 4. 구구단을 2단부터 9단까지 출력하세요. (20점)
//			- for문 이용 (ForGugudan) 로직구성 필요없음

	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) { // i는 단 수
			for(int j = 2; j <= 9; j++) { // j는 곱해질 수
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		
	}
}
