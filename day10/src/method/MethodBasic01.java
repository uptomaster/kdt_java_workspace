package method;
// 1번 : 메소드사용이유1(중복된 코드의 제거)
public class MethodBasic01 {

	// 총합을 구하기 위해 클래스 내부, main 외부에서 메소드 작성
	void printSum(int num1, int num2) {
		System.out.println("num1의 값 : " + num1 + "\tnum2의 값 : " + num2);
		System.out.println("총 합 : "+ (num1+num2));
	}
	
	public static void main(String[] args) {
		// 동일한 작업을 수행하는 코드를 여러 번 작성하는 대신에 
		// 메소드로 정의하게 되면, 코드의 가독성과 효율성이 향상된다.
		// 동일한 로직을 여러번 작성해보자
		
		System.out.println("총 합 : " + (5 + 10));
		System.out.println("총 합 : " + (35 + 20));
		System.out.println("총 합 : " + (15 + 30)); // 같은 작업이지만 값만 다르다. 이런 경우 메소드를 작성한다.
	
		// 클래스 객체를 생성해서 메소드에 접근한다.
		MethodBasic01 mb = new MethodBasic01();
		mb.printSum(10, 40);
	}

}
