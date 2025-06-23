package review;

import java.util.Scanner;

public class ArrayTask08 {

	public static void main(String[] args) {
		// 8. 5개의 정수를 입력받고, 그 값을 배열에 담고 최대값과 최소값을 출력
		
		//1) 정수형 배열 5칸짜리 생성
		int [] arr = new int[5];
		//2) 출력메세지(String msg 변수 선언)
		String msg = "번째 정수 입력";
		//3) 입력클래스 변수선언 import
		Scanner sc = new Scanner(System.in);
		//4) 최대값과 최소값을 담을 변수 선언
		int max = 0, min = 0;
		//5) for문 작성 int i = 0; i < arr.length; i++
		for(int i =0; i < arr.length; i++) {
			// msg 출력
			// 배열명[i] = sc.nextInt();
			System.out.println((i+1) + msg);
			arr[i] = sc.nextInt();		
			//6) 최대값, 최소값 변수 = 0번째 인덱스 값을 대입.
			max = arr[0];
			min = arr[0];

		}
		
		//7) 크기 비교할 for문 작성
		// if(max < arr[i]) {max = arr[i]}
		// if(min > arr[i]) {min = arr[i]}
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.printf("최대값은 : %d, 최소값은 : %d", max, min);
		
		
	}

}
