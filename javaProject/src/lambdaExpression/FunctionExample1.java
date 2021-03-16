package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		printString(new Function<Student, String>() {
//			@Override
//			public String apply(Student t) {
//				return t.getName;
//			}			
//		});  >> 람다식으로 입력하기 전의 상태

		System.out.println("[학생 이름]");
		printString(t -> t.getName());

//		printInt(new ToIntFunction<Student>() {
//			@Override
//			public int applyAsInt(Student t) {
//				return t.getEnglishScore();
//			}
//		}); 
// 			printInt(new )>> 람다식으로 입력하기 전의 상태

		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());

//		printInt(new ToIntFunction<Student>() {
//		@Override
//		public int applyAsInt(Student t) {
//			return t.getMathScore();
//		}
//	});  >> 람다식으로 입력하기 전의 상태

		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());

		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		Stream<Employee> stream = list.stream();
		
		//1)
//		stream.forEach(new Consumer<Employee>() {
//			@Override
//			public void accept(Employee t) {
//				System.out.println(t.getFirstname() + ", " + t.getSalary());
//			}
//		});  >>람다식으로 입력하기 전의 상태

		//2)
//		stream.forEach((t) -> {
//			System.out.println(t.getFirstname() + ", " + t.getSalary());
//		}); >> 람다식

		//3)
//		stream.mapToInt(new ToIntFunction<Employee>() {
//			@Override
//			public int applyAsInt(Employee value) {
//				return value.getSalary();
//			}
//		}).forEach((t) -> {
//			System.out.println("salary: " + t);
//		});  >>람다식으로 입력하기 전의 상태

		//4)
//		stream.mapToInt((value) -> value.getSalary())
//		.filter(new IntPredicate(){  // value 값이 얼마이상인 급여만 필터링하는 메소드.. 
//			@Override
//			public boolean test(int value) {
//				return value > 10000;} //람다식으로 줄일 수 있음
//		}).forEach((t) -> {
//			System.out.println("salary: " + t);
//		});  // >> 람다식 
		
		//5)
		stream.mapToInt((value) -> value.getSalary())
		.filter((value)-> value > 10000) //filter를 람다식으로 줄인 상태
		.forEach((t) -> {
			System.out.println("salary: " + t);
		});  // >> 람다식 

	}

}
