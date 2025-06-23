package review;

public class ArrayTask05 {

	public static void main(String[] args) {
		// 5번: A ~ F까지를 배열에 값을 넣고 출력
		// 문자형 배열 6칸 짜리 선언
		char [] arr = new char[6];
		// for문으로 A ~ F 생성하기
		for(int i = 'A'; i <= 'F'; i++) {
			arr[i-'A'] = (char)i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i]+ " ");
		}
		
		
	} // main 종료
}
