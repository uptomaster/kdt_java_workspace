package interfaceTest02;

public class Rock implements Music{

	
	// Rock 클래스
		// "락 모드"를 출력하는 mode 구현
		// "오직 락만 실행" 출력하는 onlyRock메소드 만들기
	@Override
	public void mode() {
		System.out.println("락 모드");
	}
	
	void onlyRock() {
		System.out.println("오직 락만 실행");
	}
}
