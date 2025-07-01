package casting03;
// 6번 : 캐스팅의 특징
public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	void crying() {
		System.out.println("grrrrrr!");
	}

	void walk() {
		System.out.println("산책가자~~");
	}
	
}
