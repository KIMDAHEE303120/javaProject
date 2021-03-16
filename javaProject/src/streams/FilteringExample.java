package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");

		// 중복제거(람다식)
//		names.stream()
//		.distinct()
//		.forEach(n -> System.out.println(n));
//		System.out.println();
//
//		names.stream().distinct().forEach(new Consumer<String>() {
//			@Override
//			public void accept(String n) {
//				System.out.println(n);
//			}
//		});
//		System.out.println();
//
//		// 필터링
//		names.stream().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
//		System.out.println();
//
//		// 중복 제거 후 필터링
//		names.stream().distinct().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));

		List<Member> members = Arrays.asList(
				new Member("Hong", Member.MALE, 30), 
				new Member("Kim", Member.FEMALE, 20),
				new Member("Shin", Member.MALE, 46), 
				new Member("Hong", Member.MALE, 30),
				new Member("Park", Member.FEMALE, 27));
		
		members.stream()
		.distinct()
		.forEach(System.out::println);
	}
}
