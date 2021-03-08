package abstractClasses;

import java.util.Calendar;

import objects.Cal;

public class CalendarExe {

	public static void main(String[] args) {
		// 달력만들기
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.getActualMaximum(Calendar.DATE));
//		System.out.println("--------------------------------------");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.printf("%3d", 9); // d = 숫자타입
//		System.out.printf("%3d", 10);
//		System.out.printf("%5s", "sun"); // s = 문자타입
//		System.out.printf("%5s", "Mond");

//		for (int i = 1; i <= lastDate; i++) {
//		System.out.printf("%3s", i);
//		if (i % 7 == 0) {
//			System.out.println("");
//		}
//	}

//	System.out.println();
//	for (int i = 1; i < cal.getActualMaximum(Calendar.DATE); i++) {
//		System.out.printf("%5d", i);
//		if (i % 7 == 0) {
//			System.out.println("");
//		}
//	}

		Calendar cal = Calendar.getInstance();
		cal.set(2021, 6, 1); // cal변수값 > 2021년 5월 1일
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < lastDate + firstDay; i++) { // 공백이 들어간만큼 i값 늘리기
			if (i < firstDay) {
				System.out.printf("%3s", " ");
			} else {
				System.out.printf("%3s", i - (firstDay - 1));
			}
			if (i % 7 == 0) {
				System.out.println("");
			}

		} // end of for
		System.out.println("---------------------");
		showcal(2021, 4);
	} // end of main

	public static void showcal(int year, int month) {
		// 해당년월의 달력을 생성해서 보여주는 메소드

		Calendar cal = Calendar.getInstance();

		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < lastDate + firstDay; i++) { // 공백이 들어간만큼 i값 늘리기
			if (i < firstDay) {
				System.out.printf("%3s", " ");
			} else {
				System.out.printf("%3s", i - (firstDay - 1));
			}
			if (i % 7 == 0) {
				System.out.println("");
			}

		}

	}

}
