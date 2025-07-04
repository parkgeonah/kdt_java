package setTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {
	public static void main(String[] args) {
		HashSet<String> animalSet = new HashSet<>();
		animalSet.add("하마");
		animalSet.add("코알라");
		animalSet.add("강아지");
		animalSet.add("호랭이");
		animalSet.add("냥이");
		animalSet.add("기린");
		System.out.println(animalSet);
		System.out.println(animalSet.toString());

		// Iterator: 반복자
		Iterator<String> animalIter = animalSet.iterator();
		System.out.println(animalIter);
		System.out.println(animalIter.toString());

		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext()); // false
//		System.out.println(animalIter.next()); // 예외발생 NoSuchElementException
		
		while (animalIter.hasNext()) {
			System.out.println(animalIter.next());
		}
	}
}