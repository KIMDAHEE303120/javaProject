package controls;

public class ForExample {
	public static void main(String[] args) {
		// 1~10의 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1~10의 합: " + sum);
	}
}
