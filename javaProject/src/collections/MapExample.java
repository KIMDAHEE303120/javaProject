package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 15);
		map.put("김민수", 20);
		map.put("박소연", 23);
		map.put("홍길동", 25); // key에 해당하는 부분은 중복된 값을 허용하지 못함(동일한 값 허용XX)>> value의 값만 바뀐것 확인

		
		Integer result = map.get("홍길동");
		// map.keySet(); >> key에 해당하는 값만 set에 담겠다는 의미
		Set<String> set = map.keySet();
		for (String key : set) {
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
//		Iterator<String> iter = set.iterator();
//		while (iter.hasNext()) {
//			String key = iter.next();
//			Integer val = map.get(key);
//			System.out.println("key: " + key + ", val: " + val);
//		}

		Map<Integer, String> sMap = new HashMap<>();
		String sResult = sMap.get(10);

	}
}
