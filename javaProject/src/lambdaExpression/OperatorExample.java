package lambdaExpression;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	// 필드
	private static int[] scores = { 92, 95, 87 };

	// int리턴 메소드
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {

		// 최대값 얻기
//		int max = maxOrMin(new IntBinaryOperator() {
//			@Override
//			public int applyAsInt(int left, int right) {
//				return left > right ? left : right;
//			}
//		});
//		System.out.println("최대값: " + max);

		// 최대값 얻기(람다식 1)
//		int max = maxOrMin((a, b) -> {
//			if (a >= b)
//				return a;
//			else
//				return b;
//		});
//		System.out.println("최대값: " + max);

		// 최대값 얻기(람다식 2)
		int max = maxOrMin((left, right) -> left > right ? left : right);
		System.out.println("최대값: " + max);

		// 최소값 얻기 (람다식 1)
//		int min = maxOrMin((a, b) -> {
//			if (a <= b)
//				return a;
//			else
//				return b;
//		});
//		System.out.println("최소값: " + min);

		// 최소값 얻기(람다식 2)
		int min = maxOrMin((left, right) -> left < right ? left : right);
		System.out.println("최소값: " + min);
	}

}
