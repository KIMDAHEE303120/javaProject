package inheritances;

import java.util.Scanner;

import objects2.Account2;

public class FriendListScanner {
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.친구 | 2.학교친구 | 3.회사친구 | 4.전체목록 | 5. 친구 검색 | 6. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print(" 선택 > ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.println("친구를 입력하세요");
				System.out.print("친구이름> ");
				String name = scn.nextLine();
				System.out.print("전화번호> ");
				String phone = scn.nextLine();
				for (int i = 0; i < 10; i++) {
					if (friends[i] == null) {
						friends[i] = new Friend(name, phone);
						break;
					}
				}
				System.out.println();

			} else if (selectNo == 2) {
				System.out.println("학교친구를 입력하세요");
				System.out.print("친구이름> ");
				String name = scn.next();
				System.out.print("전화번호> ");
				String phone = scn.next();
				System.out.print("학과이름> ");
				String major = scn.next();
				for (int i = 0; i < 10; i++) {
					if (friends[i] == null) {
						friends[i] = new UnivFriend(name, phone, major);
						break;
					}
				}
				System.out.println();

			} else if (selectNo == 3) {
				System.out.println("회사친구를 입력하세요");
				System.out.print("친구이름> ");
				String name = scn.next();
				System.out.print("전화번호> ");
				String phone = scn.next();
				System.out.print("부서이름> ");
				String department = scn.next();
				for (int i = 0; i < 10; i++) {
					if (friends[i] == null) {
						friends[i] = new ComFriend(name, phone, department);
						break;
					}
				}
				System.out.println();

			} else if (selectNo == 4) {
				System.out.println("전체 친구목록");
				for (int i = 0; i < 10; i++) {
					if (friends[i] != null) {
						System.out.println(friends[i].toString());
					}
				}

			} else if (selectNo == 5) {
				System.out.println("검색할 친구를 입력하세요");
				System.out.print("친구이름> ");
				String name = scn.next();
				for (int i = 0; i < 10; i++) {
					if (friends[i] != null && friends[i].getName().equals(name)) {
						System.out.println(friends[i].toString());
					}

				}

			} else if (selectNo == 6) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

}
