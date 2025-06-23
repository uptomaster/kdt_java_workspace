package practice;

import java.util.Scanner;

// buffer 원리를 설명하기 위한 next(), nextLine() 연습
public class Practice01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("buffer 테스트" + " 띄어쓰기와 엔터 : ");
		String name1 = sc.next();
		String name2 = sc.next();
		String name3 = sc.next();
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
	}

}
