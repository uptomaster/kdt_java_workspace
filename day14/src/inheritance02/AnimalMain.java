package inheritance02;

public class AnimalMain {
	public static void main(String[] args) {

		// Animal 클래스의 객체 생성 => Animal 클래스에 있는 필드와 메소드만 사용 가능
		Animal animal = new Animal();
		System.out.println(animal);
	
		animal.name = "사자";
		System.out.println(animal.name);
		animal.sleep(15, "초원");
		// Bird자식 클래스에서 생성한 메소드는 부모 클래스인 Animal 클래스에서 호출 불가.
	
		// Bird 클래스를 만들고 객체 생성
		Bird bird = new Bird();
		System.out.println(bird);
		bird.name = "suri";
		bird.age = 2;
		bird.type = "독수리";
		bird.fly();
		bird.eat("고기");
	
		// Dog 클래스 객체만들기
		Dog dog = new Dog();
		System.out.println(dog);
		dog.name = "구름";
		dog.age = 5;
		dog.type = "푸들";
		System.out.println(dog.name);
		dog.bark();
		dog.sleep(19, "집");
		
		// Cat 클래스 객체만들기
		Cat cat = new Cat();
		System.out.println(cat);
		cat.name = "별";
		cat.age = 6;
		cat.type = "페르시안";
		System.out.println(cat.name);
		cat.meow();
	
	}
}
