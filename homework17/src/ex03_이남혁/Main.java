package ex03_이남혁;

public class Main {
	public static void main(String[] args) {

		String nation = "Korea,Spain,Germany,America";
		StringInter si = new StringInter() { // 익명 클래스 중괄호 시작
			@Override
			public String modify(String str) {
				str = str.replace(',', '!');
				return str;
			}
		}; // 익명 클래스 중괄호 종료
		System.out.println("================익명 클래스로 객체 생성====================");
		System.out.println(si);
		System.out.println(si.modify(nation));

		StringInter s = (str) -> {
			str = str.replace(',', '!');
			return str;
		};
		System.out.println("================람다식으로 객체 생성====================");
		System.out.println(s);
		System.out.println(s.modify(nation));

	} // 메인 클래스 중괄호 종료
}
//메인 클래스 : Main
//메소드 : main메소드
// String nation = "Korea,Spain,Germany,America";