package method;
// 7번 : 메소드 오버로딩2
public class MethodOverLoading02 {

	public static void main(String[] args) {
		MethodOverLoading02 m = new MethodOverLoading02();
		System.out.println(m.add(10, 20));
		System.out.println(m.add(10, 20, 30));
		m.add(10.0, 20);
		m.add(10, 20.0);
	}

	// 
	int add(int num1, int num2) {
		return num1 + num2;
	}
	// 매개변수의 개수가 다른 add메소드
	int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	// 매개변수의 타입이 다른 add메소드
	void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	// 매개변수의 순서가 다른 add메소드
	void add(int num2, double num1) {
		System.out.println(num1 + num2);
	}
	
}
