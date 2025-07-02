package anonymousTest;

// 29번 : 익명 클래스 - 메인 클래스
public class AnonymousMain {
	public static void main(String[] args) {
		InterA inter = new InterA() {
			// 익명클래스 => 클래스 중괄호안에서 오버라이딩
			@Override
			public void printText() {
				System.out.println("익명클래스1에서 오버라이딩");
				System.out.println("수업 끝!!!");
			}

		};
		
		System.out.println(inter); // anonymousTest.AnonymousMain$1@2ff4acd0
		inter.printText();
	
	}
}
