package classBasic2;
// 11번 : Student 클래스 main
public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student(); // 기본 생성자
//		Stack 메모리    Heap 메모리
		System.out.println(st1); // classBasic2.Student@279f2327 => 패키지명.클래스명@주소(참조값)
		
		st1.name = "홍길동";
		st1.age = 17;
		st1.gpa = 4.5;
		
		System.out.printf("이름 : %s, 나이 : %d, 학점 : %.1f", st1.name, st1.age, st1.gpa);

		
	}

}
