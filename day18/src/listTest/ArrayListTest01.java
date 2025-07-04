package listTest;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.toString());

		// 요소 추가 add()
//		al.add(al); // 객체 자기 자신을 추가하면, (this Collection)이 출력됨.
		al.add(2);
		al.add("1");
		al.add(2.5);
		al.add(true);
		System.out.println(al);

		// 요소 길이 확인 메소드 size()
		// 배열은 length
		// 문자열은 length()
		// 리스트는 size()
		System.out.println(al.size());

		// 순서가 있으니, 반복문 돌릴 수 있음. => 요소 출력
		// 요소를 반환하는 메소드 get(index)
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " + al.get(i));
		}

		// <Element> : 제네릭
		ArrayList<Integer> al2 = new ArrayList<Integer>(); // 요소를 추가할때 정수만 추가할 수 있게 제한을 걸음
//		al2.add(1); // auto boxing
//		System.out.println(al2.get(0));
//		al2.add(null);
//		System.out.println(al2);

		// 반복문을 이용해서 10부터 1까지 순서대로 값 추가하기
		for (int i = 0; i < 10; i++) {
			al2.add(10 - i);
		}
		System.out.println(al2);

		// 값 가져오기 : index 번호로 특정 값 가져오기 => .get(int index)
		System.out.println(al2.get(0));
		// 삭제 : index번호로 삭제(int 타입으로 매개변수) => .remove(int index)
		System.out.println("인덱스 1의 값 " + al2.remove(1) + "을 삭제했습니다.");
		System.out.println(al2);
		// 삭제 : 값으로 검색하여 삭제(Object타입으로 매개변수) , 삭제 성공 여부를 반환 => .remove(Object o)
		System.out.println("값 삭제 여부 : " + al2.remove(Integer.valueOf(50)));
		System.out.println("값 삭제 여부 : " + al2.remove(Integer.valueOf(5)));
		System.out.println(al2);
		
		// 수정 : 수정전의 값을 반환 set(int index, value)
		System.out.println(al2.set(2, 100)); // 인덱스2번에 100이라는 값으로 수정
		
		
	}
}
