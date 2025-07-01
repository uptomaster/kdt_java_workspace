package casting04;

public class IronMan extends Hero{

	// 생성자
	public IronMan(String name) {
		super(name);
	}
	// 메소드오버라이딩
	@Override
	void superPower() {
		System.out.println(this.getName() + "이/가 슈트를 입고 날아다닙니다!");
	}


	
	
}
