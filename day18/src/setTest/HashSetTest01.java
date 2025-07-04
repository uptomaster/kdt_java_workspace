package setTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {
	public static void main(String[] args) {
		HashSet<String> animalSet = new HashSet<>();

		animalSet.add("하마");
		animalSet.add("코알라");
		animalSet.add("치타");
		animalSet.add("호랑이");
		animalSet.add("기린");
		animalSet.add("기린"); // 중복값은 허용하지 않는다.
		System.out.println(animalSet); // Set은 순서가 없다.
		System.out.println(animalSet.toString());

		// Iterator : 반복자
		Iterator<String> animalIter = animalSet.iterator();
		System.out.println(animalIter); // $ : 내부클래스
		System.out.println(animalIter.toString());

//		System.out.println(animalIter.hasNext()); // boolean값 반환.
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext()); // boolean값 반환.
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext()); // boolean값 반환.
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext()); // boolean값 반환.
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext()); // boolean값 반환.
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext()); // boolean값 반환. false반환 후 next()호출하면 예외 발생
//		// java.util.NoSuchElementException
//		System.out.println(animalIter.next()); // 하마 까지 출력하고 오류발생
//		
		// 이걸 이용해서 while문으로 이용할 수 있다. (언제끝나는지 알기 때문에)
		while(animalIter.hasNext() == true) {
			System.out.println(animalIter.next());
		}

	}
}
