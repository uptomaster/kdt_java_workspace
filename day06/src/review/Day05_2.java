package review;
// 2번 : hw2 복습
import java.util.Scanner;

public class Day05_2 {

	public static void main(String[] args) {
//		나이를 입력받아 내년 나이를 출력하기 (nextInt()사용금지)
//	    
//	    클래스명 : Day05_2
//	    
//	    [입출력예시]
//	    이름 : 홍길동
//	    나이 : 20
//	    홍길동님의 내년 나이는 21살입니다.
//	    만나이는 19살입니다.  ← 생일이 안지났다고 가정.
		
		/* 1) 입력 클래스 import 및 클래스 변수 선언
		 * 2) 정수형 변수 2개 선언
		 * 3) 입력 메세지
		 * 4) 이름변수 = nextLine();
		 * 5) 입력 메세지
		 * 6) 나이변수 = Integer.parseInt(nextLine());
		 * 7) 출력
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(name + "님의 내년 나이는 " + (age+1) + "살입니다.");
		System.out.println("만 나이는 " + (age-1) + "살입니다.");
		
		sc.close();
		
		
		
	}

}
