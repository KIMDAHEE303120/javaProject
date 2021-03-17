package streams;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class ReduceExample {
	public static void main(String[] args) {
		Student[] students = { 
				new Student("홍길동", 10), 
				new Student("신용권", 20), 
				new Student("유미선", 60) };

//		int sum = Arrays.stream(students)
//		.mapToInt(new ToIntFunction<Student>() {
//			@Override
//			public int applyAsInt(Student value) {
//				return value.getScore();
//			}
//		}).sum();
//		System.out.println("sum: " + sum);

		int sum = Arrays.stream(students).mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getScore();
			}
		}).reduce(0, new IntBinaryOperator() {
			int sum = 0, count = 0;

			@Override
			public int applyAsInt(int left, int right) {
				count++;
				sum += right;
				System.out.println(/*"left: " + left + */"right: " + right + ", sum: " + sum + ", count: " + count);
				return sum / count;
			}
		});
		System.out.println("avg: " + sum);

	}

}
