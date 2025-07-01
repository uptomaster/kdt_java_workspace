package practice;

public class PrintReverseTriangle {
	public static void main(String[] args) {

		// 역삼각형 모양의 별모양 출력하기
		// 첫 공백은 1칸
		// 다음 공백은 2칸, 3칸, ...
		// 공백출력해야함
		for (int i = 0; i < 7; i++) { // 전체 루프는 7번 반복할것
			for (int j = 0; j < 2*i + 1; j--) { // 공백 출력
				System.out.printf(" ");
			}
			for (int k = 0; k < 2 * i + 5; k++) { // * 출력
				System.out.print("*");
			}
		}

	}
}

// *******
//  *****
//   ***
//    *
