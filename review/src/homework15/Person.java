package homework15;

public class Person {

	// 필드
	private String name;
	private int age;
	private String birth;
	
	// 생성자
	public Person(String name) {
		super();
		this.name = name;
	}
	
	// 메소드
	void introduce() {
		System.out.println("이름 : " + getName() + ", 나이 : " + getAge());
	}
	//getter, setter 메소드

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}
	
	
}
