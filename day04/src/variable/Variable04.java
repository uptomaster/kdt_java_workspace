package variable;
// 5번 : 변수와 상수의 차이
public class Variable04 {
	public static void main(String[] args) {
			
		// student라는 변수에 20이라는 값을 저장한다.
		// MAX_STUDENT라는 상수에 25라는 값을 저장한다. 
		int student = 20;
		final int MAX_STUDENT = 25;
		
		// 출력
		System.out.println(student);
		System.out.println(MAX_STUDENT);
		
		// 이미 만들어진 변수에 저장된 값을 변경하기.
		student = 25;
		System.out.println(student);
		
		// 이미 만들어진 상수는 변경 불가능.
		}
}
