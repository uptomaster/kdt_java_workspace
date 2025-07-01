package accessModifier02;

import accessModifier01.Parents;
// 다른 패키지 다른 클래스(상속관계) => public / protected 접근 가능
public class Child extends Parents{

	public void printAccess() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar); // 다른 패키지 
//		System.out.println(privateVar); // 
	}
	
}
