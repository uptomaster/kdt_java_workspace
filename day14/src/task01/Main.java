package task01;

public class Main {
	public static void main(String[] args) {
		
		// 슈퍼 클래스 : Person
			// 필드 : 이름, 나이
			// 생성자 : 기본생성자(안에서 이름없음, 0 대입하기.)
//					: 매개변수 2개있는 생성자
			// 생성자 안에서 Person 생성자 호출 출력하기
			// 메소드 : introduce 메소드 : 이름, 나이 출력하는 메소드
//					: sleep 메소드 : 이름은 몇시에 잠을 잡니다 출력하는 메소드			
		
		// 서브 클래스 : Student
			// 필드 : 학번, 전공
			// 생성자 : 기본생성자(이름없음, 0, 값없음, 전공없음) 전달
			// 매개변수가 4개있는 생성자 
			// 생성자 안에서 Student 생성자 호출 출력하기.
			// 부모클래스의 introduce 메소드 오버라이딩
				// 부모 메소드 호출
				// 학번과 전공도 출력하는 메소드

		// 반드시 오버라이딩 사용하며 생성자 호출, this, super 호출하는 코드 작성할 것.
	
		Person p1 = new Person();
		p1.introduce();
		p1.sleep(5);
		
		Student st1 = new Student();
		st1.introduce();
		st1.sleep(7);
	}
}
