package wrapperTest;
// 6번 : Wrapper 클래스
public class WrapperTest02 {
	public static void main(String[] args) {

		int num = 10;
		printObj(num); // Object obj = num; => 자동 박싱
		Object obj2 = 10;
		System.out.println(obj2); // 자동 박싱
		System.out.println(obj2.toString());
	
	}
	
	static void printObj(Object obj) {
		System.out.println(obj);
	}
}
