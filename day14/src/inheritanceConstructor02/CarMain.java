package inheritanceConstructor02;

public class CarMain {
	public static void main(String[] args) {
		// 부모클래스의 객체 2개 만들기 Car class
//		Car c1 = new Car(); 기본 생성자가 없어서 만들수 없음.
		Car c2 = new Car("기아", "black", 10000);
		
		System.out.println(c2);
//		c2.boosterOn(); => 부모 클래스 객체는 자식 클래스에서 정의된 메소드를 사용할 수 없다.
		c2.engineStart();
		
		// 자식클래스의 객체 만들기 SuperCar class
//		SuperCar sc1 = new SuperCar(); => 기본 생성자가 없어서 만들 수 없음.
		SuperCar sc2 = new SuperCar("BMW", "red", 150000, true);
		SuperCar benz = new SuperCar(170000, true);
		SuperCar kia = new SuperCar("kia", "black", 100000, false);
		
		benz.engineStart();
		benz.boosterOn();
		kia.engineStart();
		kia.engineStop();
		
		
	}
}
