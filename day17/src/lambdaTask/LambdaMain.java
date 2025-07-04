package lambdaTask;

// 람다 실습
public class LambdaMain {
	public static void main(String[] args) {

		// 인터페이스명 : CombInter(함수형 인터페이스)
		// 두 문자열을 입력받아 연결하는 추상 메소드를 만든다(명령문은 한줄)
		// 메인메소드에서 익명클래스로 객체화
		// 메인메소드에서 람다식으로 객체화

		// 1. 익명클래스로 객체화
		CombInter c1 = new CombInter() {

			@Override
			public String connect(String s1, String s2) {
				return s1 + s2;
			}
		};
		
		System.out.println(c1.connect("안녕", "하세요"));
		
		// 2. 람다식으로 객체화
		CombInter c2 = (s1, s2) -> { return s1 + s2;};
		System.out.println(c2.connect("h", "i"));
	}
}
