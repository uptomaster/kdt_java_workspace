package homework15;

public class Main {
	public static void main(String[] args) {
		// 객체 생성
		Person p = new Person("이남혁");
		p.setAge(25);
		p.setBirth("20010929");
		Student s = new Student("신짱구", true);
		s.setStu(s.isStu());
		Employee e = new Employee("오스틴");
		Teacher t = new Teacher("현우진");
		t.setSubject("수학");
		System.out.println("==================");
		printInfo(p);
		System.out.println("==================");
		printInfo(s);
		System.out.println("==================");
		printInfo(e);
		System.out.println("==================");
		printInfo(t);
	}

	// static 메소드 정의
	// 객체 타입에 따라 다운 캐스팅하여 전용 메소드 실행하기
	static void printInfo(Person p) {
		p.introduce();
		
		if(p instanceof Student) {
			((Student)p).study();
		}
		else if(p instanceof Teacher) {
			((Teacher)p).teach();
		}
		else if(p instanceof Employee) {
			((Employee)p).work();
		}else{
			System.out.println("직업이 없습니다");
		}
	}



}
