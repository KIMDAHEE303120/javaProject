package study;

import java.util.Scanner;

public class WordChainGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String game = "만식";
		int count = 0;
		String[] gameArr = new String[100];
		int size = 0;
		boolean sameString = false;

		while (true) {
			System.out.println(" ~~WordChainGame~~ ");
			System.out.print(game + " >> ");
			String inputString = scn.nextLine();
			char first = inputString.charAt(0);
			char last = game.charAt(game.length() - 1);
			if (first == last) {
				game = inputString;
				gameArr[size] = inputString;
				size++;
				for (int i = 0; i < size - 1; i++) {
					if (gameArr[i].equals(inputString)) {
						sameString = true;
						System.out.println("이미 했던거잖아,,, 다른 단어 해,,,\n");
						game = gameArr[size-2];
						break;
					}
				}
			} else {
				count++;
				System.out.println("틀렸어.. 다시..");
				System.out.println(count + "회 틀림\n");
//				System.out.println("게임 끝~~");
//				break;				
			}
			if (count == 3) {
				System.out.println("게임 끝~~");
				break;
			}
			if (sameString == true) {
				size--;
			}
		}
	}
}
