package manage;
// 예외 처리 클래스
// 사용자 조회 기능을 이용할때 존재하지 않는 사용자를 조회할 경우 예외처리
public class UserNotFoundException extends Exception{
	
	String msg = "사용자를 찾을 수 없습니다.";

	public UserNotFoundException(String msg) {
		super(msg);
	}
	
	
}

//예외클래스 : InvalidEmaileException, UserNotFoundException 사용자 정의 예외 클래스
//사용자 입력 값 검증 : 이메일 형식 검증, 이름 비어있는지 검증