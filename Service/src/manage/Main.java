package manage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램 시작");
			User user = new User();
			System.out.println("사용하실 사용자 번호를 입력하세요.");
			user.setUser_id(sc);
			System.out.println("사용자의 이름을 입력하세요.");
			user.setUser_name(sc);
			System.out.println("사용자의 이메일을 입력하세요.");
			user.setUser_Email(sc);
			
			UserService.addUser();
			}
		
		
	}
}
//Main 클래스 : 사용자 정보를 추가, 모든 사용자 정보 출력
//잘못된 형식의 이메일로 사용자를 추가 시 예외처리
//존재하지 않는 사용자를 조회 시 예외처리