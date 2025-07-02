package abstractTest02;

public class Dog extends Animal{

	// 강제성이 생긴다.
	@Override
	void crying() {
		System.out.println("Grrr!!!");
	}

	
}
