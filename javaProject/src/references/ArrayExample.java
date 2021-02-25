package references;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 91;
		int score3 = 92;
		int score4 = 93;
		int score5 = 94;

		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;

		System.out.println("평균: " + avg);

		System.out.println("");

		// 위의 내용을 담는 인덱스
		// 방법 1)
		int[] scores = new int[5];
		scores[0] = 90;
		scores[1] = 91;
		scores[2] = 92;
		scores[3] = 93;
		scores[4] = 94;
		System.out.println("방법 1) " + scores[0]);
		System.out.println(scores[1]);
		scores[0] = 80;
		scores[1] = 81;
		System.out.println("변경후) " + scores[0]);
		System.out.println(scores[1]);

		System.out.println("-----for-----"); // 인덱스, for문을 사용하여 계산

		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + scores[i];
		}
		avg = sum / 5.0;
		System.out.println("평균: " + avg);

		System.out.println("");

		// 방법 2)
		int[] scores2 = { 90, 91, 92, 93, 94 };
		System.out.println("방법 2) " + scores2[3]);
		System.out.println(scores[4]);

		// double타입 배열변수
		double[] averages = { 1, 2, 3, 4, 5 };
		System.out.println("배열에 담긴 크기: " + averages.length);
		double d1 = averages[0];
		averages[3] = 4.5;
		for (int i = 0; i < averages.length; i++) {
			System.out.println(averages[i]);
		}

		// 문자타입 배열변수
		String[] strs = { "Hello", "Good", "Nice", "20" };
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}

	}

}
