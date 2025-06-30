package review;

class Animal{
	// 필드

	String name;
	int age;
	
	// 생성자 : alt + shift + s
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	void eat(String food) {
		System.out.println(this.name + "이 " + food + "를 먹고 있습니다.");
	}
	
	void play() {
		System.out.println(this.name + "이 놀고 있습니다.");
	}
	void sleep() {
		System.out.println(this.name + "이 잠을 잡니다.");
	}
	void sleep(int time) {
		System.out.println(this.name + "이 " + time + "시에 잠을 잡니다.");
	}
	
}


public class Main {
	public static void main(String[] args) {

		// 동물 클래스 작성
		// Animal 클래스 정의
		// 필드 : 이름(name), 나이(age)
		// 생성자 매개변수 2개있는 생성자.
		// 메소드 : eat(String food) 이름이 음식을 먹습니다 출력
		// play()	이름이 놀고있습니다 출력
		// sleep()	이름이 잠을 잡니다 출력
		// sleep(int time) 이름이 몇시에 잠을 잡니다 출력
		
		// main 메소드에서 객체 2개 만들고 모든 메소드 호출하기
	
		Animal cat = new Animal("cat", 5);
		Animal dog = new Animal("dog", 7);
		
		cat.play();
		cat.eat("고기");
		dog.sleep();
		dog.sleep(6); // 메소드 오버로딩
		
		
	}
}
