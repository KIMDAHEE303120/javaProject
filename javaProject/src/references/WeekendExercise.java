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
				System.out.println("학생수 >");
				studentNum = scn.nextInt();
				students = new int[studentNum][2];
			} else if (menu == 2) { // 점수입력
				for (int i = 0; i < students.length; i++) {
					for (int j = 0; j < 2; j++) {
						System.out.println("학생번호>> ");
						students[i][j] =  scn.nextInt();
						System.out.println("영어점수> ");
						students[i][j] = scn.nextInt();
						System.out.println("수학점수> ");
						students[i][j] = scn.nextInt();
					}
				}

			} else if (menu == 3) {
				for (int i = 0; i < students.length; i++) {
					for (int j = 0; j < students.length; j++) {
						System.out.println("학생정보 - 번호: " + students[i][j] + ", 영어: " + students[i][j] + ", 수학: " + students[i][j]);
					}
				}
			} else if (menu == 4) {
				

			} else if (menu == 5) {

			} else if (menu == 6) {

			} else if (menu == 7) {

			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

}
