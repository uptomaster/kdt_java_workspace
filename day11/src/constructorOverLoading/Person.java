package constructorOverLoading;

public class Person {

	// 필드
	String name;
	int age;
	String job;

	// 1. 기본생성자
	public Person() {
		this.name = "이름없음";
		this.age = 0;
		System.out.println("기본 생성자가 호출되었습니다.");
		System.out.println("생성자 : " + this);
	}

	// 2. 이름만 매개변수로 받는 생성자
	public Person(String name) { // 나이가 동일하고, 직업이 동일할때
		this.name = name;
		this.age = 10;
		System.out.println("이름은 인수로 받고, 나이는 10살을 기본값으로 한 생성자가 호출되었습니다.");
	}

	// 3. 이름과 나이를 매개변수로 받는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.job = "Not Yet";
		System.out.println("이름과 나이를 초기화한 생성자가 호출되었습니다.");
	}

	// 4. 이름과 직업을 매개변수로 받는 생성자
	public Person(String name, String job) {
		this(name);
		this.job = job;
	}

	// 5. 나이와 직업을 매개변수로 받는 생성자
	public Person(int age, String job) {
		this.age = age;
		this.job = job;
	}
	// 6. 이름, 나이, 직업을 매개변수로 받는 생성자

	public Person(String name, int age, String job) {
		this(name, job);
		this.job = job;

	}

}
