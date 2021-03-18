package com.yedam.diary;

//구현담당...
public class DiaryApp {
	DAO dao; // 인터페이스 타입으로 선언

	public void start() {
		dao = new DiaryListDAO();
//		dao = new DiaryOracleDAO();

		// 파일 입출력으로 ..
		int menuNum = 0;
		do {
			menuPrint();
			menuNum = menuChoose();

			process(menuNum);

		} while (menuNum != 0);
		System.out.println("end");
	} // end of start

	// 메뉴를 출력하는 기능
	public void menuPrint() {
		Menu[] arr = Menu.values();
		int i = 0;
		for (Menu menu : arr) {
			System.out.print(String.format("%d: %s ", i, menu.name()));
			i++;
		}
		System.out.println();
	}

	// 메뉴 선택하는 기능
	public int menuChoose() {
		int menuSize = Menu.values().length - 1;
		int menuNum;// = stdInputUtil.readInt();
		do {
			menuNum = StdInputUtil.readInt();
			if (menuNum <= menuSize && menuNum >= 0)
				break;
			System.out.println(menuSize + " 까지만 입력이 가능합니다.");
		} while (true);

		return menuNum;
	} // end of menu choose

	// 메뉴 실행
	public void process(int menuNum) {
		Menu menu = Menu.getMenu(menuNum);
		switch (menu) {
		case 종료:	exit(); 		break;
		case 추가:	insert();		break;
		case 수정:	update();		break;
		case 삭제:	delete();		break;
		case 전체조회:	selectAll();	break;
		}
		
	} // end of process

	// 종료
	public void exit() {
		System.out.println("종료선택 >>");
	}

	// 추가
	public void insert() {
		System.out.println("입력선택 >>");
		System.out.println("날짜: [yyMMdd]");
		String wdate =StdInputUtil.readDate();
		System.out.println("내용: ");
		String contents = StdInputUtil.readMultiLine();
		
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		int cnt = dao.insert(vo);
		System.out.println(cnt + "건 입력완료.");
	}

	// 수정
	public void update() {
		System.out.println("수정선택 >>");
		System.out.println("날짜: [yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("내용: ");
		String contents = StdInputUtil.readMultiLine();
		
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		dao.update(vo);		
		System.out.println("수정됨.");
	}

	// 삭제
	public void delete() {
		System.out.println("삭제선택 >>");
		System.out.println("날짜: [yyMMdd]");
		String wdate = StdInputUtil.readDate();
		int r = dao.delete(wdate);
		System.out.println(r + "건 삭제됨.");
	}

	// 전체조회
	public void selectAll() {
		System.out.println("전체조회선택 >>");
		for(DiaryVO vo : dao.selectAll()) {
			System.out.println(vo.getWdate());
			System.out.println(vo.getContents());
		}
	}

} // end of class
