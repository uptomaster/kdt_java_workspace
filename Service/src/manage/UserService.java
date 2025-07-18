package manage;

import java.util.Collection;
import java.util.List;

public class UserService {

	List<User> userList; // User 클래스에 저장된 필드인 id, name, email을 가짐.
	
	// 메소드
	public boolean selectUser(int user_id) { // 유저가 존재하는지 여부 판단
		if(userList.contains(user_id)) {
			return true;
		}
		else return false;
	}
	
	// 유저 추가 메소드
	public void addUser(Collection id) {
		userList.addAll(id);
		
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

