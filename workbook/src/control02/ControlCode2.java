package control02;

// p.143 - 4번문제
public class ControlCode2 {

	public static void main(String[] args) {

		// 두 개의 주사위가 같은 값이 나올 때까지 while문을 사용해 반복하고,
		// 반복 횟수와 주사위 눈의 번호를 출력해 보세요.

		int[] dice_A = new int[] { 1, 2, 3, 4, 5, 6 };
		int dice_B[] = new int[] { 6, 5, 4, 3, 2, 1 };
		
		int stop = 0; // 같은 값이 나온 번호를 담을 변수
		int count = 0; // 반복 횟수를 담을 변수
		int chance = 6;
		
		while (chance--) {
			for (int i = 0; i < 6; i++) {
				if (dice_A[i] == dice_B[i]) {
					stop = i + 1;
					break;
				} else {
					count++;
					continue;
				}
			}
		}

		System.out.println("주사위 눈의 번호 : " + stop + "반복 횟수 : " + count);
		
	}
}
