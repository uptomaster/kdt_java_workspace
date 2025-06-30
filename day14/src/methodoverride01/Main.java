package methodoverride01;

public class Main {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.name = "동물";
		ani.sound();
		
		Dog dog = new Dog();
		dog.sound(); // 메소드 오버라이딩 : 자식 클래스에서 메소드 구현부의 내용만 변경했다. 
	
		Cat cat = new Cat();
		cat.name = "별";
		cat.sound();
	}
	
		
}
