package variableTest;

// 5번 : 가변길이 매개변수
public class VariableTest02 {

	public static void main(String[] args) {
		VariableTest02 vt = new VariableTest02();
		vt.printNumbers("가변길이매개변수", 1,2);
		vt.printNumbers("가변길이매개변수", 1,2,3,4,5,6);
		for(int i = 0; i < 100; i++) {
			vt.printNumbers(null, i);
		}
	}
	
	void printNumbers(String name, int ...numbers) {
		System.out.println(numbers);
		int sum = 0;
		for(int num : numbers) {
			System.out.println(num + " ");
			sum += num;
		}
		System.out.println("합 : " + sum);
		System.out.println(name);
	}
	
}
