package casting03;

// 6번 : 캐스팅의 특징
public class CastingTest {
	public static void main(String[] args) {
		Animal animal = new Animal("동물", 2);
		System.out.println(animal);
		animal.crying();

		Animal animal2 = new Dog("바둑이", 3); // 업캐스팅
		System.out.println(animal2); // casting03.Dog@54bedef2
		animal2.crying(); // 업캐스팅을 해도, Dog 클래스에서 오버라이딩 된 메소드가 호출

		// 1. 같은 메소드가 부모클래스에도 있고, 자식 클래스에도 있는 경우(오버라이딩)
		// 업캐스팅을 해도 오버라이딩 된 메소드가 실행되는것이 업캐스팅의 첫번째 특징.

		// 2. 메소드가 부모에는 없고 자식에서만 추가된 경우(부모에 존재하지 않는 멤버에 접근)
		// 업캐스팅 직후의 animal2는 자식의 참조값을 갖고 있다. animal2.walk(); 를 바로 사용할 경우
		// 사용할 수 없다. 반드시 다운캐스팅을 진행해야 사용할 수 있다.
		((Dog) animal2).walk();

		// 객체 생성
		Dog dog = new Dog("별이", 4);
		Cat cat = new Cat("달이", 3);

		CastingTest.printTest(dog);
		CastingTest.printTest(cat);

		CastingTest.tryWalk(dog);
	}

	// 1. 메소드의 매개변수로 여러 타입의 값을 받는 경우
	// 일반적으로는 각각의 타입을 처리하는 메소드를 별도로 만들어야한다.
	// 매개변수에 업캐스팅을 하게 되면 1개의 타입으로 자식 클래스의 값들을 담아 줄 수 있다.
//	void printTest(Dog dog) {
//		dog.walk();
//		dog.crying();
//	}
//
//	void printTest(Cat cat) {
//		cat.crying();
//	}
//	
//	void printTest(Animal animal) {
//		animal.crying();
//	}

	// 2. 같은 부모 클래스가 존재하는가? => 존재한다면, 매개변수를 부모 타입으로 받는다(업캐스팅)
	// 하나의 메소드에서 매개변수를 부모타입으로 만들면, 여러 자식 타입을 받아서 사용이 가능하다(참조변수의 다형성)
	static void printTest(Animal ani) {
		System.out.println(ani.name + "이/가 운다.");
		ani.crying(); // 업캐스팅 된 객체가 인수가 들어와도 오버라이딩 된 메소드가 호출된다.(각 타입에 맞는 메소드가 호출될 것이다.)
	}

	// 3. 부모클래스에 존재하지 않는(자식클래스에서 만든) 멤버에 접근하기 위해서는
	// Down Casting을 해야한다. => instanceof 키워드를 사용한다.
	// true => 해당 메소드 호출.
	static void tryWalk(Animal ani) {
		// 매개변수로 받아온 객체의 주소값이 Cat 타입인지 Dog 타입인지 instanceof 키워드로 확인
		if (ani instanceof Dog) {
			// Dog 타입이 맞다면 Dog타입으로 다운캐스팅
			((Dog) ani).walk();
		} else {
			System.out.println("산책 안가!");
		}
	}
}
