package objects2;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Student[] std = new Student[10];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.학생정보 등록 | 2.학생정보 수정 | 3.학생정보 삭제 | 4.리스트조회 | 5.종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택 > ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("학생정보 등록");

				System.out.print("학번: ");
				int studentNo = scn.nextInt();
				System.out.print("이름: ");
				String name = scn.next();
				System.out.print("영어점수: ");
				int engScore = scn.nextInt();
				System.out.print("수학점수: ");
				int mathScore = scn.nextInt();

				for (int i = 0; i < std.length; i++) {
					if (std[i] == null) {
						std[i] = new Student(studentNo, name, engScore, mathScore);
						break;
					}
				}

			} else if (menu == 2) {
				System.out.println("학생정보 수정");
				System.out.print("학번 : ");
				int studentNo = scn.nextInt();
				System.out.print("영어점수 수정: ");
				int engScore = scn.nextInt();
				System.out.print("수학점수 수정: ");
				int mathScore = scn.nextInt();

				for (int i = 0; i < std.length; i++) {
					if (std[i] != null && std[i].getStudentNo() == studentNo) {
						std[i].setEngScore(engScore);
						std[i].setMathScore(mathScore);
						break;
					}
				}

			} else if (menu == 3) {
				System.out.println("학생정보 삭제");
				System.out.print("학번 : ");
				int studentNo = scn.nextInt();

				for (int i = 0; i < std.length; i++) {
					if (std[i] != null && std[i].getStudentNo() == studentNo) {
						std[i] = null;
						break;
					}
				}

			} else if (menu == 4) {
				System.out.println("리스트조회");
				for (int i = 0; i < std.length; i++) {
					if (std[i] != null) {
						std[i].getInfo();
					}
				}
			} else if (menu == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
