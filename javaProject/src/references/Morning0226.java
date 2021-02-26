package references;

public class Morning0226 {
	public static void main(String[] args) {

		// 임성원 = 88, 정준영 = 89, 도왕락 = 90 의 형태로 출력되도록 만들기
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };

		for (int i = 0; i < 3; i++) {
			System.out.println(names[i] + " 점수 = " + scores[i]);
		}

		// 향상된 for문 > names라는 배열에 string타입의 name이라는 변수안에 담아서 반복문을 처리
		for (String name : names) {
			// System.out.println(name);
		}
		int sum = 0;
		for (int score : scores) {
			// System.out.println(score);
			sum = sum + score;
		}
		System.out.println("합계점수: " + sum);

//		int[] oldAry = {45, 55, 67};
//		int[] newAry = new int[3];
//		for(int i=0; i<oldAry.length; i++) {
//			newAry[i] = oldAry[i];
//		}
////		System.out.println(newAry[0]);
////		System.out.println(newAry[1]);
////		System.out.println(newAry[2]);
//		
//		int[] newAry2 = new int[5];
//		System.arraycopy(newAry, 0, newAry2, 2, 2);
//		//System.arraycopy(newAry, 0, newAry2, 0, 2); >> newAry의 0번 위치부터 newAry2의 0번부터 2개를 복사하겠다 >> 45, 55 복사됨
//		System.out.println(newAry2[0]);
//		System.out.println(newAry2[1]);
//		System.out.println(newAry2[2]);
//		System.out.println(newAry2[3]);
//		System.out.println(newAry2[4]);

//		morning0226();

	}

	public static void arraycopy() {

	}

	public static void morning0226() {
		int[] engScores = { 90, 80, 70 };// new int[3];공간을 새로 만들어서 아래의 랜덤값을 넣지 말고 바로 값을 지정할 수 있음
		int[] mathScores = { 88, 90, 62 };// new int[3];

//		int[][] scores = new int[2][3]; // '2차원 배열'==> 2열, 3행의 의미 
//		scores[0] = new int[] {90, 80, 70};
//		scores[1] = new int[] {90, 87, 62};
//		System.out.println(scores.length); //> scores(2차원배열)의 크기
//		System.out.println(scores[0].length);//>scores[0](1차원 배열)의 크기
//		System.out.println(scores[1].length);//>scores[1](1차원 배열)의 크기

		int[][] scores = { { 90, 88, 87 }, { 88, 90, 92 } }; // 위의 내용과 같음
		double avg = 0.0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println("평균: " + sum * 10 / scores[i].length / 10.0); // 아래의 if 문과 같은 결과가 나옴
			// sum에 10을 곱한 후 10.0으로 나누면 소수점 1번째 자리까지만 표시
			// 위의 식으로 적으면 sum앞에 int를 안적어줘도 됨
//			if (i == 0) {
//				avg = (double) sum / scores[i].length;
//				System.out.println("영어의 평균: " + avg);
//			} else if (i == 1) {
//				avg = (double) sum / scores[i].length;
//				System.out.println("수학의 평균: " + avg);
//			}
		}

		System.out.println("");

		int sum1 = 0;
		int sum2 = 0;
		double avg1 = 0.0;
		double avg2 = 0.0;

		for (int i = 0; i < engScores.length; i++) {
			// engScores[i] = (int) (Math.random() * 100) + 1; >>engScores는 값을 지정해줬기 때문에 랜덤
			// 값 지워줌
			sum1 = sum1 + engScores[i];
		}
		avg1 = (double) sum1 / engScores.length;
		System.out.println("영어 평균: " + avg1);

		System.out.println("");

		for (int i = 0; i < mathScores.length; i++) {
			// mathScores[i] = (int) (Math.random() * 100) + 1;
			sum2 = sum2 + mathScores[i];
		}
		avg1 = (double) sum2 / mathScores.length;
		System.out.println("수학 평균: " + avg1);

	}
}
