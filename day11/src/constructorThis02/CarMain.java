package constructorThis02;

// 4번 : this
public class CarMain {
	public static void main(String[] args) {

		// 객체 1 생성
		Car car1 = new Car("Hyundai");
		System.out.println(car1);
		car1.printInfo();
		
		// 객체 2 생성
		Car car2 = new Car("Perrari");
		System.out.println(car2);
		car2.printInfo();
	}
}


class Car{
	
	
	// 필드
	String brand;
	int speed;
	
	// 매개변수 1개 생성자
	public Car(String brand) {
		this.brand = brand;
		System.out.println("생성자 호출 : " + this);
	}
	
	// 매개변수의 타입이 다르다 => 생성자 오버로딩
		public Car(int speed) {
			this.speed = speed;
		}

	
		public Car(String brand, int speed) {
			this.brand = brand;
			this.speed = speed;
		}
		
		
	
	public Car(int speed,String brand) {
			this.brand = brand;
			this.speed = speed;
		}

	// 메소드
	void printInfo() {
		System.out.println("=====================");
		System.out.println("모델 : " + this.brand);
		System.out.println("속도 : " + this.speed);
		System.out.println("=====================");
		
		
	}

	
	
	
}
