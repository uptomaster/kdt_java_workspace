package casting01;
// 4번 : 부모 클래스
public class Tv {

	// 필드 3개
	boolean power;
	int ch;
	int vol;
	
	// 메소드 3개
	void powerOnOff() {
		System.out.println("TV전원을 켜거나 끕니다.");
	}
	void chUp() {
		System.out.println("채널을 올립니다.");
	}
	void chDown() {
		System.out.println("채널을 내립니다.");
	}
}
