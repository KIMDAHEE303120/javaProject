package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exam04 {
	public static void main(String[] args) {
		Student[] stdAry = { new Student("Hong", 30, 50), new Student("Shin", 30, 60), new Student("Yu", 50, 70) };

		System.out.print("시험점수의 총 합이 100점이 안되는 학생 > ");

		Stream<Student> std = Arrays.stream(stdAry);
		std.filter(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getEngScore() + t.getMathScore() < 100;
			}
		}).forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.print(t.getName() + " ");
			}
		});

	}

}
