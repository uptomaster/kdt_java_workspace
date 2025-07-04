package array;

import java.util.Arrays;

// 8번 : Array.sort()
public class ArraySortTest01 {

	public static void main(String[] args) {
		// 1차원 배열
		int[] number = {5,2,6,3,1,8};
		// 2차원 배열
		int[][] number2 = {{5,2,6},{3,1,8}};
		
		//출력
		System.out.println(number);
		System.out.println("1차원 배열 값 출력 : " + Arrays.toString(number));
		System.out.println(number2);
		System.out.println("2차원 배열 값 출력 : " + Arrays.toString(number2)); // 2차원에서는 각 행의 주소값이 나옴.
		//2차원 배열의 값을 출력할때는 Arrays.deepToString(number2)
		System.out.println("2차원 배열 값 출력 : " + Arrays.deepToString(number2)); // 2차원에서는 각 행의 주소값이 나옴.
		
		System.out.println("정렬 전 number1 : " + Arrays.toString(number));
		System.out.println("정렬 전 number2 : " + Arrays.deepToString(number2));
		
		Arrays.sort(number);
		// 1차원 배열 정렬
		System.out.println("정렬 후 number1 : " + Arrays.toString(number));
		
//		Arrays.sort(number2);		
		// 2차원 배열 정렬 => 불가능 => 각 행을 개별적으로 정렬해야함.
		// 2차원 배열의 내부 요소를 정렬할때는 for문이나 수동정렬이 필요하다!
		for(int i = 0; i < number2.length; i++) {
			Arrays.sort(number2[i]);
		}
		System.out.println("정렬 후 number2 : " + Arrays.deepToString(number2));
		
		for(int[] row : number2) {
			Arrays.sort(row);
		}
		
		System.out.println("정렬 후 number2 : " + Arrays.deepToString(number2));
	}

}
