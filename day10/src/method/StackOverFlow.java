package method;
// 5번 : 스택오버플로우 발생
public class StackOverFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		recursiveMethod(); // 재귀함수
	}
	static void recursiveMethod() {
		
		recursiveMethod(); 
		// Exception in thread "main" java.lang.StackOverflowError
		// at method.StackOverFlow.recursiveMethod(StackOverFlow.java:12)
		// 재귀호출이나 반복적인 메소드 호출로 인해서, 스택프레임이 쌓여서 스택영역에 크기 제한이 있는데
		// 그것을 초과하게 되면 발생하는 에러이다.(스택오버플로우)
		// JVM에 할당한 스택 영역의 최대 크기를 초과하므로, 더 이상 메소드 호출 정보를 쌓을 공간이 부족해진다.
		// 그래서 스택오버플로우가 발생한다.
	}
}
