package constructorThis03;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("Hong-gil-dong");
		Person p3 = new Person("철수", 20);
		Person p4 = new Person("유리", "선생님");
		Person p5 = new Person("짱구", 20, "학생");
		
		System.out.println(p3);
		System.out.println(p5);
		p3.printInfo();
		p5.printInfo();
		
	}

}
