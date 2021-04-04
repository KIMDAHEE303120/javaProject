package study;

import java.util.Scanner;

public class Play {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count = 0;

		while (true) {
			if (count != 3) {
				System.out.println("바위: 1 | 가위: 2 | 보: 3");
				System.out.print("선택하세요>> ");
				int inputNum = scn.nextInt();
				int random = (int) (Math.random() * 3) + 1;

				if (inputNum == random) {
					System.out.println("비겼습니다~\n");
				} else if (inputNum == 1 && random == 2 
						|| inputNum == 2 && random == 3
						|| inputNum == 3 && random == 1) 
				{
					System.out.println("이겼습니다~~!");
					count++;
					System.out.println(count + "번 이겼어요\n");
				} else {
					System.out.println("졌어요,,,,\n");
				}
			} else {
				break;
			}
		}
	}
}
