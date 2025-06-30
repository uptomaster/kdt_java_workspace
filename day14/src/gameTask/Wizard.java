package gameTask;

public class Wizard extends Character {

	// Character 클래스 상속
	// 기본 생성자를 통해 마법사, 15, 30, 1, 30, 0 전달
	public Wizard() {
		super("마법사", 15, 30, 1, 30, 0);
	}

	// normalAttack() 오버라이딩 : 체력 2감소 후 공격 실행
	public void normalAttack() {
		if (this.hp < 2)
			return;
		this.hp -= 2; // 체력 2감소
		revive();
		super.normalAttack(); // 공격 실행
	}

	// skillAttack() 오버라이딩 : mp가 부족하면 출력 후 실패
	public void skillAttack() {
		if (checkMp(10)) {
			super.skillAttack();
		} else {
			System.out.println("스킬을 사용할 수 없습니다.");
			showStatus();
			return;
		}
	}

	// specialAttack() 오버라이딩 : 마법사는 특수공격이 없습니다 출력
	public void specialAttack() {
		System.out.println("마법사는 특수공격이 없습니다.");
		showStatus();
	}
}
