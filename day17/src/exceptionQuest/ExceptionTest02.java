package exceptionQuest;

// 11번 : Exception Basic
public class ExceptionTest02 {
	public static void main(String[] args) {

		ExceptionTest02 et = new ExceptionTest02();// 객체 생성
		System.out.println(et);
		try {
		et.printLength("java");
//		et.printLength(15.5); // 빨간 밑줄 => 컴파일 에러 
//		java.lang.Error // 에러는 예외가 아니다.
		
			et.printLength(null); // 미확인 예외(실행할 때 에러) java.lang.NullPointerException
		} catch (NullPointerException e) {
			System.out.println("null은 입력할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("null은 입력할 수 없습니다.");
		} finally{
			System.out.println("프로그램 실행 종료");
		}
	}

	public void printLength(String data) { // 인스턴스 메소드 -> 객체 필요
		int result = data.length();
		System.out.println("문자열의 길이 : " + result);
	}
}
