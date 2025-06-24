package method;
// 8번 : call by value(값에 의한 호출)
public class CallByValue {

	public static void main(String[] args) {
		int num = 10;
		System.out.println("main 메소드에서의 num : " + num);
		modifyNum(num);
		System.out.println("main 메소드에서의 num : " + num);
	
	}

	static void modifyNum(int num) {
		System.out.println("modifyNum 메소드에서의 num의 값 : " + num);
		num = 20;
		System.out.println("modifyNum 메소드에서의 num의 값 : " + num);
		
	}
	// 값 자체가 복사되기 때문에, 메소드 내부에서 변경한 값이 원본에 영향을 끼치지 않는다.
}
