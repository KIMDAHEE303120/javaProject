package references;

public class ArrayExample1 {
	public static void main(String[] args) {
		// 5개의 숫자 나오게
		int[] intArys = new int[5];

		System.out.print("임의의 값: ");

		for (int i = 0; i < intArys.length; i++) {
			intArys[i] = (int) (Math.random() * 10) + 1;
			
			System.out.print(intArys[i]+ " ");
		}

		// for반복문을 활용하여 가장 큰 값 고르기
		int maxValue = 0;
		for (int i = 0; i < intArys.length; i++) {
			if (intArys[i] > maxValue) {
				maxValue = intArys[i];
			}
		}
		System.out.println("\n" + maxValue);
	}

}
