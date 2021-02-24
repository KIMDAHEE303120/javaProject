package controls;

public class Morning0224 {
	public static void main(String[] args) {
		// 영어, 수학점수 담을 변수 선언
		// 평균이 90이상 = '수'
		// 80이상 = '우'
		// 70이상 = '미' 이하이면 '가'
		// 값을 담을 변수 선언
		// 2. 임의의 값을 생성하는 Math.random()을 사용해서 1~100까지의 임의의 값을 생성해서 영어, 수학점수 불러오기
		// 3. 임의의 값을 생성하는 Math.random()을 사용해서

		int eng = (int) (Math.random() * 100) + 1;
		int math = (int) (Math.random() * 100) + 1;
		String result2 = getAverage(eng, math);

		System.out.println("영어: " + eng + " / 수학: " + math + " / 두 점수의 평균은 " + result2 + "입니다.");

	}

	public static String getAverage(int score1, int score2) {
		String grade = "";
		double result1 = (score1 + score2) / 2.0;
		if (result1 >= 90) {
			grade = "수";
		} else if (result1 >= 80) {
			grade = "우";
		} else if (result1 >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		return grade;

	}

}
