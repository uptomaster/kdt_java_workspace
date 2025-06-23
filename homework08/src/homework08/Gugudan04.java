package homework08;
// 과제 2번 : Gugudan04 이중 while문
public class Gugudan04 {
	public static void main(String[] args) {
		// 이중 while문을 이용한 구구단 출력
		
		for(int i = 1; i <= 9; i += 3) {
			
			
			System.out.println();
			for (int j = 1; j <= 9; j++) { // 가로 줄에 바뀌지 않는값은 i로 입력한다.

				for (int k = 1; k <= 3; k++) { // 단에 해당.
					System.out.printf("(%d x %d) = %2d\t", k, j, k * j); // 한번 출력되면 탭키.
				}
				System.out.println(); // j루프가 한번 끝나면 다음줄로(다음단으로) 이동.
			}
			
		}
		
		
		
		
	}
}
