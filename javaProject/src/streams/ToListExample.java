package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class ToListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong", "Hwang", "Park");
		// stream 중간처리> 최종집계 결과를 List<String> (H로 시작하는 사람만 필터링)
		Collector<String, ?, List<String>> col = Collectors.toList();
		List<String> newList = list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("H");
			}
		}).collect(col);
		System.out.print("'H'로 시작하는 사람: ");
		for (String str : newList) {
			System.out.print(str + ", ");
		}

		System.out.println("\n=======================================");

		EmpDAO dao = new EmpDAO();
		// dao.getEmpList();
		Set<Employee> emps = dao.getEmps();

		List<Employee> empList = emps.stream()
				.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
		}).collect(Collectors.toList());

		empList.stream().forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee t) {
				System.out.println(t);
			}
		});
	}
}
