package variable;
// 3번 : 변수명 선언시 주의사항
public class Variable03 {

	public static void main(String[] args) {
		
		// 1) 문자부터 시작한다.
		// int 1num = 10; => 숫자부터 시작 시 에러발생.
		int num1 = 10;
		int nu1m = 10;
		// int num1 = 100; => 같은 영역 내에서 같은 이름의 변수 선언 시 에러발생.
		
		// 2) 특수문자를 쓸 수 없다. (단, _ 와 $ 만 사용가능)
		// int @#&%% = 100; => syntax error
		int a$b_ = 100; // $ _ 둘다 가능
		int _ab = 100; // _ 를 먼저 사용할수는 있지만, 사용하지 말 것.
		
		System.out.println(a$b_); 
		System.out.println(_ab); // 가능하지만, 1) '문자부터 시작한다' 를 생각할 것!
		
		// 3) 공백을 사용할 수 없다.(카멜표기법, 스네이크표기법, 파스칼표기법 등을 활용한다.)
		// String user name = "이남혁"; // user name이 아닌 username으로 사용한다.
		String userName = "이남혁"; // 첫단어는 소문자로 시작, 단어가 바뀔 때 대문자로 작성하는 표기법을 카멜표기법이라고 한다.(변수/메소드명)
		String user_name = "이남혁"; // 첫단어는 소문자로 시작, 단어가 바뀔 때 언더바를 작성하는 표기법을 스네이크표기법이라고 한다.(상수)
		String UserName = "이남혁"; // 첫단어의 첫문자를 대문자로 시작, 단어가 바뀔 때 첫문자를 대문자로 작성하는 표기법을 파스칼표기법이라고 함.(클래스명)
		
		// 4) 키워드(예약어)를 사용할 수 없다.
		// int int = 10;
		// int for = 10;
		// int public = 10;
		
		
		// 5) 되도록, 소문자로 시작해라.(대소문자를 구분한다.)
		int Abc = 100;
		int aBc = 200;
		System.out.println(Abc); // 100
		System.out.println(aBc); // 200
		
		// name, age, data, number, num1, min, max, height, weight .... 처럼 의미가 담긴 변수명을 사용한다.
		
		
	
	}

}
