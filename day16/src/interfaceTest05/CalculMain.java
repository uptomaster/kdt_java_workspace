package interfaceTest05;
// 22번 : 메인 메소드(인터페이스 내에서 static, private, default 메소드만 있어도 객체화는 인터페이스 자체만으로는 불가능함.)
public class CalculMain {
	public static void main(String[] args) {

		Calculator c = new CalculImpl();
		System.out.println(c);
		System.out.println(c.add(10, 20));
		System.out.println(c.add(10, -20));
	
		Calculator.info();
	}
}
