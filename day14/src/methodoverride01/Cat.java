package methodoverride01;
// 6번 : 오버라이딩
public class Cat extends Animal{

	@Override
	void sound() {
		// 부모의 sound()메소드도 호출
		super.sound();
		System.out.println("야옹~");
	}
	
}
