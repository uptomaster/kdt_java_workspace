package anonymousTest;

// 5번 : 잉ㄴ터페이스 객체화 위한 Main 클래스
public class InterMain {
	public static void main(String[] args) {

		InterA i = new InterA() {// 익명클래스

			@Override
			public void method() {
				System.out.println("익명 객체의 메소드 재정의");
			}
		};
		System.out.println(i);
		i.method();

		// 람다식
		InterA ii = () -> System.out.println("람다식");
		System.out.println(ii);
		ii.method();
	}
}
