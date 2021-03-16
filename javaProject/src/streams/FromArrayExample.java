package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = { "홍길동", "신용권", "김미나" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.print(a + ", "));
		System.out.println();

		int[] intArray = { 1, 2, 3, 4};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ", "));
		
		intStream = Arrays.stream(intArray);

		System.out.println();
		System.out.println();
		// 짝수의 합계
		int sum = 0;
		sum = intStream.filter((value) -> value % 2 == 0)
				.sum();
		System.out.println("짝수의 합계는: " + sum);
		System.out.println();
		
		// 전체 합계
		sum = 0;
		for (int a : intArray) {
			sum += a;
		}
		System.out.println("전체 합계는: " + sum);
		System.out.println();
		
		//전체합의 평균
		intStream = Arrays.stream(intArray);
		OptionalDouble od = intStream.average();
		System.out.println("전체합의 평균: " + od.getAsDouble());
		System.out.println();

		double[] doubleArray = { 1.0, 1.5, 2.0 };
		DoubleStream doubleStream = Arrays.stream(doubleArray);
		doubleStream.forEach(a -> System.out.print(a + ", "));
		System.out.println();
	}

}
