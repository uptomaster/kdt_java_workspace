package method;
// 9번 : Call by Reference
public class CallByReference {

	public static void main(String[] args) {
		// java의 기본 참조 타입 복사는 얕은 복사이다.
		
		// 참조값과 call by value
		int[] arr = {1,2,3};
		System.out.println("메소드 호출 전 : " + arr[0]); // 1
		System.out.println(arr);// [I@3af49f1c
		
//		System.out.println("메소드 호출 후 : " + arr[0]); // 10. 주소는 바뀌지 않았음.
//		modifyArray(arr);
//		
		System.out.println("array2 메소드 호출 전 : " + arr[0]);
		modifyArray2(arr); // [I@19469ea2
		System.out.println("메소드 호출 후 : " + arr[0]); 
		// 참조값이 복사되어 전달되므로 메소드 
	}

	static void modifyArray(int [] arr) {
		System.out.println(arr);
		arr[0] = 10; // 참조된 배열의 첫번째 값을 변경
	}
	 // 참조값이 복사되어 전달되므로 메소드 내부에서 새로운 객체를 참조하도록 변경하면
	   // 원본배열에는 영향을 끼치지 않는다
	static void modifyArray2(int [] arr) {
		arr = new int[] {10, 20, 30}; // 새로운 칸을 만든다.
		System.out.println(arr);
	}
}
