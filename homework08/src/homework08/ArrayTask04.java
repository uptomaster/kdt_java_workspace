package homework08;

// 4번 : 0 1 2 3 0 1 2 3 배열에 담고 출력
public class ArrayTask04 {
	public static void main(String[] args) {
		
		// 정수를 담을 정수형 배열 선언(8칸)
		int[] arr = new int[8];
		
		// 숫자를 반복문으로 배열에 담기
	
			for(int i = 0; i < 8; i++) {
				arr[i] = i;
				if(i > 3) {
					arr[i] = i - 4;
				}
			}
	
		
		// 배열에 담긴 숫자 출력 (띄어쓰기로)
		for(int i = 0; i < 8; i++) {
			System.out.printf(arr[i] + " ");
		}
		
	} // main 종료
}
