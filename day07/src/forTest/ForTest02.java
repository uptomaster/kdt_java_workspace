package forTest;

import java.util.stream.IntStream;

// 5번 : for문
public class ForTest02 {
	public static void main(String[] args) {

		// 1부터 100까지 수 중에서 짝수만 출력
		// 방법1 : 초기식 int i = 1, 조건식 i <= 100 또는 i < 101, 증감식 i++
		// if(i % 2 == 0) 일때만 i를 출력하자.

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();

		// 방법2 : 초기값 int i = 2, 조건식 i <= 100, 증감식 i+=2

		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();

		// 방법3 : for문의 조건식을 50으로 사용
		for (int i = 1; i <= 50; i++) { // 초기식 int i = 1, 조건식 i <= 50, 증감식 i++
			System.out.print((i) * 2 + " "); // i를 짝수로 만들기 위해 두배 만들기
		}

		System.out.println(); // 줄바꿈

		// 1부터 100까지의 수 중에서 짝수의 합만 구하기.
		int sum = 0; // 1) 누적 합을 저장할 변수 선언
		// 2) for문 초기식, 조건식, 증감식 원하는 양식으로 작성하기
		for (int i = 2; i <= 100; i += 2) { // 초기값 int i = 2, 조건식 i <= 100, 증감식 i+=2
			sum += i; // 갱신된 i의 값을 계속해서 sum 변수에 누적시켜 더한다.(누적합)
		}
		System.out.printf("방법1 : 1부터 100까지의 짝수의 합 : %d", sum); // 최종 누적합의 결과 출력
		System.out.println();
		// 조건식을 i <= 50으로 설정했을 경우
		int total = 0;
		for (int i = 1; i <= 50; i++) {
			total += i * 2;
		}
		System.out.println("방법2 : 1부터 100까지의 짝수의 합 : " + total);

		// 방법3 : int i=1; i <= 100; i++
		int adder = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				adder += i;
			}
		}
		System.out.println("방법3 : 1부터 100까지의 짝수의 합 : " + adder);

		// 방법4 : for문을 사용하지 않기
		int num = 50;
		sum = 2 * (num * (num + 1)) / 2; // 등차수열 합 공식
		System.out.println("방법4 : 1부터 100까지의 짝수의 합을 공식이용하기 : " + sum);

		// 방법5 : 스트림
		int sum1 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum();
		System.out.println("방법5 : 1부터 100까지의 짝수의 합을 스트림이용하기 : " + sum1);

	} // main 종료
} // 클래스 종료
