package review;

public class ArrayTask04 {

	public static void main(String[] args) {
		// 4번 : 0 1 2 3 0 1 2 3 배열에 담고 출력
		
		//1) 8칸짜리 정수형 배열 선언
		int[] arr = new int[8];
		//2) 0 1 2 3이 반복됨을 알았음 -> 반복문으로 만들기
		for(int i = 0; i < arr.length; i++) {
			// i % 4에 해당하는 값을 배열에 넣어주기
			arr[i] = i % 4; // 0 % 4 => 0, 1 % 4 = 1, 2 % 4 = 2, 3 % 4 = 3, 4 % 4 = 0 ....
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
		
	}

}
