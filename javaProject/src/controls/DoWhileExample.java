package controls;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		// System.in.read(); > KeyCode 반환
		// Scanner.readLine();
		// System.out.println(); //기본으로 제공하는 패키지이기 때문에 import 안해도 사용 가능

		Scanner scn = new Scanner(System.in); // class는 new
		System.out.println("값을 입력.");
		String str = scn.nextLine(); //next line에 입력할 값을 넣으면 값이 출력됨
		System.out.println("입력한 값은: " + str);
		
//		boolean run = true;  >> boolean으로 입력해서 if run=false 만들어도 됨
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>> " + str);
//			if(str.equals("q")) {
//				run = false; (== 'break;' 사용 가능) >> while=run으로 작성
//			}
		} while(!str.equals("q"));   //!=not
			
		System.out.println("프로그램 종료.");
	}

}
