package review;

public class ArrayTask02 {

	public static void main(String[] args) {
		// 2. 1~10까지의 값을 배열에 담고 총 합을 출력
		
		//1) 10칸짜리 배열 선언
		//2) 총 합 구할 변수 선언 sum
		//3) for문(1부터 10까지 저장) int i = 1; i <= 10; i++
		//	해당 배열 인덱스에 맞게 입력하고 값 저장.
		//  sum += 배열명[i-1];
		//4) 총합출력
		
		int [] arr = new int[10];
		int sum = 0;
		for(int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
			sum += arr[i-1];
		}
		
		
		System.out.printf("1부터 10까지의 총합은 : %d", sum);
	}

}
