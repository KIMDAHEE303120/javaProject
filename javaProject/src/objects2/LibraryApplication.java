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
				System.out.println("도서정보등록>> ");
				
				System.out.print("책이름: ");
				String title = scn.next();
				System.out.print("저자: ");
				String writer = scn.next();
				System.out.print("출판사: ");
				String publisher = scn.next();
				System.out.print("가격: ");
				String price = scn.next();

				for (int i = 0; i < bookList.length; i++) {
					if(bookList[i] == null) {
						//bookList[i] = "책이름: " title", 저자: " + writer + ", 출판사: " + publisher + ", 가격: " + price;
					}

				}
				
			} else if (selectNo == 2) {
				System.out.println("회원정보등록>> ");
				System.out.print("회원ID: ");
				String id = scn.next();
				System.out.print("회원이름: ");
				String name = scn.next();

			} else if (selectNo == 3) {
				System.out.println("도서대여>> ");

			} else if (selectNo == 4) {
				System.out.println("도서반납>> ");

			} else if (selectNo == 5) {
				System.out.println("도서목록>> ");
				System.out.println(/* getBookInfo() */);

			} else if (selectNo == 9) {
				break;
			}

		}

		System.out.println("종료");

	}

}
