package practice;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 구구단 3행 3열로 출력하기

		// while문 중첩으로 구구단 출력하기
		
		// 0 ~ 10까지의 값을 배열에 넣고 출력
		int [] num = new int[11]; // 11칸짜리 정수형 배열 선언
		for(int i = 0; i <= 10; i++) {
			num[i] = i;
			System.out.printf(num[i] + " ");
		}
		// 1 ~ 10까지의 값을 배열에 넣고 총 합을 출력
		int num1 [] = new int[10];
		
		// 3명의 수학점수를 사용자에게 입력받아서 배열 저장, 평균 점수 출력
		
		// 0 1 2 3 0 1 2 3 이라는 값을 배열에 담고 출력

		// 5개의 정수를 입력받은 뒤 그 값을 배열에 넣고 최대, 최소값 출력
		
		// 2행 3열의 배열 {{1,2,3},{4,5,6}}
		int [][]arr = new int[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
//				arr[i][j] = (i * 3) + j + 1; [0][0] -> [0][1] -> 
			}
		}
	}
	

	
}
