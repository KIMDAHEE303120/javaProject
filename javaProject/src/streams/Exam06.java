package streams;

import java.util.Set;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

import hr.EmpDAO;
import hr.Employee;

public class Exam06 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();

		Set<Employee> emps = dao.getEmps();
	
		double itAvg = emps.stream()
		.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
		}).mapToDouble(new ToDoubleFunction<Employee>() {
			@Override
			public double applyAsDouble(Employee value) {
				return value.getSalary();				
			}
		}).average()
		.orElse(0.0);			
		
		System.out.println("개발자(IT_PROG)의 평균급여: " + itAvg);
	}
	

}
