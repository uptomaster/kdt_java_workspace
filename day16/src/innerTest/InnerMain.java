package innerTest;

import innerTest.Outer.Inner; // import 했음에도 오류 발생

//26번 : 내부클래스와 외부클래스의 객체화
public class InnerMain {
	public static void main(String[] args) {
		// 외부클래스의 객체 생성
		Outer outer = new Outer();
	
		System.out.println("외부 클래스의 참조값 : " + outer);
		System.out.println("외부 클래스의 데이터값 : " + outer.var1);
		// System.out.println("외부 클래스의 데이터값 : " + o.var2); // 외부 클래스의 객체로는 내부 클래스의 멤버에 접근X
		
		// 내부 클래스의 객체를 생성해보자
		// Inner i = new Inner(); // 내부 클래스는 스스로 객체를 생성할 수 없다.
		Outer.Inner inner = new Outer().new Inner(); // 내부 클래스는 외부 클래스의 인스턴스를 통해 생성해야한다!!!!!!!!!!!!!!
		System.out.println("내부 클래스의 참조값 : " + inner); // innerTest.Outer$Inner@31befd9f => '$' : 내부 클래스
		// System.out.println("내부 클래스의 데이터값 : " + inner.var1); // 내부 클래스의 객체로 외부 클래스의 
		System.out.println("내부 클래스의 데이터값 : " + inner.var2);
	}
}
