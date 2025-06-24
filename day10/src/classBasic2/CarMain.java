package classBasic2;
// 13번 : Car 클래스 main (객체 생성의 틀)
public class CarMain {

	public static void main(String[] args) {
		
		//객체 생성
		Car c1 = new Car(); // 생성자
		
		c1.model = "Hyundai";
		c1.color = "Black";
		c1.speed = 0;
		
		System.out.printf("모델명 : %s\n색상 : %s\n현재 속도 : %d\n", c1.model, c1.color, c1.speed);
		c1.speedUp(120);
		c1.speedUp(180);
		
		c1.stop();
		c1.speedDown();
	}

}
