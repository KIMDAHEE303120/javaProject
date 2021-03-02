package references;

import java.util.Scanner;

public class WeekendExercise {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int studentNum = 0;
		boolean run = true;
		while (true) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계 7.수학평균점이상 9.종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print(" 선택 > ");

			// 1)이미 입력한 경우에 이미 입력했다는 메시지 보여주고 메뉴를 화면에 보여주는 기능
			int menu = scn.nextInt();
			if (menu != 1 && students == null) {
				System.out.println("학생수를 먼저 입력하세요");
				System.out.println();
				continue;
			} // end of 1)

			if (menu == 1) { // 학생수
				System.out.print("학생수 > ");
				studentNum = scn.nextInt();
				students = new int[studentNum][3];
			} else if (menu == 2) { // 점수입력
				for (int i = 0; i < students.length; i++) {
					System.out.print("학생번호>> ");
					students[i][0] = scn.nextInt();
					System.out.print("영어점수> ");
					students[i][1] = scn.nextInt();
					System.out.print("수학점수> ");
					students[i][2] = scn.nextInt();
				}
			} else if (menu == 3) {
				for (int i = 0; i < students.length; i++) {
					System.out.println(
							"학생정보 - 번호: " + students[i][0] + ", 영어: " + students[i][1] + ", 수학: " + students[i][2]);
				}
			} else if (menu == 4) {
				System.out.print("찾고자 하는 학생번호 입력> ");
				int find = scn.nextInt();
				for (int i = 0; i < students.length; i++) {
					if (students[i][0] == find) {
						System.out.println(
								"번호: " + students[i][0] + ", 영어: " + students[i][1] + ", 수학: " + students[i][2]);
					}
				}
			} else if (menu == 5) {
				int maxValue = 0;
				int maxStd = 0;
				// int i = 0;
				for (int i = 0; i < students.length; i++) {
					if (students[i][1] > maxValue) {
						maxValue = students[i][1];
						maxStd = students[i][0];
					}
				}
				System.out.println("영어최고점> 학생번호: " + maxStd + " 영어점수: " + maxValue);
			} else if (menu == 6) {
				double maxAvg = 0.0;
				int maxSum = 0;
				int sum = 0;
				for (int i = 0; i < students.length; i++) {
					sum = students[i][1] + students[i][2];
					if (sum / 2 > maxAvg) {
						maxAvg = (double) sum / 2;
						maxSum = students[i][0];
					}
				}
				System.out.println("학생번호: " + maxSum + ", 평균점수: " + maxAvg);
			} else if (menu == 7) {
				double mathAvg = 0.0;
				int sum = 0;
				int maxValue = 0;
				for (int i = 0; i < students.length; i++) {
					sum += students[i][2];
				}
				mathAvg = (double) sum / students.length;
				System.out.println("평균점수: " + mathAvg);

				for (int i = 0; i < students.length; i++) {
					if (students[i][2] > mathAvg) {
						mathAvg = students[i][2];
						System.out.println("학생번호: " + students[i][0] + ", 수학점수: " + students[i][2]);
					}
				}

			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

}
