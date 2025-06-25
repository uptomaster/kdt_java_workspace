package constructorThis01;

//3-2번 : 생성자 this
public class ClassTest {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		a.method(10);
		a.num = 100;
		System.out.println(a.num);
	}
}
