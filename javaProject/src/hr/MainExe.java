package hr;

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

		EmpDAO dao = new EmpDAO();
//		dao.deptList();

		Department[] departments = dao.deptList();

		for (Department dept : departments) {
			if (dept != null && dept.getLocation_id() != null && dept.getManager_id() != 0) {
				System.out.println(dept.toString() + "\n");
			}
		}
	}
}
