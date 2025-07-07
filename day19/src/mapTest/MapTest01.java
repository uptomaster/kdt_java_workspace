package mapTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

// 1번 : HashMap 
public class MapTest01 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		System.out.println(al); // []
		al.add(al);
		System.out.println(al); // [(this Collection)]
		
		HashMap map = new HashMap();
		System.out.println(map); // {}
		System.out.println(map.toString()); // {}
//		map.put(this, this); // Cannot use this in a static context
		map.put(map,map);
		System.out.println(map); // {(this Map)=(this Map)} 
		// key = value 형태로 들어오게 된다. (키 = 값 쌍을 출력하느 방식으로)
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		System.out.println(al1); //[1, 1, 1]
		System.out.println(al1.get(1)); // 1번 인덱스에 있는 요소 출력
		
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		System.out.println(map1); // {a=1, b=2, c=3} => put(key, value)로 키, 값 추가
		System.out.println(map1.get("b")); // 2 => "b"라는 key를 검색해서 값 출력하기(2)
		// 인덱스를 몰라도 key값으로 해당 value를 출력할 수 있다.
		
		map1.put("a", 10);
		System.out.println(map1); // {a=10, b=2, c=3} value 가 수정된다.
		
		map1.put("d", 4); // 없는 키인 d를 추가하고, hashcode를 통해서 반환된 인덱스에 4라는 값을 넣어준다.
		System.out.println(map1);
		
		// put(key,value) : 키, 값 추가
		// get(key) : 해당 key의 value값 반환
		// size() : 해당 요소의 길이 반환
		// keySet() : 모든 key 종류 반환
		// values() : 모든 value 종류 반환
		
		System.out.println(map1.keySet()); // [a, b, c, d] => 반환타입 : Set 인터페이스
		Set set = map1.keySet();
		System.out.println(set);
		System.out.println(map1.values()); // [10, 2, 3, 4] => 반환타입 : Collection 인터페이스
		Collection co = map1.values();
		System.out.println(co);
		
	}
}
