package interfaceTest02;

public class Ballad implements Music{
	// Ballad 클래스
	// "발라드 모드"를 출력하는 mode 구현
	// "오직 발라드만 실행" 출력하는 onlyBallad메소드 만들기
	
	@Override
	public void mode() {
		System.out.println("발라드 모드");
	}
	
	void onlyBallad() {
		System.out.println("오직 발라드만 실행");
	}
	
}
