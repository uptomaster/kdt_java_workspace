package interfaceTest06;

public class TableFan extends FanAdapter {
	// TableFan 클래스
	// 3개 메소드 탁자선풍기를 켭니다, 탁자선풍기를 끕니다, 비워두기

	@Override
	public void on() {
		System.out.println("[탁자 선풍기]를 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("[탁자 선풍기]를 끕니다.");
	}

}
