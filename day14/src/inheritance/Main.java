package inheritance;
// 5번 : this, this(), super, super()
public class Main {
	public static void main(String[] args) {
		
		System.out.println("======Student 기본 생성자======");
		Student st1 = new Student();
		
		System.out.println("======Student 매개변수 생성자======");
		Student st2 = new Student("이남혁", 25, "컴퓨터공학과");
		System.out.println(st2);
		st2.introduce();
	}
}
