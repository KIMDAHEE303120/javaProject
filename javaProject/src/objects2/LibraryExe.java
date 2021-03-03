package objects2;

public class LibraryExe {
	public static void main(String[] args) {

		Book book1 = new Book("자바", "저자1", "출판사1", 10000);
		Book book2 = new Book("HTML", "저자2", "출판사2", 20000);
		Book book3 = new Book("CSS", "저자3", "출판사3", 30000);
		Book book4 = new Book("자바스크립트", "저자4", "출판사4", 40000);
		Member mem1 = new Member("s111", "박효정");
		mem1.rent(book1);
		mem1.rent(book2);
		mem1.overdue(book2);

		
		

		// getBookInfo 1)
		mem1.getBookInfo();

		
		System.out.println("");
		System.out.println("");
		
		// getBookInfo 2)
		String str =  mem1.getBookInfo2();
		System.out.println(str);

		Member mem2 = new Member("a222", "김한설");
		mem2.rent(book3);
		mem2.rent(book4);
		System.out.println("");
		System.out.println("");
		mem2.getBookInfo();

	}

}
