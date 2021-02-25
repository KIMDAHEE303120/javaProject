package controls;

public class Exercise06 {
	public static void main(String[] args) {
		// for문으로 삼각형 출력하기

//		char s = '*';
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(s);
//		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 임의의 값 35, 60
		// 35~60까지의 합 구하기 (for반복문)
		// public static int getSumValue(정수1, 정수2) {
		// //정수1, 정수2 사이의 합을 구하는 메소드
		// }
		int sum = 0;
		for (int i = 35; i <= 60; i++) {
			sum = sum + i;
		}
		System.out.println("1) 35~60까지의 합: " + sum);
//-------------------------------------------------------------		

		int sNum = 44;
		int eNum = 67;
//		int result = getSumValue(44, 67);
		int result = getSumValue(sNum, eNum);

		System.out.println("2) 두 수 사이의 합: " + result);
		System.out.println("A)  " + sNum + "와 " + eNum + "의 합: " + result);

	}

	public static int getSumValue(int V1, int V2) {
		// int startNo = (V1 > V2) ? V2 : V1; >> 조건이 만족하면 ':'앞의 변수를 ,아니면 ':'뒤의 변수를 넣어라
		// int endno = (V1 > V2) ? V1 : V2; >> 위와 반대
		//			(if, for을 사용할 경우)
		//			if (n1 > n2) {
		//			for (int i = V1; i >= V2; i++) {
		//				sum = sum + i;
		//			} else {
		//			
		//		}

		int sum = 0;
		for (int i = V1; i <= V2; i++) {
			sum = sum + i;
		}
		return sum;
	}

}