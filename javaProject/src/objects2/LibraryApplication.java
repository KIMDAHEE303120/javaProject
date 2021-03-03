package objects2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		// 도서대여 클래스
		// 1)도서정보입력>>배열에 제목, 저자, 출판사, 가격을 순서대로 작성
		// 2)회원정보>>이름, ID(5개)
		// 3)도서대여>> 책제목을 찾아서 회원의 rent에 담아서
		// 4)도서반납>> overdue 책제목 찾아서 빼주고
		// 5)grtBookInfo()로 정보 보여주기>>도서 목록

		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.도서정보등록 2.회원정보등록 3.도서대여 4.도서반납 5.도서목록 9.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.print("도서정보등록>> ");
				bookList = scn.nextLine("","","");
				Book book2 = new Book("HTML", "저자2", "출판사2", 20000);
				Book book3 = new Book("CSS", "저자3", "출판사3", 30000);
				Book book4 = new Book("자바스크립트", "저자4", "출판사4", 40000);
2
			} else if (selectNo == 2) {
				System.out.print("회원정보등록>> ");


			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {

			} else if (selectNo == 9) {
				break;
			}

		}

		System.out.println("종료");

	}

}
