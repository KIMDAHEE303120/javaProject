package references;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		int result = 0;

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = studentNum + scanner.nextInt();

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println(scores[i] + ">");
					scores[i] = scanner.nextInt();

				}
			} else if (selectNo == 3) {
				System.out.println();

			} else if (selectNo == 4) {
				System.out.println("");

			} else if (selectNo == 5) {
				run = false;
			}

		}

		System.out.println("프로그램 종료");

	}

}
