package study;

public class Star {
	public static void main(String[] args) {
		// 삼각형
//		String[][] star = new String[5][5];
//
//		for (int i = 0; i < star.length; i++) {
//			star[i][0] = "*";
//			for (int j = 0; j < star.length; j++) {
//				System.out.println(star[i][j]);
//			}
//		}

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i >= j) {
//					System.out.print("*");
//				}				
//			}
//			System.out.println();
//		}

		// 트리모양
//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 9; j > 2 * i + 1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}

		//다이아몬드
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		for (int i = 1; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 2 * num - 1; j > 2 * i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// 대각선
//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print("");
//			}
//			for (int j = 0; j < 2 * i + 1; j++) {
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}
//		

		// 모래시계
//		int start = 0, end = 10;
//		for (int i = 0; i < 9; i++) {
//			if (i < 10 / 2) {
//				start = i;
//				end--;
//			} else {
//				start--;
//				end++;
//			}
//			for (int j = start; j > 0; j--) {
//				System.out.print("");
//			}
//			for (int j = start; j < end; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
	}
}
