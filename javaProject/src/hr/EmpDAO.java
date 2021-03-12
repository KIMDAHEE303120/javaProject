package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;

	EmpDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		conn = DBUtil.getConnection(url, user, password); // DB를 연결 >> 사용한 후 접속 끊어줘야함
	}

	// 메소드(부서정보)
	public Department[] deptList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM departments";
		Department[] departments = new Department[100];

		try {
			psmt = conn.prepareStatement(sql); // DB를 실행(오류는 예외처리해줌)
			rs = psmt.executeQuery(); // 위에서 조회한 값이 담겨있음
			int i = 0;
			while (rs.next()) { // 데이터가 있는동안에만 값을 읽어오는 'next'를 쓸 수 있음
				Department dept = new Department();
				dept.setDepartment_id(rs.getInt("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				dept.setManager_id(rs.getInt("manager_id"));
				dept.setLocation_id(rs.getString("location_id"));
				// System.out.println(dept.toString() + "\n");
				departments[i++] = dept;

//				System.out.println(emp.toString());
//				System.out.println();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn); // 예외처리 위의catch가 오류가나면 실행
		}
		System.out.println("메소드 호출 완료.");

		return departments;

	}

	// Set을 사용해서 쿼리하기
	public Set<Employee> getEmps() {
		String sql = "select * from emp_java";
		Set<Employee> set = new HashSet<Employee>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstname(rs.getString("first_name"));
				emp.setLastname(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				set.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return set;
	}

	// 메소드 (사원정보) >> List 사용 List<Employee> getEmpList()

	public List<Employee> getEmpList() {
		String sql = "select * from emp_java";
		List<Employee> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstname(rs.getString("first_name"));
				emp.setLastname(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return list;
	}

	// 메소드 (사원정보)

	public Employee[] empList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM emp_java";
		Employee[] employees = new Employee[100];

		try {
			psmt = conn.prepareStatement(sql); // DB를 실행(오류는 예외처리해줌)
			rs = psmt.executeQuery(); // 위에서 조회한 값이 담겨있음
			int i = 0;
			while (rs.next()) { // 데이터가 있는동안에만 값을 읽어오는 'next'를 쓸 수 있음
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstname(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastname(rs.getNString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
				employees[i++] = emp;

				System.out.println(emp.toString());
				System.out.println();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn); // 예외처리 위의catch가 오류가나면 실행
		}
		System.out.println("메소드 호출 완료.");

		return employees;

	}

}
