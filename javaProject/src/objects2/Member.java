package objects2;

public class Member {
	// 속성(필드)
	private String memberId;
	private String memberName;
//	private Book[] rentBooks = new Book[3]; // Book인스턴스를 담을 수 있는 배열 선언 (mem이 책 3권까지 허용)
	private Book[] rentBooks = new Book[5]; // LibraryApp에서 5개까지 렌트를 하겠다

	// 생성자
	public Member() {
		
	}
	
	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// 기능(메소드)
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void rent(Book book) { // 배열'Book'에다가 변수'book'
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Book book) { // 배열을 빼주는 방법= 해당 배열을 null로 만듦
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBookTitle().equals(book.getBookTitle())) {// 책이름이 문자열이기 때문에 .equals()로 같은 값을 찾도록 해줘야함
				rentBooks[i] = null;
				break;
			}
		}

	}
// getBookInfo 1)
	
	void getBookInfo() {
		System.out.print("회원ID: " + memberId + ", 회원이름: " + memberName + ", 책 이름: ");
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				System.out.print(rentBooks[i].getBookTitle() + "/");
			}
		}

	}

	
// getBookInfo 2)
	public String getBookInfo2() {
		String result = "";
		result = memberName;
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				result =result + "/" + rentBooks[i].getBookTitle();
			}
		}
		return result;
	}

}
