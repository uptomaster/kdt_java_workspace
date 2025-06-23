package homework08;

import java.util.Scanner;

// 3번 : 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
public class ArrayTask03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력클래스 선언 
		
		// 수학점수 3개를 담을 배열 선언(3칸)
		int[] math_Grade = new int[3];
		// 평균 점수를 담을 정수형 변수 한개 선언
		int avg = 0;
		
		for(int i=0; i<math_Grade.length; i++) {
			// 입력메세지 출력
			System.out.println("수학점수를 차례로 입력해주세요.(1개 입력 후 엔터) : ");
			math_Grade[i] = Integer.parseInt(sc.nextLine());
		}
		
		// 출력문
		avg = (math_Grade[0] + math_Grade[1] + math_Grade[2]) / 3;
		System.out.printf("\n3명의 수학점수의 평균은 : %d", avg);
		
		
		
	}
}
