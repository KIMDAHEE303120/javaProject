package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(2, "김민수"), 85);
		map.put(new Student(1, "홍길동"), 92); 
		//3개 다 다른객체임을 알 수 있음
		//Student class에서 두 값이 같으면 같은 해시코드라고 재정의(override)한 후 조회하면 2건이 조회됨을 확인

		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator(); // 반복된 요소 뽑아내기
		while (iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.toString()); // key값 출력
		}
		

	}

}
