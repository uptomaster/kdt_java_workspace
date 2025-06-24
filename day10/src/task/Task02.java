package task;

public class Task02 {

	public static void main(String[] args) {

		Animal cat = new Animal();
		Animal tiger = new Animal();
		Animal panda = new Animal();
		
		cat.name = "고양이";
		tiger.name = "호랑이";
		panda.name = "판다";
		
		cat.age = 5;
		tiger.age = 17;
		panda.age = 3;

		cat.species = "고양잇과";
		tiger.species = "고양잇과";
		panda.species = "곰과";
		
		cat.eat("고기");
		tiger.birthday();
		panda.sleep();
		
	}

}
//Animal 클래스 => 객체 3개 생성

// 필드 : 동물이름, 나이, 종

// 메소드

// 1. 동물이 먹이(매개변수)를 먹는 메소드 매개변수 1개
// [출력형태]
// 동물이름이 00을 먹습니다.

// 2. 동물이 잠을 잡니다 출력하는 메소드 => 동물이름이 잠을 잡니다.

// 3. 동물의 생일을 축하하는 메세지 출력 메소드
// -> 동물이름의 나이를 축하합니다! 출력