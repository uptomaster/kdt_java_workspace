package homework07;

import java.util.Scanner;

// 6번 문제
public class AtmTest {
	public static void main(String[] args) {
//		6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
//		   [조건]
//		   초기 잔액은 10000원으로 설정
//		   메뉴 선택에 따라 작업 수행
//		   종료시 프로그램 종료
//		   숫자(번호)로 입력받기
//
//		   String msg ="\nATM 기기의 메뉴 중 번호를 선택하세요."
//		      + "\n1. 잔액조회"
//		      + "\n2. 입금"
//		      + "\n3. 출금"
//		      + "\n4. 종료"
//		      + "\n선택 : ";
//		      System.out.println(msg);
//		   그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
//		   번호 입력시 해당 메시지만 출력
		
		Scanner sc = new Scanner(System.in);
		String msg ="\nATM 기기의 메뉴 중 번호를 선택하세요."
			      + "\n1. 잔액조회"
			      + "\n2. 입금"
			      + "\n3. 출금"
			      + "\n4. 종료"
			      + "\n선택 : ";
		int choice = 0;
		
		do {
			
			System.out.println(msg);
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("잔액은 10000원입니다.");
				break;
			case 2:
				System.out.println("입금기능입니다.");
				break;
			case 3:
				System.out.println("출금기능입니다.");
				break;
			case 4:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("다시 입력하세요.");
				break;
				
			}
		}while(choice!=4);
			
		
	} // main 종료
}
