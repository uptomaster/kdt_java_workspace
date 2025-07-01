package accessModifier04;
// 3번 : final
public class Car {
	
	// fianl : 최종을 의미하는 키워드
	// final 변수 => 상수 : 값 변경 불가 => 최종적인 값을 의미함.
	// final 클래스 : 최종적인 클래스를 의미함. => 더 이상 상속이 불가함. => 자식 클래스를 만들 수 없다.
	// final 메소드 : 최종적인 메소드를 의미함. => 오버라이딩 불가.
	
	// 필드
	private int speed;

	// private이 붙은 필드 => getter, setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 메소드
	void speedUp() {
		this.speed += 10;
		System.out.println("현재 시속 : " + this.speed);
	}
	
	// final 메소드 : 오버라이딩 불가한 메소드
	final void stop() {
		System.out.println("브레이크를 밟아 차를 멈춥니다!");
		this.speed = 0;
	}
	
	
}
