package staticTest01;
// 8번 : 정적메소드 호출
public class MathUtilsMain {
	public static void main(String[] args) {

		//getMax() 호출 => 매개변수O, 리턴값X
		System.out.println(MathUtils.getMax(10,20));
	}
}
