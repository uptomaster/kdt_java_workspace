package mapTest;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// 2번 : 메뉴에 맞는 값 출력
public class MapTest02 {
	public static void main(String[] args) {

		HashMap<String, Integer> coffee = new HashMap<>();
		
		// 추가 : put
		coffee.put("아메리카노", 2000);
		coffee.put("카페라떼", 2400);
		coffee.put("카푸치노", 2400);
		coffee.put("카라멜마끼야또", 3000);
		System.out.println(coffee); // 넣은 순서는 의미가 없다. 중복은 불가능
		
		// 조회 : get
		System.out.println(coffee.get("아메리카노"));
	
		// 삭제 : remove
//		System.out.println(coffee.remove("카라멜마끼야또")); // 3000 => 해당하는 value 반환하고 삭제함.
//		System.out.println(coffee);
		System.out.println(coffee.remove("카라멜마끼야또", 3000)); // boolean 타입으로 삭제 성공여부 반환 후 삭제
		System.out.println(coffee);

		// containsKey
		System.out.println(coffee.containsKey("새우깡")); // key 중에 해당 key가 존재하는지 여부 반환
		
		// containsValue
		System.out.println(coffee.containsValue(2000)); // value 중에 해당 value가 존재하는지 여부 반환
		
		// ketSet()에서 key만 가져오기
		System.out.println(coffee.keySet()); // [카푸치노, 아메리카노, 카페라떼]
		Iterator<String> iter = coffee.keySet().iterator();
		System.out.println(iter); // java.util.HashMap$KeyIterator@1f32e575 => 내부클래스 사용됨을 알 수 있음.
		
		while(iter.hasNext() == true) {
			System.out.println(iter.next());
		}
		
		// Values => value만 가져오기
		System.out.println(coffee.values());
		Iterator<Integer> iter2 = coffee.values().iterator();
		
		while(iter2.hasNext() == true) {
			System.out.println(iter2.next());
		}
		
		// 키와 값을 한 쌍씩 가져오고 싶다면?
		// 키와 값을 한번에 이용하기 위해서 Entry를 이용한다.
		System.out.println(coffee.entrySet()); // [카푸치노=2400, 아메리카노=2000, 카페라떼=2400] => set 출력
		Set<Entry<String, Integer>> items = coffee.entrySet(); // [카푸치노=2400, 아메리카노=2000, 카페라떼=2400]
		System.out.println(items);
		
		for(Entry<String, Integer> entry : items) {
			System.out.println(entry);
		}
	
	}
	
}
