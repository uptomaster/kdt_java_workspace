package ex02_이남혁;

public class MoneyException extends Exception{

	public MoneyException() {
		super("출금 금액이 잔액보다 많습니다.");
	}
}
