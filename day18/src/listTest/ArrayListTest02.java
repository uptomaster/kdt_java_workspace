package listTest;

class MyClassType<T> {
	// 필드
	T data;
	// 생성자

	public MyClassType(T data) {
		super();
		this.data = data;
	}

	// 메소드
	void printData() {
		System.out.println(data);
	}
}

public class ArrayListTest02 {
	public static void main(String[] args) {
		MyClassType<String> mc2 = new MyClassType<String>("java"); 
		// 클래스 선언할때 제네릭을 쓰면 객체 생성할 때 타입을 지정할 수 있음
		System.out.println(mc2);
		mc2.printData();
	}
}
