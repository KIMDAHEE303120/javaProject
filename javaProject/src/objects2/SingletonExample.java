package objects2;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Book b1 = new Book("자바", "저자" ,"출판사", 1000);
		Book b2 = new Book("자바", "저자" ,"출판사", 1000);
		
		
		//메모리의 위치를 비교하는 것
		System.out.println(s1==s2); // >>true: 같은 위치 singleton 클래스안에서 하나의 인스턴스 
		System.out.println(b1==b2); // Book안에서 여러개의 인스턴스를 만들어서 처리
		
	}

}
