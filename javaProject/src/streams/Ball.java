package streams;

import java.util.Random;
import java.util.Scanner;

public class Ball {
	public static void main(String[] args) {
		int[] randomNo = new int[3];
		boolean r = true;
		int[] selectNo = new int[3];
		Scanner scn = new Scanner(System.in);

		while (true) {
			if (r) {
				System.out.print("랜덤숫자: ");
				for (int i = 0; i < 3; i++) {
					randomNo[i] = (int) (Math.random() * 9) + 1;
					System.out.print(randomNo[i] + " ");
				}
				System.out.println();
				r = false;
			}
			System.out.print("1번 숫자: ");
			selectNo[0] = scn.nextInt();
			System.out.print("2번 숫자: ");
			selectNo[1] = scn.nextInt();
			System.out.print("3번 숫자: ");
			selectNo[2] = scn.nextInt();

			int ball = 0, strike = 0;
			for (int i = 0; i < randomNo.length; i++) {
				if (randomNo[i] == selectNo[i]) {
					strike++;
				}
				for (int j = 0; j < selectNo.length; j++) {
					if (randomNo[i] == selectNo[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println("ball: " + ball + ", strike: " + strike);

			if (strike == 3) {
				System.out.println("~~~~~~정답~~~~~~");
				System.out.println("===============\n");
				r = true;
			}
			
		} //end of while
	}
}