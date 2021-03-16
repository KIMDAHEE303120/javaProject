package streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream()
		.flatMapToInt(data -> { //maptoint와 다르게 반복문 넣어줘야 반복 
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim()); //parseInt >>문자열을 int로 바꿔주는 역할,,,
			}
			return Arrays.stream(intArr);
		})
		.forEach(number -> System.out.println(number));
	}
}
