package manage;
// 이메일 형식 예외 처리
public class InvalidEmaileException extends Exception{

	String msg = "이메일 형식이 올바르지 않습니다.";

	public InvalidEmaileException(String msg) {
		super(msg);
	}
}
