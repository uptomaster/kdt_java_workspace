package staticTest;

// 1번 : 정적 블록
public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("메인 메소드 실행");
	}

	static { // 정적 블록 : 클래스가 로드될 때 먼저 실행(즉, main 메소드보다 먼저 출력)
		System.out.println("클래스가 로드될 때 이 블록이 실행됩니다."); // 1번으로 출력됨. 클래스가 로드될 때 정적 블록이 실행되기 때문이다.
	}
	
}


