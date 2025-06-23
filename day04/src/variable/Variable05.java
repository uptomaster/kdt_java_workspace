package variable;
// 06 : 변수를 사용하는 이유
public class Variable05 {
	public static void main(String[] args) {
		/*
		 * 1) 반복되는 값을 쉽게 관리하기 위함이다.(값을 재사용) 같은 값을 여러곳에서 사용하거나 변경해야할 때, 
		 * 변수에 저장하게 되면 코드
		 * 수정이 간단해진다. 
		 * 변수 값을 변경하면 해당 변수를 참조하는 모든 코드에 변경사항이 자동으로 적용된다.
		 */
		int price = 100, quantity = 5;
		System.out.println("가격 : " + price); // 문자열과 숫자를 연결하려면 java에서는 +를 사용해서 연결한다.
		System.out.println("수량 : " + quantity);
		System.out.println("총 가격 : "+ (price * quantity));
		/*
		 * 만약 가격이 오르는 상황이 발생하면,
		 * 매번 가격을 수정하는 번거로움을 줄이기 위해
		 * 변수를 작성하고 한번만 변경해주면
		 * 그 이후 모든 곳에 적용이 된다. (프로그램은 위에서 아래로 흐름)
		 * */
		price = 200;
		System.out.println("가격 : " + price); // 문자열과 숫자를 연결하려면 java에서는 +를 사용해서 연결한다.
		System.out.println("수량 : " + quantity);
		System.out.println("총 가격 : "+ (price * quantity));
		/*
		 * 2) 값에 의미를 부여하기 위함이다.
		 * 변수에 이름을 붙이면 코드의 의미를 정확히 알 수 있다.
		 * 문자열이나 숫자를 직접 사용하는 것보다, 변수명을 통해 코드의 목적을 쉽게 이해할 수 있다.		 * 
		 * */
		int userAge = 20;
		final double PI = 3.141592;
		boolean isStudent = false;
		
		System.out.println("사용자 나이 : " + userAge);
		System.out.println("원주율 값 : " + PI);
		System.out.println("고등학생입니까? : " + isStudent);
		// 문자열 + 변수명(값) => 연결되어 출력된다.
		
		/*
		 * 3) 프로그램의 가독성, 유지보수성, 재사용을 높이기 위해서 사용한다.
		 * 코드에서 직접 값을 사용하는 매직넘버를 피하고 변수를 사용하면 수정과 유지보수가 용이하다.
		 * */
		int number = 10; // JVM이 관리하는 RAM에 number라는 변수의 메모리 공간이 4바이트와 그 메모리 주소가 할당되고, 그 안에 10이라는 값을 저장한다.
		System.out.println(number); // 컴퓨터는 number에 할당된 공간의 메모리 주소값을 보고 데이터를 불러오게된다. 
	}
}
