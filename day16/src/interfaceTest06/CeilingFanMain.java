package interfaceTest06;

// 23번 : 어댑터클래스(메인클래스)
public class CeilingFanMain {
	public static void main(String[] args) {
		
		
		Fan fan1 = new CeilingFan();
		Fan fan2 = new TableFan();
		Fan fan3 = new TowerFan();

		System.out.println("==============================");
		method(fan1);
		System.out.println("==============================");
		fan2.on();
		fan2.off();
		fan2.turbo();
		System.out.println("==============================");
		fan3.on();
		fan3.off();
		fan3.turbo();
		System.out.println("==============================");

	}
	
	static void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
	}
	
}
