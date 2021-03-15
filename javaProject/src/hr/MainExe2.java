package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {
	public static void main(String[] args) {
		// 정렬(급여기준)
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps(); // 전체리스트 Set저장

		TreeSet<Employee> tSet = new TreeSet<Employee>(); // salary 정렬
		Iterator<Employee> iter = set.iterator();
		while (iter.hasNext()) {
			tSet.add(iter.next()); // salary 기준으로 정렬되면서 저장
		}
		iter = tSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next()); // salary 기준으로 출력
		}
	}

}
