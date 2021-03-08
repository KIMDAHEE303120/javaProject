package inheritances;

import java.util.Scanner;

public class FriendList {
	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {

		// Scanner
		// 1.친구 2.힉교친구 3.회사친구 4.전체목록 5. 친구이름 검색..
//		friends[0] = new Friend("임성원", "01012345678");
//		friends[1] = new ComFriend("정준영", "01012123434", "총무부");
//		friends[2] = new UnivFriend("도왕락", "01045456767", "역사학과");
//		for (Friend friend : friends) {
//			if (friend != null) {
//				System.out.println(friend.toString());
//			}
//		}
		Scanner scn = new Scanner(System.in);

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
				Friend friend = new Friend(name, phone);
				saveFriend(friend);

				System.out.println();

			} else if (selectNo == 2) {
				System.out.println("학교친구를 입력하세요");
				System.out.print("친구이름> ");
				String name = scn.next();
				System.out.print("전화번호> ");
				String phone = scn.next();
				System.out.print("학과이름> ");
				String major = scn.next();
				saveFriend(new UnivFriend("", "", ""));

				System.out.println();

			} else if (selectNo == 3) {
				System.out.println("회사친구를 입력하세요");
				System.out.print("친구이름> ");
				String name = scn.next();
				System.out.print("전화번호> ");
				String phone = scn.next();
				System.out.print("부서이름> ");
				String department = scn.next();
				saveFriend(new ComFriend("", "", ""));

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
				String fridname = scn.next();
				for (Friend friend : friends) {
					if (friend != null && friend.getName().equals(fridname)) {
						System.out.println("친구정보: " + friend.toString());
					}

				}

			} else if (selectNo == 6) {
				run = false;
			}
			System.out.println("프로그램 종료");
		}
	}

	public static void saveFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
			}
		}
	} // end of class
}