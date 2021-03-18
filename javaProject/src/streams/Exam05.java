package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;

import hr.EmpDAO;
import hr.Employee;

public class Exam05 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();

		Set<Employee> emps = dao.getEmps();
		double empList = emps.stream()
				.mapToDouble(new ToDoubleFunction<Employee>() {
			@Override
			public double applyAsDouble(Employee value) {
				return value.getSalary();
			}
		})
				.average()
				.getAsDouble();

		System.out.println("전체 사원의 급여 평균: " + empList);

	}

}
