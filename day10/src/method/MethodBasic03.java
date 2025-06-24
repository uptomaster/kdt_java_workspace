package method;
// 3번 : 메소드를 사용하는 이유3(유지/보수에 유리함.)
public class MethodBasic03 {

	public static void main(String[] args) {
		
		MethodBasic03 mb = new MethodBasic03();
		//코드의 구조를 모듈화 시킴으로써, 수정과 확장이 쉬워진다.
		//하나의 메소드만 변경하면 해당 메소드를 호출하는 모든 코드에 자동으로 반영되므로
		//수정범위를 최소화시킬 수 있다. (자동차 부품 이론)
		
		System.out.println("메소드 이용 25의 제곱 : " + mb.calSquare(25));
		System.out.println("메소드 이용 3의 제곱 : " + mb.calSquare(3));
		// 그런데 이렇게 사용하다가, 제곱이 아닌 세제곱을 구해야한다고 가정하자.
		// 그럼 메소드만 수정해주면 세제곱으로 바뀌어, 유지보수가 쉬워진다.
		System.out.println("메소드 이용 3의 세제곱 : " + mb.calSquare(10));
	}

	// 거듭제곱을 구하는 메소드 -> 세제곱을 구하는 메소드
	int calSquare(int num) {
		return num*num*num;
	}
}
