package hr;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		// EmpDAO dao = new EmpDAO();
		// dao.empList(); //결과값 출력

		// 결과값으로 추가적인 작업을 하기위해
//		EmpDAO dao = new EmpDAO();
//		Employee[] empList = dao.empList();
//		System.out.println("salary가 5,000이상인 사원정보 >> ");
//		for (Employee emp : empList) {
//			if (emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString() + "\n");

		// List를 사용한 결과 출력 예제
//		EmpDAO dao = new EmpDAO();
//		List<Employee> empList = dao.getEmpList();
//		System.out.println("salary가 5,000이상인 사원정보 >> ");
//		for (Employee emp : empList) {
//			if (emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//			}
//		}

		// Set를 사용한 결과 출력 예제
		EmpDAO dao = new EmpDAO();
//		Set<Employee> empList = dao.getEmps();
//		System.out.println("salary가 10,000이상인 사원정보 >> ");
//		for (Employee emp : empList) {
//			if (emp != null && emp.getSalary() > 10000) {
//				System.out.println(emp.toString());
//			}
//		}
		

		// Map, entrySet을 이용해서 joblist 가져오기
//		Map<String, String> map = dao.getJobList();
//		Set<Entry<String, String>> set = map.entrySet();
//		Iterator<Entry<String, String>> iter = set.iterator();
//		while (iter.hasNext()) {
//			Entry<String, String> ent = iter.next();
//			System.out.println("jobID: " + ent.getKey() + "\t , jobTitle: " + ent.getValue());
//		}
		
		//KeySet으로 가져오기
		Map<String, String> map = dao.getJobList();
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			System.out.println("jobId: " + key + ", jobTitle: " + map.get(key));
		}
	
				
		
		
//		dao.deptList();

//		Department[] departments = dao.deptList();

//		for (Department dept : departments) {
//			if (dept != null && dept.getLocation_id() != null && dept.getManager_id() != 0) {
//				System.out.println(dept.toString() + "\n");
//
//			}
//		}
	}
}
