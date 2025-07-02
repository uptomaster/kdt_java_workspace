package interfaceTest06;

public class TowerFan implements Fan{
	@Override
	public void on() {
		System.out.println("[타워 선풍기]를 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("[타워 선풍기]를 끕니다.");
	}

	@Override
	public void turbo() {
		System.out.println("[타워 선풍기]를 [터보 모드]로 전환합니다.");
	}
}
