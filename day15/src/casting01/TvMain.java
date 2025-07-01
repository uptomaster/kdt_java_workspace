package casting01;

// 4번 : 캐스팅 
public class TvMain {
	public static void main(String[] args) {

		Tv tv = new Tv();
		System.out.println(tv);

//		tv.netflix(); => 부모 객체는 자식 클래스에만 있는 멤버 사용 불가능.
		tv.powerOnOff();

		SmartTv smartTv = new SmartTv();
		System.out.println(smartTv);
		smartTv.netflix(); // 자식 객체의 값은 자식 클래스에 있는 멤버 사용 가능.
		smartTv.chUp(); // 자식 객체의 값은 부모 클래스에 있는 멤버도 사용 가능.

		// 업캐스팅 (부모가 위, 자식이 아래. 자식->부모로 캐스팅)
		// 방법1
		// SmartTv()는 Tv라는 클래스의 참조변수 tv1에 할당된다.
		// 부모 클래스타입의 참조 변수로 자식 클래스 타입의 참조값을 대입하는 것이 업캐스팅이다.
		// 부모클래스자료형 참조변수명 = new 자식생성자();
		Tv tv1 = (Tv) new SmartTv(); // 부모 타입의 객체에 자식의 참조값을 대입(업캐스팅)
		System.out.println(tv1); // casting01.SmartTv@5caf905d : 자식의 참조값
//		tv1.netflix(); // 업캐스팅되면 자식 클래스에 만들어진 멤버는 사용불가능하다.

		// 방법2
		Tv tv2 = (Tv) smartTv;
		// tv2는 SmartTv클래스의 객체를 참조하지만, 업캐스팅으로 인해서 Tv타입으로 취급된다.
		// 따라서 Tv 클래스의 필드와 메소드에만 접근할 수 있다.

		// 방법3
		Tv tv3 = new SmartTv();
		// 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 객체를 참조한다.
//		tv3.netflix();

		// 자식에 있는 멤버를 사용해야할떄...
		// Down Casting
		SmartTv stv3 = (SmartTv) tv3;
		stv3.netflix();

//		SmartTv stv = (SmartTv) new Tv(); // 빨간 밑줄이 나타나지 않고, 실행해야 오류가 발생한다.
//		System.out.println(stv); // Down Casting은 무조건 이미 Up Casting된 값으로 진행해야한다.
		// 즉, Up Casting된 값을 원래 자식 타입으로 되돌리는 것이 Down Casting이다.

	}
}
