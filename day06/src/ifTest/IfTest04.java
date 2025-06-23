package ifTest;
// 13번 : if if 문 , if else if문, if문 중첩
public class IfTest04 {

	public static void main(String[] args) {
		// if if문 : 위의 조건식이 true라도 아래 if문의 조건식을 확인
		
		int num = 10;
		if(num > 5) {
			System.out.println(num + "은 5보다 큽니다.");
		}
		if(num > 3) {
			System.out.println(num + "은 3보다 큽니다.");
		}
		
		
		// if else if문 : 위의 조건식의 true면 아래 조건식은 무시한다.
		if(num > 5)
		{
			System.out.println(num + "은 5보다 큽니다."); // 이 식이 맞으면
		}
		else if(num > 3) {
			System.out.println(num + "은 3보다 큽니다."); // 아래 식은 무시한다.
		}
		
		// if문 중첩
		//90점 이상은 A, 100점은 "만점으로 A" 로 출력
		
		int grade = 100;
		
		if(grade >= 90) {
			if(grade == 100) {
				System.out.println("만점으로 A");
			}
			else {
				System.out.println("A");
			}
		}
		
		
	} // main 종료

} // 클래스 종료
