package forTest;

// 7번 : for문과 기타제어문
public class ForTest03 {
	public static void main(String[] args) {

		// 1부터 10까지 출력하기
		for (int i = 1; i < 11; i++) {
			System.out.printf(i + " ");

		}

		// 1부터 10까지 중 5까지만 출력하기
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}

		}

		// 1부터 10까지 중 5만 제외하고 출력하기
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}
}
