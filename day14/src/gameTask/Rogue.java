package gameTask;

import java.util.Random;

public class Rogue extends Character{

	int [] randomDmg = {20,30,40,50,60,70,80,90,100};
	

	// 로그, 20, 20, 3, 20, 0 전달
	public Rogue() {
		super("로그", 20, 20, 3, 20, 0);
	}
	// normalAttack() 오버라이딩 : mp 3 소모, 부족하면 실패
	public void normalAttack() {
		if(mp < 3) return;
		this.mp -= 3;
		super.normalAttack();
	}
	// skillAttack() 오버라이딩 : mp 2 소모 + hp 5 소모, 부족하면 실패
	public void skillAttack() {
		
	}
	// specialAttack() : 20~100 사이의 무작위 피해량 출력(Random 사용)\
	public void specialAttack() {
		Random r = new Random();
		int dmg = randomDmg[r.nextInt(randomDmg.length)];
		System.out.printf("로그의 스페셜스킬을 이용해 %d 만큼의 피해를 입혔습니다.", dmg);
	}
	// 정수형 배열 필드 이용
	
}
