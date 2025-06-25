package constructorBasic01;

// 2번: 기본 생성자 확인
class Student {
	
	// 필드
	String name;
	int age;
	
	// 기본 생성자 생성
	public Student() {
		System.out.println("기본생성자가 호출되었습니다.");
	}

	public Student(String name) {
		this.name = name;
//		System.out.println("매개변수가 1개인 생성자가 호출되었습니다.");
		System.out.println(this);
	}
	
	

}

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student(); // 1. 호출 시 클래스의 생성자 부분으로 간다. 2. 이후 st1 객체에 참조값을 저장하고
		
		System.out.println(st1); // 3. 저장된 참조값(주소)을 출력함.
		
		Student st2 = new Student("나루토"); // constructorBasic01.Student@2ff4acd0 : this는 st2객체 자기 자신을 의미함.
		System.out.println(st2); // 3. 저장된 참조값(주소)을 출력함.
		System.out.println(st2.name);
		
		Student st3 = new Student("이남혁"); // 스택 메모리에 st3가 만들어지고.. 힙 메모리에 Student클래스의 모든 것들이 공간이 할당된다. 
		// 그리고 new가 힙에 있는 주소값을 스택 메모리의 st3에 참조하게한다.
		System.out.println(st3); // 저장된 참조값(주소)을 출력함.
		System.out.println(st3.name);
	}
}
