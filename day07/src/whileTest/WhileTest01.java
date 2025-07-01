package whileTest;

// 8번 : while문 기초
public class WhileTest01 {

	public static void main(String[] args) {

//		while(true) {
//			System.out.println(1);	
//			break;
//		}

		// 그럼 어떻게 while문을 사용해야하는가?
		// while(조건식)에 해당하는 조건식을 false가 나오는 지점을 만드는 작업 필요.
		// 그 작업은 조건식 이전에 변수를 선언하고, 조건문 내에서 그 변수를 사용한다.
		// 그 변수를 이용해 while문 안에서 반복작업 중, 증감 연산 같은 조작을 한다.

		int cnt = 0;
		while (cnt < 10) {
			cnt++; // cnt += 1;
			System.out.println(cnt);
		}

	} // main 종료

}
