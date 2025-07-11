package forTest;

// 4번 : for 문 기초
public class ForTest01 {
	public static void main(String[] args) {

		// for(초기식; 조건식; 증감식){}

//		for(;true;) { // 이런 코드를 무한루프라고 한다. 
//			//조건식에 해당하는 곳이 false로 만드는 과정이 반드시 필요하다.
//			System.out.println("행복하지않다...");
//			break; // 단, break 제어문을 사용하면 단 한번만 실행된다.
//		}

//		for(int i = 0; i < 10; ++i) {
//			// 정수형 i가 0인 초기값부터, 10보다 작을때까지 i를 1씩 증가시키며 이 영역을 반복한다.
//			System.out.printf("%d번 : 행복\n", i);
//			
//		}
//		
//		for(int i = 1; i < 10; i++) { // 초기식을 0으로 두느냐, 1로 두느냐에 따라서 반복횟수도 달라진다.
//			System.out.println(i);
//		}
//		

		// 이름 10번 출력
		// 초기식 i = 0으로 시작한다.
		// 조건식
		// 증감식
		// 중괄호 안에서 출력 =>
		// 1번 : 000
		// ...
		// 10번 : 000 으로 출력하기.
		String name = "이남혁";
//		for(int i=0; i<10; i++) {
//			System.out.printf("%02d번 : %s\n", i+1, name);
//		}

		// 10번째
		// 9번째
		// 8번째
		// ...
		// 1번째 까지 출력하기

		// for
		// 초기식 => int i = 10; <=> int i = 0;
		// 조건식 => i > 0; <=> i < 10;
		// 증감식 => i-- <=> i++
		for (int i = 0; i < 10; i++) {
			System.out.printf("%2d번째\n", (10 - i));
			// 2자릿수 지정출력 %2d
		}

		// 손으로 써보기
		/*
		 * 초기식 i=0 조건식 0<10 true => 10번째 출력 => i++ => i=1 => 조건식 1<10 true => i++ => i=2
		 * => 조건식 2<10 true => i++ ... => i=9 => 조건식 9<10 true => i++ => i=10 => 조건식
		 * 10<10 false => for문 탈출
		 * 
		 */
		int sum = 0; // 총 합을 구할 변수는 for문 밖에서 선언하자.
		// 1부터 10까지의 합 구하기
		for (int j = 1; j <= 30; j++) {

			sum += j; // 누적합
			System.out.printf("01부터 %02d까지의 합 : %02d\n", j, sum);
		}

	}

}
