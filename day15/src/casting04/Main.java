package casting04;

// 7번 : 캐스팅 예제
public class Main {
	
	public static void main(String[] args) {
		// Hero 타입으로 업캐스팅
		Hero ironMan = new IronMan("IronMan");
		ironMan.superPower(); // 업캐스팅 되어도 오버라이딩 된 메소드가 호출
		
		Hero hulk = new Hulk("Hulk");
		hulk.superPower();
		
		// 다운캐스팅
		IronMan ironMan2 = (IronMan)ironMan;
		((Hulk)hulk).say();
	}
}
