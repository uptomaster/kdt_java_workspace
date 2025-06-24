package method;
// 4번 : stack 메모리
public class StackMethod {

	public static void main(String[] args) {
		
		StackMethod sm = new StackMethod(); 
		// 1. main 메소드는 시작점이다.
		// 메인 메소드가 시작되면, 스택에 main의 stack frame이 생성된다.
		int result = sm.add(10,20);
		System.out.println(result);
//		System.out.println(num1);
		
		// 참조변수 sm에 main stack frame이 생성된다,
		// 지역변수 result가 main stack frame에 저장된다.
		
		// 2. add 메소드 호출되면, 스택에 add라는 새로운 stack frame이 생성된다.
		// 매개변수 num1, num2변수가 add stack frame에 저장되고,
		// 이 안에서 매개변수의 num1+num2 값을 가진 상태에서 메소드가 종료가 된다. 
		
		// 3. 메소드가 종료되면, add 스택프레임이 삭제된다.
		// num1, num2 지역변수가 add stack frmae에서 제거된다.
		
		// 4. main stack frame에 result변수에 num1+num2의 결과값이 저장된 상태가 된다.
		// 출력까지 이루어지고 나면, main메소드가 종료가 된다.
		
		// 5. main 메소드가 종료되면 main stack frame이 종료된다.
		
	}
	// 두 수의 합을 구하는 메소드
	int add(int num1, int num2) {
		System.out.printf("num1의 값 : %d, num2의 값 : %d\n", num1, num2);
		return num1 + num2;
	}
	
	
}
