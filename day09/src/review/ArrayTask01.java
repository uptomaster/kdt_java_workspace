package review;

public class ArrayTask01 {

	public static void main(String[] args) {
		// 패키지 : homework08
		// 클래스 : ArrayTask01
//		1. 100~1까지의 값을 배열에 넣고 출력
		// 크기가 100인 배열 선언
		// for문을 통해 100부터 1까지 값 저장
		// for문 배열 출력
		
		int [] arr = new int[100];
		System.out.println(arr);
		
		for(int i = 100; i >= 1; i--) {
			arr[100-i] = i;
		}
	
		
		for(int i = 0; i < 100; i++ ) {
			System.out.print(arr[i] + " ");
		}
	}

}
