package whileTest;

// 9번 : while문 활용한 합계 구하기
public class WhileTest02 {

	public static void main(String[] args) {

		// 1)1부터 100까지의 합 구하기(for문 이용)
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			// 초기값 i = 1, i = 100에 도달하면 중괄호 영역 수행 후 종료. i는 1씩 증가
			total += i; // 합을 받아줄 total변수에 i를 누적하여 저장한다.
		}
		System.out.println("방법1(for문) 1부터 100까지의 합 : " + total); // 출력문

		// 2)1부터 100까지의 합을 구하기(while문 이용)

		// 사용할 변수 2개(총 합, 증가시킬 변수) 선언.
		int i = 0; // 증가시킬 수 있는 변수 선언
		int sum = 0; // 총 합을 저장시킬 누적 변수
		while (i < 100) {
			i++; // 먼저 i를 증가시킨다.
			sum += i; // 증가된 i값을 누적해서 저장한다.
		}
		System.out.println("방법2(while문) 1부터 100까지의 합 : " + sum); // 출력문

		// 문제3) 1부터 100까지 짝수의 합, 홀수의 합 추가적으로 구하기

		// 짝수의 합과 홀수의 합을 저장할 변수 선언하기
		// 증가시킬 변수 하나 선언하기
		int even_Sum = 0, odd_Sum = 0; // 짝수의합, 홀수의합
		int j = 0; // 조작시킬 변수
		while (j <= 100) {
			if (j % 2 == 0) {// 짝수인 경우 짝수j를 짝수 합에 누적합.
				even_Sum += j;
			} else {
				odd_Sum += j;// 홀수인 경우 홀수j를 홀수 합에 누적합.
			}
			j++; // 마지막으로 j를 증가시킴.
		}

		System.out.printf("1부터 100까지 홀수의 합 : %d\n1부터 100까지 짝수의 합 : %d", odd_Sum, even_Sum); // 출력문

	} // main 종료

}
