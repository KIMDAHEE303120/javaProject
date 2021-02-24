package controls;

public class WhileExample {
	public static void main(String[] args) {
		// 반복문
		// for(int i=1; i<=9; i++) {....} >for문의 경우에는 이렇게 씀

		// 1~10의 합 구하기 1
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~10의 합: " + sum);

		// 1~10의 합 구하기 2
		i = 1; // 위에서 i=11이 됐으니 다시 1로 지정
		sum = 0; // 위에서 sum=55가 됐으니 다시 0으로 지정
		while (true) { // 무한반복
			sum = sum + i;
//			i++; > 여기에 넣으면 9번만 반복			
			if (i >= 10) {
				break; // 어떠한 조건을 만족하면 빠져나오라는 구문을 넣어줘야 함
			}

			
			i++;

		}
		System.out.println("1~10의 합: " + sum);

	}

}

