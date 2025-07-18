package library02;

public class MaxBorrowException extends Exception{
	private String msg = "최대 권수에 도달했습니다.";

	public MaxBorrowException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
