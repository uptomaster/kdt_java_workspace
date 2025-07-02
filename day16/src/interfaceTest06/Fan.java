package interfaceTest06;
// 23번 : 어댑터클래스(인터페이스)
public interface Fan {

	int MAX_STRANGTH = 3;
	int MIN_STRANGTH = 0;
	
	void on();
	void off();
	void turbo();
	
	// 구현하는 클래스
	


	// TowerFan 클래스
	// 타워 선풍기를 켭니다, 타워 선풍기를 끕니다, 타워선풍기를 [터보모드]로 전환합니다.
}
