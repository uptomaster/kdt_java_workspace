package lambdaTest;
// 6번 : 람다식 만드는 방법
public class LambdaTest {

	// 람다식
	// 매개변수 -> 바디
	
	void printHello() {
		System.out.println("HI");
	}
	
//	 매개변수없고, 리턴값 없음. 
//	 구현부의 내용은 출력문 1개만 있는 메소드를 람다식으로 바꾸기.
//     void printHello() {System.out.println("HI");}
//	 1. 이름을 없애고 ()뒤에 화살표 -> 를 붙인다.
//	 void() -> { System.out.println("HI");}
//	 2. 반환타입은 예상할 수 있으므로, 생략한다.
//	 () -> {System.out.println("HI");};
//	 3. 명령문이 1줄이면 중괄호와 세미콜론 생략이 가능하다.(선택사항임)
//	() -> System.out.println("안녕하세요.")
	
	int addTen(int number) {
		return number+10;
	}
	
//	 매개변수1개, 리턴값있다. 
//	 구현부의 내용은 명령문이 한줄 있다.
//	 1. 이름을 없애고 ()뒤에 -> 추가한다.
//	int (int number) -> {return number+10;}
//	 2. 반환타입은 추론가능하므로 생략한다
//	(int number) -> {return number+10;}
//	 3. 매개변수 타입은 추론이 가능하므로 생략이 가능하다(선택사항)
//	(number) -> {return number+10;}
//	 4. 매개변수가 1개라면 소괄호 생략이 가능하다.(선택사항)
//	 단, 자료형을 생략하지 않았다면 소괄호 생략 불가능
//	number -> {return number+10;}
//	 5. 명령문이 1줄이면 중괄호와 세미콜론 생략이 가능하다. (선택사항)
//	 단, 중괄호와 세미콜론을 생략하면 return 구문도 생략해야한다.
//	 바디의 결과가 값이라면 자동으로 return된다.
//	 단, 바디의 명령문이 1개여야만 한다.
	
	
	
	
	
	
	
	
}
