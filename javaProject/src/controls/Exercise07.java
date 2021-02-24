package controls;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);//ctrl+shift+o = import 단축키
		
		while(run) {
			System.out.println("--------------------");
			System.out.println("1. 예금| 2. 출금| 3. 잔고| 4. 종료");
			System.out.println("--------------------");
//			System.out.print("선택>");
			int menu = scn.nextInt(); //숫자값 읽어온다.
			if (menu == 1) { //예금기능
				System.out.println("입금액을 입력하세요.");
				balance = balance + scn.nextInt();//사용자입력금액
			}else if (menu == 2) { //출금기능
				System.out.println("출금액을 입력하세요.");
				balance = balance - scn.nextInt();
			}else if (menu == 3) { //잔고기능
				System.out.println("잔액은" + balance);
			}else if (menu == 4) { //종료기능
				run = false;
			}

			
		}
	}

}
