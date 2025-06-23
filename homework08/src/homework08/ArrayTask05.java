package homework08;

// 5번: A ~ F까지를 배열에 값을 넣고 출력
public class ArrayTask05 {
	public static void main(String[] args) {

		// 알파벳 6개를 담을 문자형 타입의 배열 선언 (6칸)
		char []arr = new char[6];
		
		// 반복문으로 A ~ F를 각 인덱스에 맞게 넣어준다.
		for(char i = 65; i <= 70; i++ ) {
			arr[i-65] = i; 
		}
		// 문자형 -> 정수형 형변환 O
		// 정수형 -> 문자형 형변환? 
		
		
		// A B C D E F 가 차례로 출력되어야함.. 그럼 각 아스키코드값을 구한다.
		// 65 66 67 68 69 70 이므로 이걸이용해서 반복문
		
		// 출력문 작성(반복문으로 배열값 출력)
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
		
		
	} // main 종료
}
