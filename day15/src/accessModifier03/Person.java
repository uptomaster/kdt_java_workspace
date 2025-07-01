package accessModifier03;
// 2번 : private 접근제한자
public class Person {

	// 필드
	private String name;
	private int age;
	
	// 필드에 private 접근제한자가 붙었다? => 캡슐화 => getter, setter 메소드가 꼭 필요하다. 그리고 그 메소드는 항상 public 접근제한자!
	// 단축키 : alt shift s r
	
	// 메소드(setter, getter)
	
	// setter 메소드 : name의 필드 값 설정
	public void setName(String name) {	
		this.name = name;
	}
	
	// getter 메소드 : name 필드의 값을 반환
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	void printInfo() { // default 접근제한자
		System.out.println(getName());
	}
	
}
