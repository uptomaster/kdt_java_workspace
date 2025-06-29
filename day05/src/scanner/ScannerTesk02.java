package scanner;

import java.util.Scanner;

// 10번 : 입력 클래스, 입력 메소드 연습2
public class ScannerTesk02 {

	public static void main(String[] args) {
		
		 /*	1. 줄 단위로 입력받아 출력하기(입력은 반드시 3번, 출력은 1번만 사용해서 출력형태 만들기.)
		 	입력1 : 자바는
		 	입력2 : 객체지향
		 	입력3 : 언어입니다.
		 	[출력]
		 	자바는
			객체지향
			언어입니다.
			* */
		
		/*
		 * <로직 구성>
		 * Scanner 클래스 변수 선언 및 import
		 * 입력 시 출력할 메세지 입력
		 * 변수명 선언과 동시에 sc.next()로 입력받을 내용으로 초기화하기.
		 * 출력문 작성
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("입력1");
//		String word1 = sc.next();
//		System.out.println("입력2");
//		String word2 = sc.next();
//		System.out.println("입력3");
//		String word3 = sc.next();	
//		System.out.printf("%s\n%s\n%s\n", word1, word2, word3);

		
		
		/* 2. 이름과 나이, 취미를 순서대로 입력받기.(입력메소드 이름과 취미 nextLine() 사용, 나이는 next() 사용)
		 * 출력 메소드는 printf()사용할 것. 형변환 반드시 적용해서 출력할 것. 덧셈연산자 사용할 것.
		 * 이름입력 : 홍길동
		 * 나이입력 : 20
		 * 취미입력 : 여행
		 * 
		 * [출력]
		 * 홍길동은 20살이고 취미는 여행입니다.
		 * 홍길동은 2026년에 21살입니다.
		 * */
		
		/*
		 * <로직 구성>
		 * Scanner 클래스 변수 선언 및 import
		 * 입력 시 출력할 메세지 입력
		 * 이름, 나이, 취미를 담을 변수명 선언과 동시에 sc.next()로 입력받을 내용으로 초기화하기.
		 * 이름과 취미는 String 타입이고, 나이는 int타입이므로 문자열->int타입 형변환을 진행
		 * 출력문 작성은 printf() 메소드 이용. 문자열과 다른 자료형의 결합은 + 로 진행.
		 * ※※※※※※버퍼 피우기※※※※※※※ => next() 이후에 nextLine()으로 입력받을 때 nextLine()을 한번 더 사용해서 버퍼를 비워야함.
		 * 마지막으로, close()를 사용해서 스트림을 닫아주며 종료.
		 * */
		
//		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		
		System.out.println("이름입력 : ");
		String name = sc.nextLine();
		
		System.out.println("나이입력 : ");
		int age = Integer.parseInt(sc.next());
		
		sc.nextLine(); 
		// next()는 버퍼에서 엔터를 소모를 하지 않는데, 
		// nextLine() 메소드를 한번 이용하여 다음 커서로 넘어갈 수 있게 해준다.
		
		System.out.println("취미입력 : ");
		String hobby = sc.nextLine();
		
		System.out.printf(name + "은 " + age + "살이고 취미는 " + hobby + "입니다.\n" + name + "은 2026년에 " + (age+1) + "살 입니다.");
		
//		sc.close();
	}

}
