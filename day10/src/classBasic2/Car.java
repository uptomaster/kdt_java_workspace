package classBasic2;

// 13번 : 클래스의 특징3(객체 생성의 틀)
public class Car {

	// 색상, 엔진, 모델명, 속도

	// 필드(모델명, 색상, 속도)
	String model = ""; // 모델명
	String color = ""; // 색상
	int speed = 0; // 속도

	// 메소드

	// 속도를 증가시키는 메소드(매개변수O, 리턴값X => 객체명.메소드명(매개변수))
	void speedUp(int value) {
		speed += value;
		System.out.printf("현재 속도는 %d입니다.\n", speed);
	}

	// 속도를 멈추는 메소드(매개변수X, 리턴값X => 객체명.메소드명())
	void stop() {
		speed = 0;
		System.out.printf("현재 속도는 %d입니다.", speed);
	}

	// 속도를 감소시키는 메소드
	// 매개변수X, 리턴값 X
	// 한번 호출시 속도는 10씩만 감소되는 기능 구현
	void speedDown() {
		if(speed >= 0) { // 속도가 0보다 작아지는 경우는 제외한다.
			speed -= 10;
			System.out.println("속도가 10만큼 감속되었습니다.");
		}
		
		else if(speed < 0){
			System.out.println("주행을 멈췄습니다.");
		}
	}
	
}
