package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.ToIntFunction;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
//		double avg = list.stream()
//				.mapToInt(new ToIntFunction<>() {
//					@Override
//					public int applyAsInt(T value) {
//						return 0;
//					}
//				});
		
		
		
//		OptionalDouble optional = list.stream()
//				.mapToInt(new ToIntFunction<OptionalInt>() {
//
//					@Override
//					public int applyAsInt(OptionalInt value) {
//						return 0;
//					}
//					
//				})
		
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법1 평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1 평균: 0.0");
		}
		
		
		
		
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2 평균: " + avg);
		
		
		
		
		list.stream()
		.mapToInt(Integer :: intValue)
		.average()
		.ifPresent(a -> System.out.println("방법3 평균: " + a));
		
	}

}
