package com.yedam.diary;

//열거형 타입... 메뉴 구성....
public enum Menu {
	종료(0), 추가(1), 수정(2), 삭제(3), 전체조회(4), 날짜검색(5), 내용검색(6);

	private int value;

	private Menu(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static Menu getMenu(int m) {
		Menu em = null;
		for (Menu menu : Menu.values()) {
			if (menu.getValue() == m) {
				em = menu;
				break;
			}
		}
		return em;
	}
	

}