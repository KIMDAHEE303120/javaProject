package streams;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intAry = { 5, 3, 2, 1, 4 };
		Arrays.stream(intAry)
		.sorted()
		.peek(new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println("peek: " + value);			
			}
		})
		.filter(n -> n > 5)
		.forEach(new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println("forEach: " );
			}
		});
		
		System.out.println("end");
	}

}
