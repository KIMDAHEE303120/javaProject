package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10), 
				new Student("신용권", 20),
				new Student("유미선", 30)
				);

//		studentList.stream()
//		.mapToInt(new ToIntFunction<Student>() {
//			@Override
//			public int applyAsInt(Student s) {
//				return s.getScore();
//			}
//		})
//		.forEach(new IntConsumer() {
//			@Override
//			public void accept(int score) {
//				System.out.println(score);
//			}
//		});

		
		System.out.println("---");

		
		studentList.stream()
		.mapToInt((s) -> s.getScore())
		.forEach((score) -> System.out.println(score));

		int[] intAry = {};
		Integer[] integerAry = {}; // 클래스를 담을 수 있는 배열

		IntStream is = Arrays.stream(intAry);
		Stream<Integer> iss = Arrays.stream(integerAry);

	}
}
