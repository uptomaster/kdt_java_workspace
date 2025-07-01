package accessModifier01;

// 7번 : 접근 제한자
public class Parents {

	// 필드
	// 접근제한자 타입 변수
	public String publicVar = "public";
	protected String protectedVar = "protected";
	String defaultVar = "default";
	private String privateVar = "private";

	// 메소드
	// 접근제한자 리턴타입 메소드명(자료형 매개변수)
	public void printAccess() {
		System.out.println("=========같은 클래스 내에서 필드 출력=========");
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(privateVar);

	}
	// 메인 메소드
	public static void main(String[] args) {
		Parents p = new Parents();
		p.printAccess();
	}
	
}

//class SamePackage{
//	public void printAccess() {
//		Parents p = new Parents();
//		System.out.println(p.defaultVar);
//		System.out.println(p.protectedVar);
//		System.out.println(p.defaultVar);
////		System.out.println(p.privateVar); // 같은 패키지, 다른 클래스에선 private 접근 제한자의 필드 접근 불가.
//	}
}