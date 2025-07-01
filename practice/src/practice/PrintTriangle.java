package practice;

public class PrintTriangle {
	public static void main(String[] args) {

		// 삼각형 모양의 별 출력하기
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
