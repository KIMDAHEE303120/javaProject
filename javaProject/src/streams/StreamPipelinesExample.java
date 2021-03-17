package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30), new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45), new Member("박수미", Member.FEMALE, 27));

		OptionalDouble result = list.stream().filter(new Predicate<Member>() {
			@Override
			public boolean test(Member t) {
				return t.getSex() == Member.MALE;
			}
		}).mapToInt(new ToIntFunction<Member>() {
			@Override
			public int applyAsInt(Member t) {
				return t.getAge();
			}
		}).average() // OptionalDouble 값을 리턴 -> 최종처리메소드
		;
		System.out.println("남자 평균 나이: " + result.getAsDouble());

		// 컬렉션 -> 스트림 -> 매핑(나이) -> 필터(30세 이상) -> 평균나이 구하기
		OptionalDouble result1 = list.stream().mapToInt(new ToIntFunction<Member>() {
			@Override
			public int applyAsInt(Member t) {
				return t.getAge();
			}
		}).filter(new IntPredicate() {
			@Override
			public boolean test(int t) {
				return t >= 30;
			}
		}).average()
		;
		//System.out.println(result1.orElse(0.0));
		  if(result1.isPresent()) {
			System.out.println("30세 이상 평균: " + result1.getAsDouble());	
		} else {
			System.out.println("만족하는 요소가 없습니다.");
		}
	}
}
