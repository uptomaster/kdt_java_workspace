package review;

import java.util.Scanner;

public class ArrayTask03 {

	public static void main(String[] args) {
		// 3번 : 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
		
		//1) 입력 클래스 변수선언 import
		Scanner sc = new Scanner(System.in);
		//2) 정수 세개를 저장할 정수형 배열 선언
		int []arr = new int[3];
		//3) 평균 점수를 저장할 변수, 총합을 저장할 변수 선언. // avg = sum / 3.0;
		double avg = 0.0;
		int sum = 0;
		
		//4) for문(1부터 3까지 반복) int i = 1; i <=3; i++
			// 몇번째 학생인지 수학점수를 알려주자
			// arr[i-1] = nextInt()
		for(int i = 1; i <=3; i++) {
			
			System.out.printf("%d번째 학생의 수학점수를 입력하세요 : ",i );
			arr[i-1] = sc.nextInt();
			sum += arr[i-1];
		}
		avg = sum / 3.0;
		System.out.printf("세 학생의 수학점수의 평균은 %.2f점입니다.", avg);
		
		
	}// main 종료
}
