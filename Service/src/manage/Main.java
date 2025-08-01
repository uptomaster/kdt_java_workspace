package manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws UserNotFoundException {

//		HashSet<User> userSet = new HashSet<User>();
		Scanner sc = new Scanner(System.in);
		UserService usv = new UserService();
		String menu = "0. 프로그램 종료\n" + "1. 회원가입\n" + "2. 회원정보조회";

		List<Integer> list = new ArrayList<Integer>(); // 사용자 id를 담아놓을 곳
		User user = new User();
		
		System.out.println("프로그램 시작");
		int id = 0;
		
		while (true) {
			try {
			System.out.println(menu);
			int choice = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			
			System.out.println(list.toString());
				if(choice == 0) {
					System.out.println("프로그램을 종료합니다.");
					return;
				}
				else if(choice == 1) {
					System.out.println("=====회원가입 과정입니다.===== ");
						
						user.setUser_id(id);
						list.add(id); // 사용자 id를 저장해놓을 곳
						System.out.println("사용자의 이름을 입력하세요.");
						String name = sc.nextLine();
						user.setUser_name(name);
						System.out.println("사용자의 이메일을 입력하세요.");
						String email = sc.nextLine();
						user.setUser_Email(email);
						// user 정보 출력(toString())
						System.out.println(user);
						// user 추가
						usv.addUser(user);
						System.out.println("회원가입 완료. ID : " + id);
						id++; // user추가했으므로 i 1만큼 증가
						System.out.println(usv);
						continue;
				}
				else if(choice == 2) {
					System.out.println("=====회원정보 조회를 선택하셨습니다.=====");
					System.out.println("     회원님의 ID번호를 입력하세요.");
					int checkNum = sc.nextInt(); 
					System.out.println("check : " + checkNum);
					System.out.println("userid : " + list.get(id));
					if(checkNum == list.get(id)){
						System.out.println(usv);
					}
					else {
//						usv.selectUser();
						System.out.println("존재하지 않는 회원번호입니다.");
					}
					continue;
				}
				else {
					System.out.println("잘못된 번호를 입력하셨습니다.");
					continue;
				}
			} catch (NullPointerException e) {
				System.out.println("널포인트에러");
			}
		}
	}
}
//Main 클래스 : 사용자 정보를 추가, 모든 사용자 정보 출력
//잘못된 형식의 이메일로 사용자를 추가 시 예외처리
//존재하지 않는 사용자를 조회 시 예외처리