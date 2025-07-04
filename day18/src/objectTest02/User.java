package objectTest02;

// 4번 : Object 클래스 -> equals() 메소드
public class User {

	// 필드
	String name;
	int age;

	// 생성자
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 메소드
//	@Override
//	public String toString() { // 단축키 : alt + shift + s + s
//		return "User [name=" + name + ", age=" + age + "]";
//	}

	@Override
	public boolean equals(Object obj) {
		// 자기자신과 같은 경우
		if (this == obj)
			return true;
//		// 이름과 같은 경우 -> 같은 객체로 판단
//		if (obj instanceof User) {
//			String other1 = ((User) obj).name;
//			if (this.name.length() == other1.length()) {
//				for (int i = 0; i < this.name.length(); i++) {
//					if (this.name.charAt(i) == other1.charAt(i)) {
//						return true;
//					}
//					return false;
//				}
//			}
//		}
		// 이름이 같은 경우(짧은 코드 가능)
		if(obj instanceof User) {
			String other = ((User)obj).name;
			return this.name.equals(other);
		}
		return false;

	}

	// equals()를 재정의했다면, 반드시 hashcode()도 재정의해야한다.
	// 이유는 동일 객체에 대해 같은 hashCode()값이 반환되도록 해야하기 때문이다.
	
	@Override // 이름을 해시코드값으로 쓸 때는 name.hashCode();
	// 나이를 해시코드값으로 쓸 때는 Integer.hashCode(age);
	public int hashCode() {
		return name.hashCode();
	}
	
	

}
