package ex04_이남혁;

public class WhileGugudan {
//	 
//	- while문 이용(WhileGugudan) 로직구성 필요없음
	public static void main(String[] args) {

		int i = 1;

		while (i <= 9) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %2d\t", j, i, i*j);
			}
			System.out.println();
			i++;
		}

	}
}
