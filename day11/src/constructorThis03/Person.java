package constructorThis03;

// 6번 : this() 자기자신의 생성자 호출
public class Person {

	// 필드
	String name;
	int age;
	String job;

	public Person(String name, int age, String job) {
		
		this(name,job);
		this.age = age;
	}
	// 이름과 직업을 매개변수로 받는 생성자
	public Person(String name, String job) {
		this(name);
		this.job = job;
	}
	// 이름과 나이를 매개변수로 받는 생성자
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

	//이름을 매개변수로 받는 생성자
	public Person(String name) {
		this.name = name;
	}
	
	//기본생성자
	public Person() {
		
	}
	
	// 메소드
	void printInfo() {
		System.out.printf("이름은 %s입니다.\t", this.name);
		System.out.printf("나이는 %d입니다.\t", this.age);
		System.out.printf("직업은 %s입니다.\t", this.job);
		greet(); // this.greet()와 동일한 의미.
	}

	// 인사 : 000님 안녕하세요 출력하는 메소드
	void greet() {
		System.out.println(this.name + "님, 안녕하세요!");
	}

}
