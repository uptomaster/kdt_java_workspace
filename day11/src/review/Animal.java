package review;

public class Animal { // public이 붙은 클래스가 대표클래스여야한다. 단 1개의 클래스만 붙임.

	// 필드
	String name = ""; // 동물이름
	int age = 0; // 동물나이
	String species = ""; // 동물 종
	
	//메소드
	
	//1. 동물이 먹이를 먹는 메소드
	void eat(String food) {
		System.out.printf("%s이(가) %s(을)를 먹습니다.\n", name, food);
	}
	
	//2. 동물이 잠을 잡니다를 출력하는 메소드
	void sleep(String place) {
		System.out.printf("%s가 %s에서 잠을 잡니다..\n", name, place);
	}
	
	//3. 동물의 생일 축하하는 메소드
	void birthday() {
		System.out.printf("%s의 %d살 생일을 축하합니다!\n", name, age);
	}
	
	
}

class Task02 {

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
		panda.sleep("동굴");
		
	}

}