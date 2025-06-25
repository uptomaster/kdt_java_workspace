package review;
// 1번: 생성자 기초
public class TvMain {
	public static void main(String[] args) {
		
		
		Tv tv = new Tv(99, 5, "Blue", 100,"LG");
//		tv.ch = 5;
//		tv.vol = 99;
//		tv.color = "Blue";
//		tv.brand = "LG";
		System.out.println(tv.brand + " tv를 조작합니다.");	
		
		tv.powerOnOff(); // 먼저 전원을 킨다.
		
		tv.volumeUp(); // 볼륨up 5 -> 6
		tv.volumeUp();
		tv.channelDown();
		tv.channelDown();
		
		// 새로운 Tv객체 myTv
		System.out.println("============myTv=============");
		Tv myTv = new Tv();
		myTv.brand = "Samsung";
		myTv.vol = 50;
		myTv.ch = 100;
		myTv.color = "Red";
		System.out.println(myTv.brand + " tv를 조작합니다.");
		
		myTv.powerOnOff(); // 전원 먼저 키기
		myTv.channelUp();
	}
}
