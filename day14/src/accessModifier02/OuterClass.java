package accessModifier02;

import accessModifier01.Parents;
// 다른 패키지의 다른 클래스에서 필드 접근 => public만 접근 가능.
public class OuterClass {
	public void printAccess() {
		Parents p = new Parents();
		System.out.println(p.publicVar);
	}
}
