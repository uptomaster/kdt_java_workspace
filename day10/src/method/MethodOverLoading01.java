package method;
// 6번 : 메소드 오버로딩1
public class MethodOverLoading01 {

	public static void main(String[] args) {
		MethodOverLoading01 m = new MethodOverLoading01();
		
		m.add(5, 7);
		m.add(5.0, 7.0);
		
	}
	// 메소드 오버로딩
	void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
}
