package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream is = IntStream.range(10, 20);
		is = IntStream.rangeClosed(10, 20);
		is.forEach(v -> System.out.print(v + " "));

		int from = 15, to = 35;
		is = IntStream.rangeClosed(from, to);
		System.out.println();

	}

}
