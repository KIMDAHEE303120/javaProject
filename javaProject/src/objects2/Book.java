package objects2;

public class Book {

	// 속성(필드)
	private String bookTitle;
	private String bookWriter;
	private String bookPublisher;
	int BookPrice;

	// 생성자
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
	
}
