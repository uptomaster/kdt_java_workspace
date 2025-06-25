package review;
// 1번 : 생성자 기초
public class Tv {

	// 필드
	// 채널, 볼륨, 전원, 색상, 브랜드, 가격
	boolean power = false; // default값은 false이다.
	int ch = 0;
	int vol = 0;
	String color = "";
	int price = 0;
	String brand = "";
	// 생성자 오버로딩
	
	// 기본생성자 : 매개변수가 0개 => 개발자가 생성자를 따로 만들지 않으면, 컴파일러가 기본 생성자를 자동으로 생성한다.
	public Tv() {
		
	}
	
	// 생성자 : 매개변수가 5개 있는 생성자 : alt + shift + s + o
	public Tv(int ch, int vol, String color, int price, String brand) {
		
		this.ch = ch;
		this.vol = vol;
		this.color = color;
		this.price = price;
		this.brand = brand;
	}
	
	// 메소드
	// 전원on/off : powerOnOff()
	void powerOnOff() {
		if(!power) { // 전원이 켜져있다면 ( power = true라면 )
			power = !power;
			System.out.println("전원상태 : "+ (power ? "켜짐" : "꺼짐"));
		}
		else { // 전원이 꺼져있다면 ( power = false라면 )
			power = !power;
			System.out.println("전원상태 : "+ (power ? "켜짐" : "꺼짐"));
		}
	}


	// 채널up : channelUp()
	// 전원이 꺼져있다면 (power == false)라면 "채널을 변경할 수 없습니다. 전원을 켜주세요" 출력
	// 전원이 켜져있다면 (power == true)라면 채널을 변경
	// 채널은 0~100을 넘을 수 없으므로 채널 < 100 일떄만 채널++
	// 채널 > 100 인 경우 "채널을 올릴 수 없습니다." 출력
	void channelUp() {
		if(power==false) {
			System.out.println("채널을 변경할 수 없습니다. \n전원을 먼저 켜주세요.");
		}
		else{ // power == true라면
			if(ch < 100) {
				ch++;
				System.out.printf("현재 채널은 %d번 입니다.", ch);
			}
			else {
				System.out.println("채널이 최대치입니다.");
			}
		}
	}
	// 채널down : channelDown()
	void channelDown() {
		if(power==false) {
			System.out.println("채널을 변경할 수 없습니다. \n전원을 먼저 켜주세요.");
		}
		else{ // power == true라면
			if(ch > 0) { // 채널이 0보다 크다면
				ch--;
				System.out.printf("현재 채널은 %d번 입니다.\n", ch);
			}
			else {
				System.out.println("채널이 최대치입니다.");
			}
		}
	}
	
	
	// 볼륨up : volumeUp()
		// power가 true라면 => 볼륨+1, power가 false라면=> false, 전원을 켜주세요.
		// 100초과 불가. 0미만 불가.
		// vol < 100 이라면 vol을 매개변수만큼 증가;
		// vol >= 99 라면 "더 이상 올릴 수 없습니다." 출력
	
	void volumeUp() {
		if(power == false){ // 전원이 꺼져있다면
			System.out.println("전원이 꺼져 있습니다.");
		}
		
		if(power == true) {
			if(vol < 100) {
				vol++; // 100보다 작다면 vol 증가.
				System.out.printf("현재 볼륨은 %d입니다.\n", vol);
			}
			else{
				System.out.println("볼륨이 최대치입니다.");
			}

		}
	}
	
	// 볼륨down : volumeDown()
	// 전원이 꺼져있다면 "전원이 꺼져있습니다" 출력
	// 전원이 켜져있다면 vol > 0 일때 vol-- 실행
	// 만약 내리다가 볼륨이 vol == 0이 된다면 "볼륨을 더 이상 올릴 수 없습니다." 출력
	void volumeDown() {
		if(power == false) {
			System.out.println("전원이 꺼져 있습니다.");
		}
		if(power == true) {
			if(vol > 0) {
				vol--;
				System.out.printf("현재 볼륨은 %d입니다.\n", vol);
			}
			else{
				System.out.println("볼륨을 더 이상 줄일 수 없습니다.");
			}
		}
	}
	
}
