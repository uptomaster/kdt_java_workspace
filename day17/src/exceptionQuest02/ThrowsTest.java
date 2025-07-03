package exceptionQuest02;

// 13번 : throws와 throw (throws 예외 던지기, 메소드 선언부에 사용한다.)
public class ThrowsTest {
	public static void main(String[] args) {
		method();

	}

	static void method() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			// try ~ catch 블록 단축키  : alt + shift + z + 드래그
			try {
				Thread.sleep(500);// 500ms => 0.5초, 1000ms => 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
