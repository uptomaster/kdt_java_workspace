package interfaceTest02;

public class Hiphop implements Music{

	// Hiphop 클래스
	// "힙합 모드"를 출력하는 mode 구현
	// "오직 힙합만 실행" 출력하는 onlyHiphop메소드 만들기
	
	@Override
	public void mode() {
		System.out.println("힙합 모드");
	}
	
	void onlyHiphop() {
		System.out.println("오직 힙합만 실행");
	}
	
}
