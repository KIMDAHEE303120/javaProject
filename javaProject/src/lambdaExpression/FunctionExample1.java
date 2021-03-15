package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

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

	}

}