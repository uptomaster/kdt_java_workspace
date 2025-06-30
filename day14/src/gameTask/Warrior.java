package gameTask;

public class Warrior extends Character {

	

	// Character 클래스 상속
	// 기본 생성자를 통해 전사, 30, 10, 5, 15, 100 전달
	public Warrior() {
		super("전사", 30, 10, 5, 15, 100);
	}
	// skillAttack() 오버라이딩 : mp가 3보다 부족하면 실패, 아니면 mp3소모
	public void skillAttack() {
		if(this.mp < 3) System.out.println("스킬을 사용할 수 없습니다.");
		this.mp -= 3;
		super.skillAttack();
	}
	// specialAttack() 오버라이딩 : 피해 출력 + 체력 10 감소, 부활 검사
	public void specialAttack() {
		System.out.println("");
		this.hp -= 10;
		super.revive();
	}
	// onlyWarrior() 메소드 추가 : 전사만 사용하라 수 있는 고유 행동입니다 출력
	public void onlyWarrior() {
		System.out.println("전사만 사용할 수 있는 고유 행동입니다.");
	}
	
	
}
