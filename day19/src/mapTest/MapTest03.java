package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapTest03 {
	public static void main(String[] args) {

		// HashMap객체에 <이름, 점수> 10명 입력하고 평균값 반환하기.
		
		HashMap<String, Integer> grade = new HashMap<>();
		
		String name = "";
		int score = 0, total = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.nextLine();
			System.out.print("점수를 입력하세요 : ");
			score = Integer.parseInt(sc.nextLine());
			grade.put(name, score);
			total += score;
		}
		
		Iterator<Integer> iter = grade.values().iterator();
		System.out.println(grade.keySet()); // key를 set으로 만들고 보여주기/
		
		int a = 1;
		System.out.println(iter.hasNext()); 
		while(iter.hasNext()) {
			
			int value = iter.next();
			System.out.printf("학생 %d의 점수 : %d\n", a, value);
			a++;
		}
	
		System.out.println("학생 점수 평균 : " + total / 3);
	}
}
