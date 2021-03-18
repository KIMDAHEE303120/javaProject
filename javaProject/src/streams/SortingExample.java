package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingExample {
	public static void main(String[] args) {
		IntStream intAry = Arrays.stream(new int[] { 1, 3, 4, 5, 2 });

		
		intAry
		.sorted()
		.forEach(new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println(value);
			}
		});

		
		
		Student[] stdAry = { 
				new Student("Hong", 30, 30), 
				new Student("Shin", 20, 30), 
				new Student("Yu", 15, 30), 
				};
		Stream<Student> st = Arrays.stream(stdAry);
		st
		.sorted()
		.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.println(t.getName());				
			}
		});

	}

}
