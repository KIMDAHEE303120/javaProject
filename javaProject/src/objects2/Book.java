package objects2;

public class Book {

	// 속성(필드)
	private String bookTitle;
	private String bookWriter;
	private String bookPublisher;
	int BookPrice;

	// 생성자
	public Book() {
	}

	public Book(String bookTitle, String bookWriter, String bookPublisher, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookWriter = bookWriter;
		this.bookPublisher = bookPublisher;
		BookPrice = bookPrice;
	}

	// 기능(메소드)
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public int getBookPrice() {
		return BookPrice;
	}

	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}

	// LibraryApp 속성
	Book[] bookList = new Book[10];

	public void getBookInfo() {
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i] != null) {
				//System.out.print(bookList[i].getBookTitle() + "/");
				System.out
				.print("책이름: " + bookTitle + ", 저자: " + bookWriter + ", 출판사: " + bookPublisher + ", 가격: " + BookPrice);
			} else {
				
			} break;
		} 

	}

	// LibraryApp 도서목록
//	public String getBookInfo() {
//		String result = "";
//		result = BookList;
//		for (int i = 0; i < rentBooks.length; i++) {
//			if (rentBooks[i] != null) {
//				result =result + "/" + rentBooks[i].getBookTitle();
//			}
//		}
//		return result;
//	}

}
