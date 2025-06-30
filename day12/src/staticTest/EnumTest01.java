package staticTest;

// 2번 : enum
public class EnumTest01 {
	// enum
	enum Day {// 열거형 상수
		MONDAY(false), TUESDAY(false), WENDSDAY(false), THURSDAY(false), 
		FRIDAY(false), SATURDAY(true), SUNDAY(true);
		// 필드
		boolean week;
		// 생성자
		private Day(boolean week) {
			this.week = week;
		}
		// 메소드
		boolean weekend() {
		return this.week;
			}
		}
	
	public static void main(String[] args) {
		Day today = Day.THURSDAY;

		System.out.println("오늘은 " + today + "입니다.");

		String result;
		
		// switch문을 활용해서 열거형 상수 처리
		switch (today) {
		case MONDAY:
			result = "월요일";
			break;
		case THURSDAY:
			result = "목요일";
			break;
		case WENDSDAY:
			result = "수요일";
			break;
		case FRIDAY:
			result = "금요일";
			break;
		default:
			result = "다른 요일입니다.";
			break;

		}
		
		Day today2 = Day.FRIDAY;
		
		//조건문 오늘이
		if(today2.weekend()) {
			System.out.println("오늘은 " + result + ", 주말입니다.");
		}
		else {
			System.out.println("오늘은 " + result + ", 평일입니다.");
		}

		if(today2 == Day.FRIDAY) {
			System.out.println("오늘은 금요일입니다.");
		}
		else {
			System.out.println("다른 요일입니다.");
		}
		
		// 모든 열거형의 값을 배열로 가져오는 메소드.
		Day[] days = Day.values();
		System.out.println(days);
		
		for(Day day : days) { // for - each 문
			System.out.println(day);
		}
		
		
	} // main 종료

}
