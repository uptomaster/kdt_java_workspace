package manage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserService extends User {

	static public Set<User> userSet; // User 클래스에 저장된 필드인 id, name을 가짐.
	Iterator<User> iter;

	// 생성자
	public UserService() {
		userSet = new HashSet<User>();
	}

	// 메소드

	// 유저 추가 메소드
	public void addUser(Object user) {
		userSet.add((User) user);
	}

	// 유저 조회
//	public void selectUser() {
//		while(iter.hasNext()) {
//		iter.next();
//		}
//	}

	@Override
	public String toString() {
		Iterator<User> iter = userSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		return "=================User의 정보입니다.===================";
	}

}

//[요구사항]
//1. 사용자 저장 : 회원번호, 사용자 이름과 이메일 주소 저장 => User클래스에 저장되어야한다
//2. 사용자 조회 : 특정 사용자의 정보를 회원번호로 검색할 수 있어야한다
//3. 사용자 목록 : 시스템에 저장된 모든 사용자의 정보를 조회할 수 있어야한다
//4. 예외처리 : 사용자 정보 입력시 유효성 검사를 하고 잘못된 입력에 대해 예외처리를 해야한다
// (ex : 잘못된 이메일형식, 빈 이름 등)
//
//UserService 클래스 : 사용자 관리 로직 담당, List
