package homework08;

public class ArrayTask01 {
	public static void main(String[] args) {
		
//		배열 복습문제
//		- 배열에 값을 담아주는 반복문, 출력하는 반복문 따로 작성하기
//		- 로직구성 먼저!

		// 패키지 : homework08
		// 클래스 : ArrayTask01
//		1. 100~1까지의 값을 배열에 넣고 출력

		int[] arr1 = new int[100]; // 100칸짜리 배열 생성
		// 배열에 값 담는 반복문
		for(int i = 100; i > 0; i--) {
			arr1[100 - i] = i; // arr1 배열의 각 인덱스에 100부터 담고 1씩 감소된 값을 차례로 넣어준다. 그럼 100 ~ 1까지의 값이 인덱스 0 ~ 99까지 담기게된다.
		}
		
		// 배열 출력 반복문
		for(int i = 100; i > 0; i--) {
			System.out.printf(arr1[100-i] + "\n"); // 100 ~ 1까지의 값이 출력된다.
		}
		
	}
}
