package accessModifier04;
// 3번 : final
public class CarMain {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setSpeed(100);
		System.out.println(c.getSpeed());
		c.speedUp();
		
		SuperCar superCar = new SuperCar();
		superCar.setSpeed(300); 
		superCar.speedUp(); // 자식클래스의 객체는 오버라이딩된 메소드 호출.
		superCar.speedUp();
		superCar.speedUp();
		superCar.stop(); // final로 처리된 부모클래스의 final 메소드 호출
		System.out.println("슈퍼카의 현재 시속 : " + superCar.getSpeed());
	}
}
