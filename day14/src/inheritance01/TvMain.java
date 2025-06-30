package inheritance01;

public class TvMain {

	public static void main(String[] args) {
		Tv sTv = new Tv();
		sTv.ch = 10;
		sTv.vol = 5;
		sTv.power = true;
		
		sTv.powerOnOff();
		sTv.chUp();
//		sTv.netflix();
//		netflix() 메소드는 Tv2라는 자식 클래스에서 추가된 메소드이므로 부모 클래스에서 만든 객체에서 접근이 불가하다.
		
		Tv2 lTv = new Tv2();
		System.out.println(lTv);
		lTv.ch = 100;
		lTv.netflix(); 
		
	
	
	}
}
