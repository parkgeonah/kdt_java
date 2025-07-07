package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// 2번: 메뉴에 맞는 값 출력하기
public class MatTest02 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> coffee = new HashMap<>();
		
		// 추가 
		coffee.put("아메리카노", 2000);
		coffee.put("카페라떼", 2400);
		coffee.put("카푸치노", 2400);
		coffee.put("카라멜마끼야또", 3000);
		
		System.out.println(coffee);
		
		//조회 get
		System.out.println(coffee.get("아메리카노"));
		
		// 삭제 remove
//		System.out.println(coffee.remove("카라멜마끼야또"); // 해당하는 value값 반환되고 삭제
		System.out.println(coffee.remove("카라멜마끼야또",3000)); // boolean타입으로 삭제성공여부 반환되고 삭제
		System.out.println(coffee);
		
		//containsKey
		System.out.println(coffee.containsKey("새우깡")); 
		// contaninsValue
		System.out.println(coffee.containsValue(2000));
		
		// Iterator
		// KeySet -> key만 가져오기
		System.out.println(coffee.keySet());
		Iterator<String> iter = coffee.keySet().iterator();
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		//Values -> value만 가져오기
		System.out.println(coffee.values());
		Iterator<Integer> iter2 = coffee.values().iterator();
		System.out.println(iter2);
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		System.out.println(coffee);
		
		// Entry, key, value 한쌍씩 가져오기
		System.out.println(coffee.entrySet());
		Set<Entry<String, Integer>> items = coffee.entrySet();
		System.out.println(items); //[카푸치노=2400, 아메리카노=2000, 카페라떼=2400]
		for(Entry<String, Integer> entry: items) {
			System.out.println(entry);
		}
	}
}
