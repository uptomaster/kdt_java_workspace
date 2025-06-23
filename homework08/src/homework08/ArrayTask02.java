package homework08;

import java.util.Scanner;

// 문제 2번 : 1~10까지의 값 배열에 담고 합 출력
public class ArrayTask02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 클래스 변수 선언 및 import
		
		int[] arr1 = new int[10]; // 10칸짜리 배열 생성
		int sum = 0; // 배열의 각 저장공간에 담긴 값들의 합을 담을 정수형 변수 선언
		// 배열에 값 담는 반복문
		for(int i = 0; i < 10; i++) {
			arr1[i] = i+1; // 배열의 시작 인덱스 0번에는 1, 1번에는 2 ... 1씩 증가된 값을 넣어줌.
		}
		
		// 배열 출력 반복문
		for(int i = 0; i < 10; i++) {
			System.out.print(arr1[i] + " "); // 1~10까지의 값이 출력된다.
			sum += arr1[i]; // arr배열의 각 저장공간의 값들을 sum변수에 누적합으로 더한다.
		}
		
		System.out.printf("\n배열의 저장공간에 담긴 값의 총 합은 : %d", sum);
		
		sc.close(); // 스캐너 해제
		
	} // main 종료
}
