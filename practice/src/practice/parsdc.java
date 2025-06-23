package homework08;

// 7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력
public class ArrayTask07 {
	public static void main(String[] args) {
		
		// 문자(아스키코드로 변환된 값)들을 담을 정수형 배열 선언
		int[] arr = new int[26];
		
		for(char c = 65; c < 90; c++ ) { // ABC....XYZ 의 각 아스키 코드값은 65 66 ... 90 이므로 차례로 증가시키기
			// abc....xyz 의 각 아스키 코드값은 97 98 99 ... 122
			if(c % 2 != 0) { // 만약에 아스키 코드값이 홀수라면(대문자라면) 짝수(소문자)로 바꿔준다. 
				// 아스키 코드 값 A -> a 로 갈려면 32를 더해주면됨
				arr[c-65] = (c + 32);
			}
			else {
				arr[c-65] = c;
			}
			
		}
		// 정수형 -> 문자형
		// 문자형 -> 정수형
		
		// 출력문 작성
		for(int i=0; i < arr.length; i++) {
			System.out.println((arr[i]));
		}
		
		
	}
}
