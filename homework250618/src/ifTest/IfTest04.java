package ifTest;
// 13번 : if if 문 , if else if문, if문 중첩
public class IfTest04 {

	public static void main(String[] args) {
		// if if문 : 위의 조건식이 true라도 아래 if문의 조건식을 확인
		
		int num = 10;
		if(num > 5) { // num은 10으로 이 조건은 참이므로 아래 문장이 수행된다.
			System.out.println(num + "은 5보다 큽니다."); // 해당 영역 수행
		}
		if(num > 3) { // 이 문장도 마찬가지로 참이므로 수행된다. 중첩하지 않았기 때문에 두 조건식은 연관이 없다.
			System.out.println(num + "은 3보다 큽니다."); // 해당 영역 수행
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
		
		int grade = 100; // 성적을 입력한 변수
		
		if(grade >= 90) { // 점수가 90점 이상이므로 일단 이 영역 진입
			if(grade == 100) { // 100점에 해당하므로 이영역으로 진입
				System.out.println("만점으로 A"); // 해당영역을 수행
			} // 중첩 if문이 종료된다
			else {
				System.out.println("A"); // 이 문장은 수행되지 않는다.
			}
		}
		
		
	} // main 종료

} // 클래스 종료
