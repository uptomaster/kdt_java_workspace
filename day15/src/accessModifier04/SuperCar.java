package accessModifier04;

public class SuperCar extends Car{
	
	// 오버라이딩 : alt shift s v
	@Override
	void speedUp() {
		super.setSpeed(getSpeed() + 20); // private 필드의 접근은 항상 getter와 setter 메소드를 통해 처리한다.
		System.out.println("[슈퍼카가 가속합니다!]\n현재 시속 : " + getSpeed());
	}


	
}
