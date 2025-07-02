package abstractTest02;

public class AnimalMain {
	public static void main(String[] args) {

		// 인스턴스화
		// Animal animal = new Animal(); 
		// 추상클래스(미완성된 클래스)는 직접 인스턴스화할 수 없다.
		
		Animal dog = new Dog(); // 업캐스팅(자식->부모)
		// 상속받은 자식 클래스에서 메소드 오버라이딩이 되면,
		// 부모타입(추상클래스)의 변수에 자식의 참조값을 넣어서 객체화 가능하다.
		dog.crying();
		
		Animal cat = new Cat(); // 업캐스팅(자식->부모)
		cat.crying(); // 오버라이딩 된 메소드가 실행된다.
		
	
	
	}
}
