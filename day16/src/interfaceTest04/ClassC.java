package interfaceTest04;
// 19번 : 두개의 인터페이스에 같은 메소드가 선언된 경우 모호성 해결
public class ClassC implements Inter1, Inter2, Inter3{

	@Override
	public void printText() {
		// 어차피 부모에 정의된 default 메소드를 사용할 것이기 때문에, 
		// 어떤 부모의 메소드를 사용할지만 정해서 쓰면 됨.
		Inter1.super.printText();
		Inter2.super.printText();
		Inter3.super.printText();
	}

	public static void main(String[] args) {
		ClassC c = new ClassC();
		System.out.println(c);
	
		c.printText(); // Inter1의 printText() 호출
		
		System.out.println("=========================================");
		ClassB b = new ClassB();
		b.printText(); // 부모클래스가 부모인터페이스보다 우선순위가 더 높다.
	}
}
