package interfaceTest02;
// 9번 : 인터페이스, 참조변수의 다형성(캐스팅) 연습
public class Main {
	public static void main(String[] args) {
		// Music 이라는 인터페이스를 만들고, 각 메소드를 호출해보자.
		
		// 음악 재생 프로그램 만들기
		// 부모는 Music 인터페이스
		// 구현되지 않은 mode() 메소드 만들기
				
		// 참조변수는 따로 만들지 않는다. (객체화하지 않는다.)
		// 매개변수의 다형성을 활용해서 모든 클래스 타입의 메소드 호출하기.
		
		check(new Ballad());
		check(new Hiphop());
		check(new Rock());
		
	}
	
	// check 메소드 -> static 메소드, 매개변수 리턴값여부
	// 매개변수 : Music 타입의 인터페이스
	// 리턴값여부 : 출력문이므로 void
	
	static void check(Music music) {
		System.out.println("==============Music===============");
		music.mode();
		if(music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		}
		else if(music instanceof Hiphop) {
			((Hiphop)music).onlyHiphop();
		}
		else if(music instanceof Rock) {
			((Rock)music).onlyRock();
		}
	}
}
