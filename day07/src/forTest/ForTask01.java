package forTest;

// 6번 : for문 연습
public class ForTask01 {
	public static void main(String[] args) {

		// for문만 사용하기
		// 1. 100부터 1까지 출력(tab키로 띄워쓰기)
		for (int i = 100; i > 0; i--) {
			System.out.printf("%d\t", i);
		}

		System.out.println();

		// 2. 구구단 3단만 출력하기.
		for (int i = 1; i <= 9; i++) { // 초기식 i=1, 3단이므로 i<=3까지만 출력, i++
			System.out.printf("3 x %d = %d\n", i, 3 * i); // 3 x i 꼴로 구구단 출력
		}

		System.out.println(); // 줄바꿈

		// 3. A~F 출력 (초기식 char i = 'A'사용)

		for (char i = 'A'; i <= 'F'; i++) {
			System.out.println(i);
		}

		System.out.println(); // 줄바꿈

		// 4. A ~ F 출력 (초기식 int i = 0 사용)

		char ascii = 'A';
		for (int i = 0; i < 6; i++) { // 6번반복한다는 의미
			// A의 아스키 코드 값은 65
			System.out.printf("%c", ascii + i);
		}

		System.out.println(); // 줄바꿈

		// 5. aBcDeFgHiJkLmNoPqRsTuVwXyZ

		// a : 97
		// A : 65
		// B : 66
		// b : 98
		// z : 122
		ascii = 'A';
		for (ascii = 'A'; ascii <= 'Z'; ascii++) { // 대문자 아스키 코드 + 32 => 소문자 변환
			// 홀수번째 인덱스에 해당하는 문자들에 아스키 코드값 32를 더한다.
			if (ascii % 2 != 0) {
				System.out.printf("%c", ascii + 32);
			} else {
				System.out.printf("%c", ascii);
			}
		}

		System.out.println(); // 줄바꿈

		// 위 방법을 삼항연산자를 이용.
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (i % 2 == 0 ? i + 97 : i + 65));
		}

	} // main종료
}
